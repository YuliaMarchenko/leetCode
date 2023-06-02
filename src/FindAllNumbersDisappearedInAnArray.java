import java.util.ArrayList;
import java.util.List;

/* Given an array nums of n integers where nums[i] is in the range [1, n],
return an array of all the integers in the range [1, n] that do not appear in nums.*/

public class FindAllNumbersDisappearedInAnArray {
    public List<Integer> findAllNumbersDisappearedInAnArray(int[] nums) {
        List<Integer> missingNumbers = new ArrayList<>();
        int lenght = nums.length;

        for (int i = 0; i < lenght; i++) {
            int index = Math.abs(nums[i]) - 1;
            if (nums[index] > 0) {
                nums[index] = -nums[index];
            }
        }

        for (int i = 0; i < lenght; i++) {
            if (nums[i] > 0) {
                missingNumbers.add(i + 1);
            }
        }

        return missingNumbers;
    }

    public List<Integer> findAllNumbersDisappearedInAnArray2(int[] nums) {
        List<Integer> numbers = new ArrayList<>();

        for (int i = 0; i < nums.length; i++) {
            numbers.add(i + 1);
        }

        for (int num : nums) {
            numbers.contains(num);
            numbers.remove(Integer.valueOf(num));
        }
        return numbers;
    }

}