package test;

import junitparams.Parameters;
import main.java.StudentScoreCalculator;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;
import org.junit.runner.RunWith;
import junitparams.JUnitParamsRunner;

import static org.junit.Assert.assertEquals;

@RunWith(JUnitParamsRunner.class)
public class StudentScoreCalculatorJUnitParams {
    @ParameterizedTest
    @CsvSource({
            "9, 80, 720",
            "-80, 75, -1",
            "110, 90, -1"
    })
    void studentScoreCalculator(int mathScore, int literacyScore, int expectedScore) {
        StudentScoreCalculator sc = new StudentScoreCalculator();
        sc.calculateSATScore(mathScore, literacyScore);
        assertEquals(expectedScore, sc.getSatScore());
    }

}
