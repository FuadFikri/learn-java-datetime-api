package fikri.syamsudin.com;

import org.junit.Test;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class DateFormatterTest {

    @Test
    public void parse(){
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yyyy MM dd");

        LocalDate localDate = LocalDate.parse("1997 02 09",dateTimeFormatter);
        System.out.println(localDate.getYear());
        System.out.println(localDate.getMonth());
        System.out.println(localDate.getDayOfMonth());
    }


    @Test
    public void format(){
        DateTimeFormatter dateTimeFormatter1 = DateTimeFormatter.ofPattern("dd, MMMM - yyyy");

        LocalDate localDate =  LocalDate.now();
        String format = localDate.format(dateTimeFormatter1);
        System.out.println(format);


        LocalDateTime localDateTime = LocalDateTime.now();
        String formated = localDateTime.format(DateTimeFormatter.ISO_LOCAL_DATE_TIME);
        String formated2 = localDateTime.format(DateTimeFormatter.ISO_DATE);
        String formated3 = localDateTime.format(DateTimeFormatter.ofPattern("dd-MMMM-yyyy"));

        System.out.println(formated);
        System.out.println(formated2);
        System.out.println(formated3);

    }


    @Test
    public void i18n(){
        Locale locale = new Locale("in", "ID");
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("dd-MMMM-yyyy",locale);

        LocalDate localDate = LocalDate.of(2021,2,9);
        System.out.println(localDate.format(dateTimeFormatter));
    }
}
