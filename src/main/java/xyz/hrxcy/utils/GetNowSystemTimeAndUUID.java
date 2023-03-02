package xyz.hrxcy.utils;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.UUID;

public class GetNowSystemTimeAndUUID {
    public String getUtilsId(){
        return UUID.randomUUID().toString();
    }

    public String getTime(){
       String format = "YYYY-MM-dd hh:mm:ss";
       return LocalDateTime.now().format(DateTimeFormatter.ofPattern(format));
    }
}
