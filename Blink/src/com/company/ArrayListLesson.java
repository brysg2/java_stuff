package com.company;
import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListLesson {
    static ArrayList<String> arrayList= new ArrayList();

    public static void main(String[] args) {
        arrayList.add("Bryan");
        arrayList.add("David");
        arrayList.add("Mike");

        System.out.println(arrayList.size() - 1);

        for (int i = 0; i < arrayList.size(); i++) {
            System.out.println(arrayList.get(i));
        }
        System.out.println();
        for (String i : arrayList) {
            System.out.println(i);
        }
    }
}
