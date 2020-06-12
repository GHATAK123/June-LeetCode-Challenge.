class Solution {
    public boolean isSubsequence(String s, String t) {
        int m=s.length();
        int n=t.length();
        int j = 0; 
          
      
        for (int i = 0; i < n && j < m; i++) 
            if (s.charAt(j) == t.charAt(i)) 
                j++; 
  
   
        return (j == m);
        
    }
}
