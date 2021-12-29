package fikri.syamsudin.com;

import org.junit.Test;

import java.time.ZoneId;
import java.time.ZoneOffset;

public class ZoneTest {

    @Test
    public void createZoneId(){
        ZoneId zoneId = ZoneId.systemDefault();
        ZoneId zoneIdGMT = ZoneId.of("GMT");
        System.out.println("zoneId : " + zoneId);
        System.out.println("zoneIdGMT : " + zoneIdGMT);


        System.out.println("====== avaiable zoneID ==========");
        ZoneId.getAvailableZoneIds().forEach(System.out::println);
    }


    @Test
    public void createZoneTest(){
        ZoneOffset zoneOffset1 = ZoneOffset.of("+07:00");
        ZoneOffset zoneOffset2 = ZoneOffset.ofHours(-8);
        ZoneOffset zoneOffset3 = ZoneOffset.ofHoursMinutes(2,30);

        System.out.println(zoneOffset1);
        System.out.println(zoneOffset2);
        System.out.println(zoneOffset3);
    }
}
