package ru.netology.javaqa.javaqamvn.services;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class CalcServiceTest {
    @ParameterizedTest
    @CsvSource({
            "100000, 60000, 150000, 2",
            "10000, 3000, 20000, 3"
    })

    public void testCalculateDifferenceLimit(int income, int expenses, int threshold, int expected) {
        CalcService service = new CalcService();

        int actual = service.calculate(income, expenses, threshold);

        Assertions.assertEquals(expected, actual);
    }
}





//    @Test
//    void testCalculateHighLimit() {
//        CalcService service = new CalcService();
//        int income = 100_000;
//        int expenses = 60_000;
//        int threshold = 150_000;
//        int expected = 2;
//        int actual = service.calculate(income, expenses, threshold);
//        Assertions.assertEquals(expected, actual);
//    }
//
//    @Test
//    void TestCalculateLowLimit() {
//        CalcService service = new CalcService();
//        int income = 10_000;
//        int expenses = 3_000;
//        int threshold = 20_000;
//        int expected = 3;
//        int actual = service.calculate(income, expenses, threshold);
//        Assertions.assertEquals(expected, actual);
//
//    }
//}
