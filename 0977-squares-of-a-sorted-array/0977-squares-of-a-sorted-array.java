class Solution {
    public int[] sortedSquares(int[] nums) {
        int l=0;
        int r=nums.length-1;
        int arr[] = new int [nums.length];
        int k = arr.length-1;
        while(l<=r){
            if (Math.abs(nums[l])>Math.abs(nums[r])){
                int square = nums[l]*nums[l];
                arr[k]= square;
                l++;
                k--;
            }
            else {
                int square = nums[r]*nums[r];
                arr[k]= square;
                r--;
                k--;
            }
        }
        return arr;
    }
    
}