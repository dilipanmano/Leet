class Solution {
    public int searchInsert(int[] nums, int target) {
        return recursive(0,nums.length-1,nums,target);
    }
    
    public int recursive(int low, int high, int[] nums, int target){
        int mid = low+(high-low)/2;
        if(low>high){
            return mid;
        }
        if(nums[mid]==target){
            return mid;
        }
        else if(nums[mid]>target){
            return recursive(low,mid-1,nums,target);
        }
        else{
            return recursive(mid+1,high,nums,target);
        }
    }
}
