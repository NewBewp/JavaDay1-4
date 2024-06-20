package bai2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        sortListArray();
    }
    public static void sortListArray(){
        String[] charArray = {"Red","Green","Orange","White","Black"};
        ArrayList<String> arrayList = new ArrayList<String>(Arrays.asList(charArray));
//        arrayList.add("Red");
//        arrayList.add("Green");
//        arrayList.add("Orange");
//        arrayList.add("White");
//        arrayList.add("Black");

        Collections.sort(arrayList);
        for (String i: arrayList){
            System.out.print(i+" ");
        }
    }
}
