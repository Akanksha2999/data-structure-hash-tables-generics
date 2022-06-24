package com.bridgelabz;

import java.util.Hashtable;
import java.util.Map;

public class CountWord {

    //Main method
    public static void main(String[] args) {
        Hashtable<String, Integer> hashtable = new Hashtable<>();

        //A paragraph of type string
        String str = "Paranoids are not paranoid because they are paranoid but because they keep putting themselves deliberately into paranoid avoidable situations";
        str = str.replace("avoidable", " ");

        //Converting all the uppercase word to lower case
        String[] splitArray = str.toLowerCase().split(" ");

        //Code to count the frequency of words in paragraph
        for (int i = 0; i < splitArray.length; i++) {
            if (hashtable.containsKey(splitArray[i])) {
                int count = hashtable.get(splitArray[i]);
                hashtable.put(splitArray[i], count + 1);
            } else {
                hashtable.put(splitArray[i], 1);
            }
        }

        //Printing all frequency of words in paragraph
        for (Map.Entry entry : hashtable.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
    }
}