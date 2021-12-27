package fikri.syamsudin.com;

import org.junit.Test;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeFormatterBuilder;

public class LocalTimeTest {

    @Test
    public void create(){
        LocalTime localTime = LocalTime.now();
        LocalTime localTime2 = LocalTime.of(13,10,58);


        System.out.println(localTime);
        System.out.println(localTime2);

    }

    @Test
    public void manipulate(){
        LocalTime localTime = LocalTime.now();
        LocalTime localTime2 = localTime.withHour(10).withMinute(59);

        System.out.println(localTime);
        System.out.println(localTime2);

    }
}
