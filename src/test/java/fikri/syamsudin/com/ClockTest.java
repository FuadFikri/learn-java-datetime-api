package fikri.syamsudin.com;

import org.junit.Test;

import java.time.*;

public class ClockTest {

    @Test
    public void create() {
        Clock clock = Clock.systemDefaultZone();
        Clock clock1 = Clock.systemUTC();
        Clock clock3 = Clock.system(ZoneId.of("Asia/Makassar"));
        Clock clock4 = Clock.system(ZoneId.of("Asia/Pontianak"));
        Clock clock5 = Clock.system(ZoneId.of("Asia/Jakarta"));

        System.out.println(clock + " " + clock.instant());
        System.out.println(clock1 + " " + clock.instant());
        System.out.println(clock3 + " " + clock.instant());
        System.out.println(clock4 + " " + clock.instant());
        System.out.println(clock5 + " " + clock.instant());
    }

    @Test

    public void konversi() {
        Clock clockJkt = Clock.system(ZoneId.of("Asia/Jakarta"));

        Year year = Year.now(clockJkt);
        YearMonth yearMonth = YearMonth.now(clockJkt);
        LocalDateTime localDateTime = LocalDateTime.now(clockJkt);
        LocalTime localTime = LocalTime.now(clockJkt);
        OffsetTime offsetTime = OffsetTime.now(clockJkt);
        OffsetDateTime offsetDateTime = OffsetDateTime.now(clockJkt);
        ZonedDateTime zonedDateTime = ZonedDateTime.now(clockJkt);

        System.out.println(clockJkt + " " + clockJkt.instant());
        System.out.println(year);
        System.out.println(yearMonth);
        System.out.println();
    }
}
