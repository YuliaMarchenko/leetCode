/*Given an array nums of size n, return the majority element.

The majority element is the element that appears more than ⌊n / 2⌋ times.
You may assume that the majority element always exists in the array.*/

import java.util.Arrays;

public class MajorityElement {

    public int majorityElement(int[] nums) {
        Arrays.sort(nums);

        int count = 0;
        int maxCount = 0;
        int candidate = nums[0];

        for (int i = 0; i < nums.length - 1; i++) {

            if (nums[i] == nums[i + 1]) {
                count++;
            } else {
                if (count > maxCount) {
                    maxCount = count;
                    candidate = nums[i];
                }
                count = 0;
            }
        }
        if (count > maxCount) {
            candidate = nums[nums.length - 1];
        }
        return candidate;
    }

    public int majorityElementBoyerMooreVotingAlgorithm(int[] nums) {

        /*На каждом шаге выполняются следующие действия: если текущее значение переменной-счётчика равно нулю,
         то данный элемент последовательности записывается в первую переменную, а счётчик становится равен 1.
         Если же значение счётчика отлично от нуля, то текущий элемент последовательности сравнивается со значением,
         записанным в первую переменную. Если они совпадают, то счётчик увеличивается на 1, иначе — уменьшается на 1.*/

        int count = 0;
        int candidate = 0;

        for (int num : nums) {
            if (count == 0) {
                candidate = num;
            }

            if (num == candidate) {
                count++;
            } else {
                count--;
            }
        }
        return candidate;
    }
}
