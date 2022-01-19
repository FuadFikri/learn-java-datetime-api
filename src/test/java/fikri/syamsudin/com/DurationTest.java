package fikri.syamsudin.com;

import org.junit.Test;

import java.time.Duration;
import java.time.LocalTime;

public class DurationTest {

    @Test
    public void create(){
        Duration duration = Duration.ofHours(10);
        Duration duration2 = Duration.ofHours(10).plusMinutes(30);
        Duration duration3 = Duration.ofHours(1).plusMinutes(30).plusSeconds(15);

        System.out.println(duration);
        System.out.println(duration2);
        System.out.println(duration3);
    }

    @Test
    public void get(){
        Duration duration = Duration.ofHours(40);
        Duration duration2 = Duration.ofHours(24);
        Duration duration3 = Duration.ofHours(1).plusSeconds(9000);

        System.out.println(duration.toDays());
        System.out.println(duration2.toDays());
        System.out.println(duration3.toMinutes());
    }

    @Test
    public void calculate(){
        Duration duration = Duration.between(LocalTime.now(), LocalTime.now().plusHours(2));

        System.out.println(duration.toHours());
        System.out.println(duration.toMinutes());
    }
}
