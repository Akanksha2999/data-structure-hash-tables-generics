package com.bridgelabz;

import java.util.Hashtable;

public class CountWord {
    public static void main(String[] args) {
        Hashtable<String, Integer> hashtable = new Hashtable<>();
        String str = "To be or not to be";

        String[] splitArray = str.toLowerCase().split(" ");
        for (int i = 0; i < splitArray.length; i++) {
            if (hashtable.containsKey(splitArray[i])) {
                int count = hashtable.get(splitArray[i]);
                hashtable.put(splitArray[i], count + 1);
            } else {
                hashtable.put(splitArray[i], 1);
            }
        }
        System.out.println("The count of each word in sentence is: " + hashtable);
    }
}