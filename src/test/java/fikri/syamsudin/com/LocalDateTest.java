package fikri.syamsudin.com;

import org.junit.Test;

import java.time.LocalDate;
import java.time.Month;

public class LocalDateTest {


    @Test
    public void create(){
        LocalDate localDate1 = LocalDate.now();
        LocalDate localDate2 = LocalDate.of(2021, Month.DECEMBER,1);
        LocalDate localDate3 = LocalDate.of(2021, 10,1);
        LocalDate localDate4 = LocalDate.parse("1997-02-09");

        System.out.println(localDate1);
        System.out.println(localDate2);
        System.out.println(localDate3);
        System.out.println(localDate4);

    }

    @Test
    public void manipulate(){
        LocalDate localDate1 = LocalDate.now();
        LocalDate localDate2 = localDate1.withYear(1999);
        LocalDate localDate3 = localDate1.withMonth(10).withDayOfMonth(2);

//        LocalDate immutable
        System.out.println(localDate1);
        System.out.println(localDate2);
        System.out.println(localDate3);

    }

    @Test
    public void manipulate2(){
        LocalDate localDate1 = LocalDate.now();
        LocalDate localDate2 = localDate1.minusMonths(2).minusWeeks(1);

        System.out.println(localDate1);
        System.out.println(localDate2);

    }


    @Test
    public void getData(){
        LocalDate localDate = LocalDate.now();
        System.out.println(localDate.getYear());
        System.out.println(localDate.getMonth());
        System.out.println(localDate.getMonthValue());
        System.out.println(localDate.getDayOfMonth());
        System.out.println(localDate.getDayOfWeek());
        System.out.println(localDate.getDayOfYear());

    }
}
