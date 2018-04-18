package com.company;

import java.util.*;
import java.text.DateFormat;

public class Time {



    public static void main(String[] args) {
        Date rightNow = new Date();
        Locale currentLocale = new Locale("en", "US");
        DateFormat timeFormatter = DateFormat.getTimeInstance(DateFormat.DEFAULT, currentLocale);
        DateFormat dateFormatter = DateFormat.getDateInstance(DateFormat.DEFAULT, currentLocale);
        String timeOutput = timeFormatter.format(rightNow);
        String dateOutput = dateFormatter.format(rightNow);

        System.out.print(timeOutput + " " + dateOutput);
    }
}
