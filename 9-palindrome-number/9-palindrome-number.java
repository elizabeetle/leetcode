class Solution {
    public boolean isPalindrome(int x) {
        
        //using two pointers, compare two points; moving from front and back towards middle
        //if matching, move to next pair
        //if not matching, false
        
        char[] nums = String.valueOf(x).toCharArray();
        
        int pointer = 0;
        int pointer2 = nums.length - 1;
        
        while(pointer < pointer2){
            if(nums[pointer] != nums[pointer2])
                return false;
            else
                pointer +=1;
                pointer2 -=1;
        }
        
        return true;
    }
}