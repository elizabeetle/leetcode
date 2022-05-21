class Solution {
    public boolean isPalindrome(int x) {

//using two pointers, compare the beginning number to the ending number
//transform the int into a char[]
        
        char[] nums = String.valueOf(x).toCharArray();
        
        int pointerIndex = 0;
        int pointer2Index = nums.length - 1;
        
        while(pointerIndex < pointer2Index){
            if(nums[pointerIndex] != nums[pointer2Index])
                return false;
            
            pointerIndex += 1;
            pointer2Index -= 1;
        }
        return true;
    }
}