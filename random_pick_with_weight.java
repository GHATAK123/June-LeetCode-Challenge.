class Solution {

    double[] prob;
    public Solution(int[] w) {
        prob = new double[w.length];
        double sum = (double) Arrays.stream(w).sum();
        for(int i = 0; i < w.length; i++) {
            w[i] += i == 0 ? 0 : w[i - 1]; 
            prob[i] = w[i] / sum;
        }
    }
    
    public int pickIndex() {
        return Math.abs(Arrays.binarySearch(prob, Math.random())) - 1;
    }
}

/**
 * Your Solution object will be instantiated and called as such:
 * Solution obj = new Solution(w);
 * int param_1 = obj.pickIndex();
 */
