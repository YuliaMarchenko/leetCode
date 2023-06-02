import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SingleNumberTests {
    @Test
    public void singleNumberFromThreeTest(){
        int [] nums = new int [] {2,2,1};
        Assertions.assertEquals(new SingleNumber().singleNumber(nums), 1);
    }

    @Test
    public void singleNumberFromFiveTest(){
        int [] nums = new int [] {4,1,2,1,2};
        Assertions.assertEquals(new SingleNumber().singleNumber(nums), 4);
    }
}
