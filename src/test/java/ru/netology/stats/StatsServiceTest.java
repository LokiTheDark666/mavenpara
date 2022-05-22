package ru.netology.stats;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


public class StatsServiceTest {
    @Test
    public void minSales() {
        StatsService manager = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int actual = manager.minSales(sales);
        int expected = 9;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void maxSales() {
        StatsService manager = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int actual = manager.maxSales(sales);
        int expected = 8;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void allSales() {
        StatsService manager = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int actual = manager.allSales(sales);
        int expected = 180;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void midSalesMonth() {
        StatsService manager = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int actual = manager.midSalesMonth(sales);
        int expected = 15;
        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void monthMinSales() {
        StatsService manager = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int actual = manager.monthMinSales(sales);
        int expected = 5;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void mounthMaxSales() {
        StatsService manager = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int actual = manager.mounthMaxSales(sales);
        int expected = 5;
        Assertions.assertEquals(expected, actual);

    }
}
