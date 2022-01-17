package fikri.syamsudin.com;

import org.junit.Test;

import java.time.*;

public class InstantTest {


    @Test
    public void create() {
        Instant instant = Instant.now();
        System.out.println(instant);

        Instant instant1 = Instant.ofEpochMilli(System.currentTimeMillis());
        System.out.println(instant1);

        Instant instant2 = Instant.ofEpochMilli(1642425630221L);
        System.out.println(instant2);
    }


    @Test
    public void modify() {
        Instant instant = Instant.now();
        System.out.println(instant);
        Instant instantResult = instant.plusSeconds(60).plusMillis(1000);

        System.out.println(instantResult);
    }

    @Test
    public void get() {
        Instant instant = Instant.now();
        System.out.println(instant);

        System.out.println(instant.getEpochSecond());
        System.out.println(instant.getNano());
    }

    @Test
    public void konversi(){
        Instant instant =  Instant.ofEpochMilli(855425400000L);
        System.out.println(instant);

        LocalDateTime localDateTime =  LocalDateTime.ofInstant(instant, ZoneId.of("Asia/Jakarta"));
        System.out.println(localDateTime);


        LocalTime localTime = LocalTime.ofInstant(instant,ZoneId.of("Asia/Jakarta"));
        System.out.println(localTime);
    }

    @Test
    public void toInstant(){
        Instant instant = LocalDateTime.now().toInstant(ZoneOffset.ofHours(7));
        System.out.println(instant);

        Instant instant1 = ZonedDateTime.now().toInstant();
        System.out.println(instant1);
    }
}
