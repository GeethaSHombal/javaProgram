class Solution {
    public int removeElement(int[] nums, int val) {
        if(nums == null || nums.length == 0) {
            return 0;
        }
        int i = 0, j = nums.length -1;
        while(i<= j) {
            if (nums[i] == val) {
                if(nums[j] ==val) {
                    j--;
                    continue;
                }
                else {
                    nums[i] = nums[j];
                    j--;
                }
            }
            i++;
        }
        return i;
    }
}
