import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

// Student id: B211202403
// Student name: Doğa Can
// Student surname: Karaman
// Course name: SOFTWARE VERIFICATION AND VALIDATION
// Homework number: HOMEWORK 1
// Repository address: https://github.com/doacan/SoftwareVerificationAndValidation

class CalculatorTest {

    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }
    @ParameterizedTest
    @CsvSource({
            "10, 2, 5",
            "10, 4, 2.5",
            "12.5, 5, 2.5",
            "10, 2.5, 4",
            "12.5, 2.5, 5"
    })
    void testDivision(double a, double b, double expected) {
        assertEquals(expected, Calculator.divide(a, b));
    }

    //The last test method "testDivision6" is testing for an EXCEPTION...
    // while first 5 tests are testing for EQUALITY of two objects.
    @Test
    void testDivision6() {
        Exception exception = assertThrows(
                IllegalArgumentException.class,
                () -> Calculator.divide(12.5, 0),
                "IllegalArgumentException expected."
        );
    }
}