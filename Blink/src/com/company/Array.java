package com.company;

public class Array {
    public static void main(String[] args) {
        String[][] stringMultiArray = new String[10][3];


        stringMultiArray[0][0] = "Bryan";
        stringMultiArray[0][1] = "A";
        stringMultiArray[9][2] = "B";
//        stringMultiArray[0][3] = "C";

        for (int i = 0; i < stringMultiArray.length; i++) {
            for (int j = 0; j < stringMultiArray[j].length; j ++) {
                System.out.println(stringMultiArray[i][j]);
            }
        }


    }
}
