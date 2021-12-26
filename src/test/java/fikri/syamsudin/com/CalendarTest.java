package fikri.syamsudin.com;

import org.junit.Test;

import java.util.Calendar;

public class CalendarTest {

    @Test
   public void create(){
        Calendar calendar = Calendar.getInstance();
        System.out.println(calendar.getTime());
    }

    @Test
   public void manipulation(){
        Calendar calendar = Calendar.getInstance();
        calendar.set(Calendar.YEAR,1990);
        calendar.set(Calendar.MONTH, Calendar.APRIL);
        calendar.set(Calendar.DAY_OF_MONTH,10);

        System.out.println(calendar.getTime());

//        get data calendar
        int year = calendar.get(Calendar.YEAR);
        int month = calendar.get(Calendar.MONTH);
        int day = calendar.get(Calendar.DAY_OF_MONTH);
        int hours = calendar.get(Calendar.HOUR_OF_DAY);

        System.out.println(year);
        System.out.println(month);
        System.out.println(day);
        System.out.println(hours);
    }
}
