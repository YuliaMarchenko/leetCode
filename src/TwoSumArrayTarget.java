/*Given an array of integers nums and an integer target,
return indices of the two numbers such that they add up to target.

You may assume that each input would have exactly one solution, and you may not use the same element twice.

You can return the answer in any order.*/

import java.util.HashMap;

public class TwoSumArrayTarget {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for(int i = 0; i < nums.length; i++){
            int subtractionAmount = target - nums[i];

            if(map.containsKey(subtractionAmount)){
                return new int[] {map.get(subtractionAmount), i};
            }

            map.put(nums[i], i);
        }

        return new int[] {0, 0};
    }
}
