public class TwoSum
{
    public int[] twoSum(int[] nums, int target) {
        int length = nums.length;
        Map<Integer, Integer> numsToIndexMap = new HashMap<>();
        for ( int i=0;i<length;i++) {
            int difference = taget - nums[i];
            if(numsToIndexMap.containsKey(difference)) {
                return new int[] {i, numsToIndexMap.get(difference)};
            }
            numsToIndexMap.put(nums[i],i);
        }
        return new int[] {-1, -1};
    }
}

/* https://www.youtube.com/watch?v=UXDSeD9mN-k */