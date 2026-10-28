import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class SquareOfArrayTest {

    @Test
    public void arrayOfFourNumbersReturnsSquaredArrayTest(){
        int[] numbers = {3,8,6,2};
        int[] expected = {4,9,36,64};
        assertArrayEquals(expected, SquareOfArray.squareArray(numbers));
    }

    @Test
    public void arrayOfFiveNumbersReturnsSquaredArrayTest(){
        int[] numbers = {10,3,8,6,2};
        int[] expected = {4,9,36,64,100};
        assertArrayEquals(expected, SquareOfArray.squareArray(numbers));
    }

    @Test
    public void arrayOfTenNumbersReturnsSquaredArrayTest(){
        int[] numbers = {10,3,8,6,2,1,4,5,7,9};
        int[] expected = {1,4,9,16,25,36,49,64,81,100};
        assertArrayEquals(expected, SquareOfArray.squareArray(numbers));
    }
}
