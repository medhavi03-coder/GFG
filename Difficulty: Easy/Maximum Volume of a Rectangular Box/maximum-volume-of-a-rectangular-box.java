

class Solution {
    static long getVol(int A, int B) {
        // code here
        double l = (A - Math.sqrt(A * A - 24 * B)) / 12;
        double V = l * (B / 2.0 - l * (A / 4.0 - l));
        return (long)V;
    }
};