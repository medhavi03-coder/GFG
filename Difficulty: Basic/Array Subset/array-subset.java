
class Solution {
    public boolean isSubset(int a[], int b[]) {
        // Your code here
        Arrays.sort(a);
        Arrays.sort(b);
        int n = a.length;
        int m = b.length;
        int i = 0, j = 0;
        while (i < n && j < m) {
            if (a[i] == b[j]) {
                i++;
                j++;
            } else if (a[i] < b[j]) {
                i++;
            } else {
                return false;
            }

        }
        return (j==m);
    }
}
