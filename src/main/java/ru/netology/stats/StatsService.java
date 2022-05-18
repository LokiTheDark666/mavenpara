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
            if (sale <= sales[maxMonth]) {
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
            allMonthsales = allMonthsales += sale;
        }
        return allMonthsales;
    }

    public int mdlsalesmonth(long  [] sales) {

        int mdlsalse = 0;// средняя сумма продаж
        for (long value : sales) {
            mdlsalse += value;
        }
        return mdlsalse;
    }

    public int monthminsales(long  [] sales) {
        int midlsalse = 0;//средняя сумма продаж
        int ammountsales = 0;//общее колличество месяцев ниже среднего
        for (long sale : sales) {
            midlsalse += sale;
            if (sale <= midlsalse) {
                ammountsales += 1;
            }
        }
        return ammountsales;
    }
    public int mounthmaxsales(long  []sales){
        int midsalse = 0;//средняя сумма
        int ammount = 0;//колличество месяцев выше среднего
        for (long sale : sales) {
            midsalse += sale;
            if (sale>= midsalse){
                ammount+=1;
            }

        }
        return ammount;
    }

}