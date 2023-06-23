package test;

import main.java.StudentScoreCalculator;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StudentScoreCalculatorTest {

    @Test
    public void studentScoreCalculatorRegular(){
        StudentScoreCalculator sc = new StudentScoreCalculator();
        sc.calculateSATScore(50,50);
        assertEquals(2500,sc.getSatScore());
    }

    @Test
    public void studentScoreCalculatorBothNegative(){
        StudentScoreCalculator sc = new StudentScoreCalculator();
        sc.calculateSATScore(-50,-50);
        assertEquals(-1,sc.getSatScore());
    }

    @Test
    public void studentScoreCalculatorBothHigh(){
        StudentScoreCalculator sc = new StudentScoreCalculator();
        sc.calculateSATScore(150,150);
        assertEquals(-1,sc.getSatScore());
    }

}