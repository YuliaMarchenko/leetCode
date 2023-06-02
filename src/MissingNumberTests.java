import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MissingNumberTests {

    @Test
    public void missingNumberFromThreeTest(){
        int [] nums = new int [] {3,0,1};
        Assertions.assertEquals(new MissingNumber().missingNumber(nums), 2);
    }

    @Test
    public void missingNumberFromTwoTest(){
        int [] nums = new int [] {0,1};
        Assertions.assertEquals(new MissingNumber().missingNumber(nums), 2);
    }

    @Test
    public void missingNumberFromNineTest(){
        int [] nums = new int [] {9,6,4,2,3,5,7,0,1};
        Assertions.assertEquals(new MissingNumber().missingNumber(nums), 8);
    }
}
