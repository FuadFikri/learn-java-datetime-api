package fikri.syamsudin.com;

import jdk.swing.interop.SwingInterOpUtils;
import org.junit.Test;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZoneOffset;
import java.time.ZonedDateTime;

public class ZonedDateTimeTest {


    @Test
    public void create(){
        ZonedDateTime zonedDateTime = ZonedDateTime.now(); //default zone
        ZonedDateTime zonedDateTime2 = ZonedDateTime.now(ZoneId.of("GMT")); //default zone
        ZonedDateTime zonedDateTime3 = ZonedDateTime.of(LocalDateTime.now(), ZoneOffset.ofHours(7));

        System.out.println(zonedDateTime);
        System.out.println(zonedDateTime2);
        System.out.println(zonedDateTime3);

    }

    @Test
    public void parse(){
        ZonedDateTime zonedDateTime = ZonedDateTime.parse("2022-01-03T20:55:49.400679100+07:00[Asia/Bangkok]");
        ZonedDateTime zonedDateTime2 = ZonedDateTime.parse("2022-01-03T20:55:49.400679100+07:00");
        ZonedDateTime zonedDateTime3 = ZonedDateTime.parse("2022-01-03T13:55:49.400679100Z[GMT]");


        System.out.println(zonedDateTime);
        System.out.println(zonedDateTime2);
        System.out.println(zonedDateTime3);

    }

    @Test
    public void changeZoneId(){
//        1. change timezone without change date and time
        ZonedDateTime zonedDateTime = ZonedDateTime.now();
        System.out.println(zonedDateTime);

        ZonedDateTime zonedDateTime1 = zonedDateTime.withZoneSameLocal(ZoneId.of("GMT"));
        System.out.println(zonedDateTime1);


//        2. change zoneId and date and time will be change
        ZonedDateTime zonedDateTime2 = zonedDateTime.withZoneSameInstant(ZoneId.of("GMT"));
        System.out.println(zonedDateTime2);

    }
}
