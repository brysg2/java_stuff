package com.company;

import java.util.regex.*;

public class Regex {
    public static void main(String[] args) {
        String longString = " Derek Banas CA 12345 PA (412)555-1212 johnsmith@hotmail.com 412-555-1234 412 555-1234 ";
        regexChecker("[A]", longString);

    }

    public static void regexChecker(String theRegex, String str2Check) {
        Pattern checkRegex = Pattern.compile(theRegex);
        Matcher regexMatcher = checkRegex.matcher(str2Check);

        while ( regexMatcher.find() ){
            if (regexMatcher.group().length() != 0){
                System.out.println( regexMatcher.group().trim() );

                // You can get the starting and ending indexs

                System.out.println( "Start Index: " + regexMatcher.start());
                System.out.println( "Start Index: " + regexMatcher.end());
            }
        }

        System.out.println();
    }
}


