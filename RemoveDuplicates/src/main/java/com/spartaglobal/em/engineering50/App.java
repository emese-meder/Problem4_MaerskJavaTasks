package com.spartaglobal.em.engineering50;


import java.util.Arrays;

public class App
{
    public static void main( String[] args ) {
        RemoveDuplicates removeDuplicates =new RemoveDuplicates();
        ArrayLength arrayLength = new ArrayLength();
        Integer[] intArray = new Integer[]{2, 3, 5, 3, 4, 5, 4, 4, 6};
        System.out.println("count: " + arrayLength.getLengthWithoutDuplicates(intArray));
        System.out.println(Arrays.toString(removeDuplicates.removeDuplicates(intArray)) );
    }

}
