package test;

import main.java.SimpleCalculator;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SimpleCalculatorTest {
    @Test
    void twoPlusTwoShouldBeFour(){
        SimpleCalculator calculator = new SimpleCalculator();
        int actual = calculator.add(2,2);
        assertEquals(4,actual+1);
    }
}