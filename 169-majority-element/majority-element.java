import java.util.HashMap;

class Solution {
    public int majorityElement(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int n = nums.length;

        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);

            // If this number appears more than n/2 times, return it
            if (map.get(num) > n / 2) {
                return num;
            }
        }

        // This line will never be reached (problem guarantees a majority element)
        return -1;
    }
}
