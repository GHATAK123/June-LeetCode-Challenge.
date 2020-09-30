class Solution {
    public boolean isPowerOfTwo(int n) {
        if (n == 0) 
            return false; 
          
        while (n != 1) 
        { 
            if (n % 2 != 0) 
                return false; 
            n = n / 2; 
        } 
        return true;
        
    }
}



## New Solution in java

public boolean isPowerOfTwo(int n) {

    int log=(int)(Math.round(Math.log10(n)/Math.log10(2)));
    
    return (Math.pow(2,log)==n);
}

## Java Solution using Bit Manipulation

public boolean isPowerOfTwo(int n) {
        return (n>0 && (n & (n-1))==0);
}
