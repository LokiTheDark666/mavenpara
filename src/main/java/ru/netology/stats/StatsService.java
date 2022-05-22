package ru.netology.stats;



public class StatsService {

    public int minSales(long  [] sales) {
        int minMonth = 0;
        int month = 0; // переменная для индекса рассматриваемого месяца в массиве
        for (long sale : sales) {
            // sales[minMonth] - продажи в месяце minMonth
            // sale - продажи в рассматриваемом месяце
            if (sale <= sales[minMonth]) {
                minMonth = month;
            }
            month = month + 1; // следующий рассматриваемый месяц имеет номер на 1 больше
        }
        return minMonth + 1;
    }

    public int maxSales(long  [] sales) {
        int maxMonth = 0;
        int month = 0; // переменная для индекса рассматриваемого месяца в массиве
        for (long sale : sales) {
            // sales[maxMonth] - продажи в месяце maxMonth
            // sale - продажи в рассматриваемом месяце
            if (sale >= sales[maxMonth]) {
                maxMonth = month;
            }
            month = month + 1; // следующий рассматриваемый месяц имеет номер на 1 больше
        }
        return maxMonth + 1;
    }

    public int allSales(long  [] sales) {
        int allMonthsales = 0;
        int month = 0; // переменная для индекса рассматриваемого месяца в массиве
        // allmonthsales - продажи за все месяцы
        // sale - продажи в рассматриваемом месяце
        for (long sale : sales) {
            allMonthsales += sale;
        }
        return allMonthsales;
    }

    public int midSalesMonth(long  [] sales) {

        return allSales(sales) / sales.length;
    }



    public int monthMinSales(long  [] sales) {
        long mid = midSalesMonth(sales);
        int minsales =0;
        for(long sale : sales){
            if (sale > mid){
                minsales++;
            }
        }
        return minsales;

    }
    public int mounthMaxSales(long  []sales){
        long mid = midSalesMonth(sales);
        int maxsales =0;
        for (long sale : sales){
            if (sale < mid){
                maxsales++;
            }
        }
        return maxsales;
    }

}