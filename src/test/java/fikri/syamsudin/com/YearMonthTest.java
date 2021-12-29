package fikri.syamsudin.com;

import org.junit.Test;

import java.time.Month;
import java.time.MonthDay;
import java.time.Year;
import java.time.YearMonth;

public class YearMonthTest {

    @Test
    public void create(){
        Year year1 = Year.now();
        Year year2 = Year.of(2001);
        Year year3 = Year.parse("2009");

        YearMonth yearMonth1 = YearMonth.now();
        YearMonth yearMonth2 = YearMonth.of(2020, Month.FEBRUARY);
        YearMonth yearMonth3 = YearMonth.parse("2020-09");


        System.out.println(yearMonth1);
        System.out.println(yearMonth2);
        System.out.println(yearMonth3);

        MonthDay monthDay1 = MonthDay.now();
        MonthDay monthDay2 = MonthDay.of(Month.DECEMBER,29);
        MonthDay monthDay3 = MonthDay.parse("--10-10");


        System.out.println(monthDay1);
        System.out.println(monthDay2);
        System.out.println(monthDay3);



    }
}
