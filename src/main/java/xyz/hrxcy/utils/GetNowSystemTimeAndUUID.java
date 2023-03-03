package xyz.hrxcy.utils;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.UUID;

public class GetNowSystemTimeAndUUID {
    public static String getUtilsId(){
        return UUID.randomUUID().toString();
    }

    public static String getTime(){
       String format = "YYYY-MM-dd hh:mm:ss";
       return LocalDateTime.now().format(DateTimeFormatter.ofPattern(format));
    }
}
