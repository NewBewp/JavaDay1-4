package bai1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        findNonRepeatingChar();
    }
    public static void findNonRepeatingChar() {
        String input = "gbblegabbler";
        char[] charsArray = input.toCharArray();
        char temp ='_';

        for (int i = 0;i<charsArray.length;i++){
            for (int j = 1;j<charsArray.length;j++){
                if(charsArray[i]!=charsArray[j]) {
                    temp = charsArray[j];
                    break;
                }
                else {
                    System.out.println("Non Repeating Char Not Find");
                }
            }
            if (temp != '_') {
                System.out.println(temp);
                break;
            }
        }
    }

//    public static void findNonRepeatingCharHashmap(){
//        String input = "gibblegabbler";
//        char[] charsArray = input.toCharArray();
//        //Use Hashmap to store char not repeat
//        HashMap<Integer,Integer> hashMap = new HashMap();
//
//        ArrayList<Character> charOrderList = new ArrayList<>();
//
//        for(char i: charsArray){
//            hashMap.put(c,)
//        }
//    }
}