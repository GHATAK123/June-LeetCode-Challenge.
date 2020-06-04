class Solution {
    public void reverseString(char[] s) {
        char temp;
        int i=0;
        int j = s.length-1;
        while(i<j) {
            temp=s[i];
            s[i]=s[j];
            s[j]=temp;
            i++;
            j--;
        }
    }
}
