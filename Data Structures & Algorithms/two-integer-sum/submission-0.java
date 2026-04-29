class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> valueVsIndexMap = new HashMap<Integer,Integer>(nums.length);
        for(int i=0;i<nums.length ;i++){
            int complement = target-nums[i];
            if(valueVsIndexMap.containsKey(complement)){
                return new int[]{valueVsIndexMap.get(complement),i};
            }
            valueVsIndexMap.put(nums[i],i);
        }
        return new int[]{-1,-1};
    }
}
