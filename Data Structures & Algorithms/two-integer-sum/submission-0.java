class Solution {
    public int[] twoSum(int[] nums, int target) {

        int temp=0;
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0; i<nums.length; i++){
            for(int j=i+1; j<nums.length; j++){
                if((nums[i]+nums[j])==target){
                    map.put(nums[i], i);
                    map.put(nums[j], j);
                    return new int[]{i,j};
                }
            }
            
        }
        return new int[0];
    }
}
