package fikri.syamsudin.com;

import org.junit.Test;

import java.time.LocalDate;
import java.time.Period;

public class PeriodTest {

    @Test
    public void create() {
        Period period = Period.ofYears(10);
        Period period2 = Period.ofMonths(13);
        Period period3 = Period.ofWeeks(6);
        Period period4 = Period.ofDays(46);


        System.out.println(period);
        System.out.println(period2);
        System.out.println(period3);
        System.out.println(period4);
    }

    @Test
    public void get(){
        Period period = Period.of(1,6,9);
        System.out.println(period.getYears());
        System.out.println(period.getMonths());
        System.out.println(period.getDays());
        System.out.println(period.toTotalMonths());
    }

    @Test
    public void between(){
        Period period = Period.between(
                LocalDate.of(1997,2, 9),
                LocalDate.now()
        );

        System.out.println(period.getYears());
        System.out.println(period.getMonths());
        System.out.println(period.getDays());
    }
}
