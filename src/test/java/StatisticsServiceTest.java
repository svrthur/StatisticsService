package ru.netology.statistic;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

public class StatisticsServiceTest {

    @Test
    void findMaxWhenMaxIsFirst() {
        StatisticsService service = new StatisticsService();

        long[] incomesInBillions = {12, 5, 8, 4, 5, 3, 8, 6, 11, 11};
        long expected = 12;

        long actual = service.findMax(incomesInBillions);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void findMaxWhenMaxIsMiddle() {
        StatisticsService service = new StatisticsService();

        long[] incomesInBillions = {5, 8, 4, 12, 5, 3, 8, 6, 11, 11};
        long expected = 12;

        long actual = service.findMax(incomesInBillions);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void findMaxWhenMaxIsLast() {
        StatisticsService service = new StatisticsService();

        long[] incomesInBillions = {5, 8, 4, 5, 3, 8, 6, 11, 11, 12};
        long expected = 12;

        long actual = service.findMax(incomesInBillions);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void findMaxWhenAllAreEqual() {
        StatisticsService service = new StatisticsService();

        long[] incomesInBillions = {5, 5, 5, 5, 5, 5, 5, 5, 5, 5};
        long expected = 5;

        long actual = service.findMax(incomesInBillions);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void findMaxWithNegativeValues() {
        StatisticsService service = new StatisticsService();

        long[] incomesInBillions = {-5, -8, -4, -12, -3, -6};
        long expected = -3;

        long actual = service.findMax(incomesInBillions);

        Assertions.assertEquals(expected, actual);
    }
}
