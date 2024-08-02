package de.telran.lesson_21;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    private Calculator calculatorTest;
    private int a1Test;
    private int a2Test;
    private int expectedResult;
    private int actualResult;

    //@BeforeAll
    @BeforeEach
    void setUp() {
        calculatorTest = new Calculator();
        a1Test = 5;
        a2Test = 2;
        System.out.println("Запускается перед тестом");
    }

    //@AfterAll
    @AfterEach
    void tearDown() {
        System.out.println("Запускается после тестом");
    }

    @Test
    void addTest() {

        expectedResult = 7;

        actualResult = calculatorTest.add(a1Test, a2Test);

        assertEquals(expectedResult, actualResult);
        assertTrue(actualResult == 7 );
        // assertNotEquals(expectedResult, actualResult);
    }

    @Test
    void substractTest() {

        expectedResult = 3;

        actualResult = calculatorTest.substract(a1Test, a2Test);

        assertEquals(expectedResult, actualResult);
    }

    @Test
    void divideTest() { //позитивный сценарий
        a1Test = 6;

        expectedResult = 3;

        actualResult = calculatorTest.divide(a1Test, a2Test);

        assertEquals(expectedResult, actualResult);
    }

    @Test
    void divideTestWithNullPointerException() { //негативный сценарий
        a2Test = 0;
        assertThrows(NullPointerException.class, () -> calculatorTest.divide(a1Test, a2Test));
    }
}