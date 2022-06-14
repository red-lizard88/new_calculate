import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import java.util.stream.Stream;
import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.params.provider.Arguments.arguments;

class CalculateTest {

    @ParameterizedTest
    @MethodSource("testSumParam1PlusParam2")
    public void method1(double expected, double param1, double param2) {
        assertEquals(expected, Calculate.sum(param1, param2));
    }

    static Stream<Arguments> testSumParam1PlusParam2() {
        return Stream.of(
                arguments(10, 7, 3),
                arguments(15, 10, 5),
                arguments(8, 10, -2),
                arguments(13, 10, 3),
                arguments(15, 15, 0)
        );
    }

    @DisplayName("Two Plus One Should Equal Three")
    @Test
    void testTwoPlusOneShouldEqualThree() {
        assertEquals(3, Calculate.sum(2, 1));
    }

    @DisplayName("Six Divide Zero Should Equal Zero")
    @Test
    void testSixDivideThreeShouldEqualTwo() {
        assertEquals(6, Calculate.divide(6, 1));
    }

    @DisplayName("Nine Substract Five Should Equal Four")
    @Test
    void testNineSubstractFiveShouldEqualFour() {
        assertEquals(4, Calculate.substract(9, 5));
    }

    @DisplayName("Four Multiply Two Should Equal Eight")
    @Test
    void testFourMultiplyTwoShouldEqualEight() {
        assertEquals(8, Calculate.multiply(4, 2));
    }





}