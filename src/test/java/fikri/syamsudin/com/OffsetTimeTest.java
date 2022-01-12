package fikri.syamsudin.com;

import org.junit.Test;

import java.time.*;

public class OffsetTimeTest {


    @Test
    public void create(){
        OffsetTime offsetTime1 = OffsetTime.now();
        OffsetTime offsetTime2 = OffsetTime.now(ZoneId.of("Asia/Jakarta"));
        OffsetTime offsetTime3 = OffsetTime.parse("10:10:30.100+07:00");

        System.out.println(offsetTime1);
        System.out.println(offsetTime2);
        System.out.println(offsetTime3);


        OffsetDateTime offsetDateTime1 = OffsetDateTime.now();
        OffsetDateTime offsetDateTime2 = OffsetDateTime.now(ZoneId.of("Asia/Jakarta"));
        OffsetDateTime offsetDateTime3 = OffsetDateTime.parse("2001-10-12T10:10:59.100+05:00");


        System.out.println(offsetDateTime1);
        System.out.println(offsetDateTime2);
        System.out.println(offsetDateTime3);

    }


    @Test
    public void toLocalTime(){

        LocalTime localTime = LocalTime.now();
        System.out.println(localTime);

//        menambah offset
        OffsetTime offsetTime = localTime.atOffset(ZoneOffset.UTC);
        OffsetTime offsetTime2 = localTime.atOffset(ZoneOffset.MAX);
        OffsetTime offsetTime3 = localTime.atOffset(ZoneOffset.ofHours(7));

        System.out.println(offsetTime);
        System.out.println(offsetTime2);
        System.out.println(offsetTime3);


//        menghilangkan offset
        LocalTime localTime1 = offsetTime2.toLocalTime();
        System.out.println(localTime1);
    }


    @Test
    public void toLocalDateTime(){

        LocalDateTime localDateTime = LocalDateTime.now();
        System.out.println(localDateTime);

        OffsetDateTime offsetDateTime = localDateTime.atOffset(ZoneOffset.ofHours(7));
        OffsetDateTime offsetDateTime2 = localDateTime.atOffset(ZoneOffset.ofHours(8));

        System.out.println(offsetDateTime);
        System.out.println(offsetDateTime2);

        LocalDateTime localDateTime1 = offsetDateTime.toLocalDateTime();
        System.out.println(localDateTime1);
    }
}
