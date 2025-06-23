class Solution {
    public int removeDuplicates(int[] nums) {
        int k = nums.length;
        for(int i=nums.length-1; i>0; i--){
            if(nums[i]==nums[i-1]){
                for(int j=i; j<k-1; j++){
                    nums[j]=nums[j+1];   
                }
                k--;
            }
        }
        return k;
    }
}