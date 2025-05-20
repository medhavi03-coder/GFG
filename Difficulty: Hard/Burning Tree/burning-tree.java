/*
class Node {
    int data;
    Node left;
    Node right;

    Node(int data) {
        this.data = data;
        left = null;
        right = null;
    }
}  */
class Solution {
    
    // Node class is assumed to be defined with int data, Node left, and Node right
    
    // Method to map each node to its parent
    private static void mapParents(Node root, Map<Node, Node> parentMap, Node[] targetNodeHolder, int target) {
        Queue<Node> queue = new LinkedList<>();
        queue.offer(root);
        
        while (!queue.isEmpty()) {
            Node curr = queue.poll();
            if (curr.data == target) {
                targetNodeHolder[0] = curr;
            }
            if (curr.left != null) {
                parentMap.put(curr.left, curr);
                queue.offer(curr.left);
            }
            if (curr.right != null) {
                parentMap.put(curr.right, curr);
                queue.offer(curr.right);
            }
        }
    }

    // Method to simulate fire spread using BFS and return time taken
    private static int burnTree(Node target, Map<Node, Node> parentMap) {
        Queue<Node> queue = new LinkedList<>();
        Set<Node> visited = new HashSet<>();

        queue.offer(target);
        visited.add(target);

        int time = 0;

        while (!queue.isEmpty()) {
            int size = queue.size();
            boolean burned = false;

            for (int i = 0; i < size; i++) {
                Node curr = queue.poll();
                
                Node[] neighbors = { curr.left, curr.right, parentMap.get(curr) };
                for (Node neighbor : neighbors) {
                    if (neighbor != null && !visited.contains(neighbor)) {
                        visited.add(neighbor);
                        queue.offer(neighbor);
                        burned = true;
                    }
                }
            }

            if (burned) {
                time++;
            }
        }

        return time;
    }

    public static int minTime(Node root, int target) {
        Map<Node, Node> parentMap = new HashMap<>();
        Node[] targetNodeHolder = new Node[1]; // Holder for target node reference
        mapParents(root, parentMap, targetNodeHolder, target); // Step 1: Build parent map and find target node
        return burnTree(targetNodeHolder[0], parentMap);        // Step 2: Simulate fire spread
    }
}
