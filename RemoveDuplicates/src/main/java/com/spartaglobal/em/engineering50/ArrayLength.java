package com.spartaglobal.em.engineering50;

public class ArrayLength {

    public <T> int getLengthWithoutDuplicates(T[] array){
        String newList = "";
        int count = 0;
        T[] newArray = (T[]) new  Object[count];
        for (int i = 0; i < array.length; i++){
            for (int j = array.length -1; j >= 0; j--){
                if (!array[i].equals(array[j])  && !newList.contains(array[j].toString())){
                    newList = newList + array[j] + " ";
                    count++;
                }
            }
        }
        return count;
    }
}
