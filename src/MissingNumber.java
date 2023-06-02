/* Given an array nums containing n distinct numbers in the range [0, n],
return the only number in the range that is missing from the array. */

import java.util.Arrays;

public class MissingNumber {

    public int missingNumber(int[] nums) {
        int length = nums.length;
        return (length * (length + 1) / 2) - Arrays.stream(nums).sum();
    }

}
