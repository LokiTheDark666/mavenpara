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
    public void maxSales(){
        StatsService manager = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int actual = manager.maxSales(sales);
        int expected = 9;
        Assertions.assertEquals(expected,actual);
    }

    @Test
    public void allSales(){
        StatsService manager = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int actual = manager.allSales(sales);
        int expected = 180;
        Assertions.assertEquals(expected,actual);
    }

    @Test
    public void mdlsalesmonth(){
        StatsService manager = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int actual = manager.mdlsalesmonth(sales);
        int expected = 180;
        Assertions.assertEquals(expected,actual);

    }

    @Test
    public void monthminsales(){
        StatsService manager = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int actual = manager.monthminsales(sales);
        int expected = 12;
        Assertions.assertEquals(expected,actual);
    }

    @Test
    public void mounthmaxsales(){
        StatsService manager = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int actual = manager.mounthmaxsales(sales);
        int expected = 1;
        Assertions.assertEquals(expected,actual);

    }
}
