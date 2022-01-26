package fikri.syamsudin.com;

import org.junit.Test;

import java.time.DayOfWeek;

public class DayOfWeekTest {


    @Test
    public void create(){
        DayOfWeek dayOfWeek = DayOfWeek.of(1);
        DayOfWeek dayOfWeek2 = DayOfWeek.FRIDAY;
        DayOfWeek dayOfWeek3 = dayOfWeek2.plus(3);


        System.out.println(dayOfWeek);
        System.out.println(dayOfWeek2);
        System.out.println(dayOfWeek3);
    }
}
