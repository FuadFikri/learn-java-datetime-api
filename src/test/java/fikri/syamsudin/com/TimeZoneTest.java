package fikri.syamsudin.com;

import org.junit.Test;

import java.util.Calendar;
import java.util.TimeZone;

public class TimeZoneTest {


    @Test
    public void create(){
        TimeZone timeZone1 = TimeZone.getDefault();
        TimeZone timeZone2 = TimeZone.getTimeZone("Asia/Jakarta");

        String[] availableIDs = TimeZone.getAvailableIDs();

        System.out.println(timeZone1);
        System.out.println(timeZone2);
        for (String availableID : availableIDs) {
            System.out.println(availableID);
        }
    }

    @Test
    public void calendar(){
        Calendar calendar1 = Calendar.getInstance();
        Calendar calendar2 = Calendar.getInstance(TimeZone.getTimeZone("GMT"));

        System.out.println(calendar1.get(Calendar.HOUR_OF_DAY));
        System.out.println(calendar2.get(Calendar.HOUR_OF_DAY));


        calendar1.setTimeZone(TimeZone.getTimeZone("GMT"));
        System.out.println(calendar1.get(Calendar.HOUR_OF_DAY));
    }
}
