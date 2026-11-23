class Solution {
    public boolean hasDuplicate(int[] nums) {
        boolean ret=false;
        Set<Integer> duplicates = new HashSet<>(); 
        for(int n:nums){
            if (duplicates.contains(n)){
                ret= true;
             }
            duplicates.add(n);   
        }
        return ret;
    }
}