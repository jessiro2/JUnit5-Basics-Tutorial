package org.example;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
class MathUtilsTest {

    MathUtils mathUtils;

    @BeforeAll
    void beforeAllInit() {
        System.out.println("This needs to run before all");
    }

    @BeforeEach
    void init() {
        mathUtils = new MathUtils();
    }

    @AfterEach
    void cleanup() {
        System.out.println("Cleaning up...");
    }

    @Test
    @DisplayName("Testing add method")
    void testAdd() {
        int expected = 2;
        int actual = mathUtils.add(1,1);
        assertEquals(expected, actual,  "The add method should add two numbers");
    }

    @Test
    void testDivide() {
        assertThrows(ArithmeticException.class, () -> mathUtils.divide(1,0), "Divide by zero should throw");
    }

    @Test
    void testComputeCircleRadius() {
        assertEquals(314.1592653589793, mathUtils.computeCircleArea(10), "Should return right circle area");
    }

    @Test
    @Disabled
    @DisplayName("Test should not run")
    void testDisabled() {
        fail("This test should nbe disabled");
    }

}