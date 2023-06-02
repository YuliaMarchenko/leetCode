import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;

public class FindAllNumbersDisappearedInAnArrayTests {

    @Test
    public void missingTwoNumbersTest() {
        int[] nums = new int[]{4, 3, 2, 7, 8, 2, 3, 1};
        Assertions.assertEquals(new FindAllNumbersDisappearedInAnArray().findAllNumbersDisappearedInAnArray(nums),
                new ArrayList<Integer>(Arrays.asList(5,6)));
    }

    @Test
    public void missingOneNumberTest() {
        int[] nums = new int[]{1, 1};
        Assertions.assertEquals(new FindAllNumbersDisappearedInAnArray().findAllNumbersDisappearedInAnArray(nums),
                new ArrayList<Integer>(Arrays.asList(2)));
    }

    @Test
    public void missingTwoNumbers2Test() {
        int[] nums = new int[]{4, 3, 2, 7, 8, 2, 3, 1};
        Assertions.assertEquals(new FindAllNumbersDisappearedInAnArray().findAllNumbersDisappearedInAnArray2(nums),
                new ArrayList<Integer>(Arrays.asList(5,6)));
    }

    @Test
    public void missingOneNumber2Test() {
        int[] nums = new int[]{1, 1};
        Assertions.assertEquals(new FindAllNumbersDisappearedInAnArray().findAllNumbersDisappearedInAnArray2(nums),
                new ArrayList<Integer>(Arrays.asList(2)));
    }
}
