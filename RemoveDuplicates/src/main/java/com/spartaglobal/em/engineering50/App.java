package com.spartaglobal.em.engineering50;


import java.util.Arrays;

public class App
{
    public static void main( String[] args ) {
        RemoveDuplicates removeDuplicates =new RemoveDuplicates();
        Integer[] intArray = new Integer[]{2, 3, 5, 3, 4, 5, 4, 4};
        System.out.println(Arrays.toString(removeDuplicates.removeDuplicates(intArray)) );
    }
}
