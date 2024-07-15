class Solution {
    public void sortColors(int[] nums) {
        int red = 0, white = 0, blue = nums.length - 1;
        
        while (white <= blue) {
            if (nums[white] == 0) {
                swap(nums, red++, white++);
            } else if (nums[white] == 2) {
                swap(nums, white, blue--);
            } else {
                white++;
            }
        }
    }
    
    private void swap(int[] nums, int a, int b) {
        int temp = nums[a];
        nums[a] = nums[b];
        nums[b] = temp;
    }
}
