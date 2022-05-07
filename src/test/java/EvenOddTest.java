import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class EvenOddTest {
    @Test
    public void EvenOddTest(){
        EvenOdd EvenOdd = new EvenOdd();
        for(int i=1;i<=100;i+=2){
            System.out.println(String.format("Number: %d , Expected: %s , Actual: %s", i, "odd", EvenOdd.EvenOdd(i)));
            assertEquals("odd", EvenOdd.EvenOdd(i));
        }
        for(int i=0;i<=100;i+=2){
            System.out.println(String.format("Number: %d , Expected: %s , Actual: %s", i, "even", EvenOdd.EvenOdd(i)));
            assertEquals("even", EvenOdd.EvenOdd(i));
        }
    }
}
