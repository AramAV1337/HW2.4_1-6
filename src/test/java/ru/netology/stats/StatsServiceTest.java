package ru.netology.stats;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class StatsServiceTest {


    @Test
    void calculateTotalSales() {
        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expected;
        expected = 180;
        long actual = service.calculateTotalSales(sales);
        assertEquals(expected, actual);
    }

    @Test
    void calculateAverageSales() {
        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expected;
        expected = 15;
        long actual = service.calculateAverageSales(sales);
        assertEquals(expected, actual);
    }

    @Test
    void minMonthSales() {
        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expected;
        expected = 9;
        long actual = service.minMonthSales(sales);
        assertEquals(expected, actual);
    }

    @Test
    void maxMonthSales() {
        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expected;
        expected = 8;
        long actual = service.maxMonthSales(sales);
        assertEquals(expected, actual);

    }

    @Test
    void calculateAboveAverageSales() {
        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expected;
        expected = 5;
        long actual = service.calculateAboveAverageSales(sales);
        assertEquals(expected, actual);

    }

    @Test
    void calculateOverAverageSales() {
        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expected;
        expected = 5;
        long actual = service.calculateOverAverageSales(sales);
        assertEquals(expected, actual);

    }

}


