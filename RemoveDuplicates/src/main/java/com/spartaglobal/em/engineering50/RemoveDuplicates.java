package com.spartaglobal.em.engineering50;
/*
Problem 4: Remove duplicates from an array
Write a program to remove duplicates from an array in Java
without using the Java Collection API.
The array can be an array of String, Integer or Character,
your solution should be independent of the type of array.

Please write the unit tests for your solution using any of the unit testing framework.

 */

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Objects;

import static java.lang.Character.isWhitespace;

public class RemoveDuplicates {

    public <T> T[] removeDuplicates(T[] array){
        //ArrayList<T> newList = new ArrayList<>();
        String newList = "";
        int count = 0;
        T[] newArray = (T[]) new  Object[count];
        for (int i = 0; i < array.length; i++){
            for (int j = array.length - 1; j > i; j--){
                if (!array[i].equals(array[j])  && i != j && !newList.contains(array[i].toString())){
                    newList = newList + array[i] + " ";
                    count++;
                    System.out.println(count);
                    newArray = (T[]) new  Object[count];
                    newArray[count-1] = array[i];
                }
            }

        }



        System.out.println( newList);
        System.out.println(count);


        return newArray;
    }

}