class Solution {
    void swap(int[] nums, int currentPos, int actualPos){ // currentPos = current Position
        nums[currentPos] = nums[actualPos];
        nums[actualPos] = actualPos + 1;
    }
    
    public int firstMissingPositive(int[] nums) {
        int i = 0, actualPos; // i = index
        while(i < nums.length){
            actualPos = nums[i] - 1;
            if(actualPos >= 0 && actualPos < nums.length && nums[actualPos] != actualPos + 1){ 
                // actualPos >= 0 means nums[i] > 0 and we will only swap positive values
                // if actualPos is greater than max index we cannot place it
                // if actualPos already has actual number we will do nothing
                swap(nums, i, actualPos);
            }
            else
                i++;
        }
        
        for(i = 0; i < nums.length; i++){
            if(nums[i] != i+1)
                return i+1;
        }
        
        return i+1;
    }
}
