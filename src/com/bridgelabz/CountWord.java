package com.bridgelabz;

import java.util.Hashtable;

public class CountWord {

    //Main method
    public static void main(String[] args) {
        Hashtable<String, Integer> hashtable = new Hashtable<>();

        //A sentence of type string
        String str = "To be or not to be";

        //Code to count the frequency of words in sentence
        String[] splitArray = str.toLowerCase().split(" ");
        for (int i = 0; i < splitArray.length; i++) {
            if (hashtable.containsKey(splitArray[i])) {
                int count = hashtable.get(splitArray[i]);
                hashtable.put(splitArray[i], count + 1);
            } else {
                hashtable.put(splitArray[i], 1);
            }
        }

        //Printing the number of frequency of words in sentence
        System.out.println("The count of each word in sentence is: " + hashtable);
    }
}