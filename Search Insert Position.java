class Solution {
    public int searchInsert(int[] A, int target) {
        int l = 0, r = A.length-1;
        while(l <= r){
            int mid = (l + r) / 2;
            if(A[mid] == target) return mid;
            else if(A[mid] > target) r = mid - 1;
            else l = mid + 1;
        }
        return l;
        
        
    }
}
