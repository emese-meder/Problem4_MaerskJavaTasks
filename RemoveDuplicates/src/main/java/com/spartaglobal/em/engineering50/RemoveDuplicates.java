package com.spartaglobal.em.engineering50;
/*
Problem 4: Remove duplicates from an array
Write a program to remove duplicates from an array in Java
without using the Java Collection API.
The array can be an array of String, Integer or Character,
your solution should be independent of the type of array.

Please write the unit tests for your solution using any of the unit testing framework.

 */

public class RemoveDuplicates {

    public <T> T[] removeDuplicates(T[] array) {
        ArrayLength arrayLength = new ArrayLength();
        String newList = "";
        int count = arrayLength.getLengthWithoutDuplicates(array);
        T[] newArray = (T[]) new Object[count];
        int k = 0;
        int i = 0;
        while (i < array.length && k<count ) {
            if (!newList.contains(array[i].toString())) {
                //System.out.println(array[i]);
                newList = newList + array[i] + " ";
                newArray[k] = array[i];
                k++;
            }
            i++;

        }
        return newArray;
    }
}