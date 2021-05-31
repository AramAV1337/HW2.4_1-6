package ru.netology.stats;

public class StatsService {

    public long calculateTotalSales(long[] sales) {
        long result = 0;
        for (long sale : sales) {
            result += sale;
        }
        return result;
    }

    public long calculateAverageSales(long[] sales) {
        long sum;
        sum = calculateTotalSales(sales) / 12;
        return sum;
    }

    public int minMonthSales(long[] sales) {
        int minMonth = 0;
        int month = 0;
        for (long sale : sales) {
            if (sale <= sales[minMonth]) {
                minMonth = month;
            }
            month = month + 1;
        }
        return minMonth + 1;
    }

    public int maxMonthSales(long[] sales) {
        int maxMonth = 0;
        int month = 0;
        for (long sale : sales) {
            if (sale >= sales[maxMonth]) {
                maxMonth = month;
            }
            month = month + 1;
        }
        return maxMonth + 1;
    }

    public long calculateAboveAverageSales(long[] sales, long average) {
        int countMonth = 0;
        for (long sale : sales) {
            if (sale > average)
                countMonth++;
        }
        return countMonth;

    }

    public long calculateOverAverageSales(long[] sales, long average) {
        int countMonth = 0;
        for (long sale : sales) {
            if (sale < average)
                countMonth++;
        }
        return countMonth;
    }
}

