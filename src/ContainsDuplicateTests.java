import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ContainsDuplicateTests {
    @Test
    public void сontainsOneDuplicateTest(){
        int [] nums = new int [] {1, 2, 3, 1};
        Assertions.assertTrue(new ContainsDuplicate().containsDuplicate(nums));
    }

    @Test
    public void notContainsDuplicateTest(){
        int [] nums = new int [] {1,2,3,4};
        Assertions.assertFalse(new ContainsDuplicate().containsDuplicate(nums));
    }

    @Test
    public void сontainsSomeDuplicateTest(){
        int [] nums = new int [] {1,1,1,3,3,4,3,2,4,2};
        Assertions.assertTrue(new ContainsDuplicate().containsDuplicate(nums));
    }
}
