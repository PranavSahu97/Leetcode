class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        if(nums == null || nums.length ==0){
            return nums;
        }
        int count=0;
        int [] res = new int [nums.length];
        for(int i=0;i<nums.length;i++){
            for(int j=0; j<nums.length;j++){
                if(nums[j] < nums[i]){
                    count++;
                }
            }
            res[i] = count;
            count=0;
        }
        return res;
        
    }
}