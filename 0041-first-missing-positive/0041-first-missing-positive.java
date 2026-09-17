class Solution {
    public int firstMissingPositive(int[] nums) {
        int n = nums.length;
        int i = 0;

        while (i < n) {
            int x = nums[i];
            
            if ( x >= 1 && x <=n && nums[i] != nums[x-1]) {
                int temp = nums[i];
                nums[i] = nums[x-1];
                nums[x-1] = temp;

            }
            else {
                i++ ;
            }
        }

        for (i =0; i <nums.length; i++) {
            if (nums[i] != i+1) {
                return(i+1);
            }
        }

        return(n+1);
        



    }
}