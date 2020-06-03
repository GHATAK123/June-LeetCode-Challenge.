class Solution {
    public int twoCitySchedCost(int[][] costs) {
        int m = 0;
        int n = costs.length / 2;
        for (int i = 0; i < 2 * n; i++)
               m += costs[i][0]; 

        int[] d = new int[2 * n];
        for (int i = 0; i < 2 * n; i++)
                d[i] = costs[i][1] - costs[i][0];

        Arrays.sort(d); 
        for (int i = 0; i < n; i++)
               m += d[i]; 

        return m;
        
    }
}
