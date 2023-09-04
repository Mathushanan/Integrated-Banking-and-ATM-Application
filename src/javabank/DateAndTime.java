package javabank;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateAndTime {


    private String currentDate;

    public DateAndTime() {
        Date CurrentDate = new Date();
        SimpleDateFormat DateFormat = new SimpleDateFormat();
        this.currentDate = DateFormat.format(CurrentDate);
    }

    public String getDateAndTime() {
        
        return currentDate;
    }
}
