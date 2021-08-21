//1. Find the date difference (year, day, hour, min, sec) between your birthdate and today

package array_hashmap_date_function;

import java.awt.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class program_1 {
    public static void main(String[] args) throws ParseException {
        String birthDate = "14/12/1994 00:00:00 AM";
        SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy hh:mm:ss aa");
        Date date1 = formatter.parse(birthDate);
        Date date2 = new Date();
        long d = date2.getTime() - date1.getTime();
        long year = d / (1000l * 60 * 60 * 24 * 365);
        long day = d / (1000 * 60 * 60 * 24) % 365;
        long hour = (d / (1000 * 60 * 60)) % 24;
        long minutes = (d / (1000 * 60)) % 60;
        long second = (d / 1000) % 60;

        System.out.println("Year: " + year);
        System.out.println("Day: " + day);
        System.out.println("Hour: " + hour);
        System.out.println("Minute: " + minutes);
        System.out.println("Second: " + second);

    }
}