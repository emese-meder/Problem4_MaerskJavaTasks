package com.spartaglobal.em.engineering50;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestArrayLength {

    ArrayLength arrayLength = new ArrayLength();

    @Test
    public void testIfLengthIsTwoIfTwoNumbersAreRepeated(){
        Integer[] intArray = new Integer[]{2, 3, 3, 3, 2, 2, 3, 2};
        assertEquals(2, arrayLength.getLengthWithoutDuplicates(intArray));
    }

    @Test
    public void testIfLengthIsTwoIfTwoCharactersAreRepeated(){
        Character[] charArray = new Character[]{'c', 'c', 'k', 'c', 'k', 'k'};
        assertEquals(2, arrayLength.getLengthWithoutDuplicates(charArray));
    }

    @Test
    public void testIfLengthIsThreeIfThreeCharactersAreRepeated(){
        Character[] charArray2 = new Character[]{'c', 'c', 'k', 'c', 'k', 'k', 'p'};
        assertEquals(3, arrayLength.getLengthWithoutDuplicates(charArray2));
    }

    @Test
    public void testIfLengthIsThreeIfThreeIntegersAreRepeated(){
        Integer[] intArray2 = new Integer[]{2, 3, 3, 3, 2,  2, 3, 2, 4};
        assertEquals(3, arrayLength.getLengthWithoutDuplicates(intArray2));
    }

    @Test
    public void testForUniqueValuesOnly(){
        Integer[] intArray4 = new Integer[]{1, 2, 3, 4, 6, 5};
        assertEquals(intArray4.length, arrayLength.getLengthWithoutDuplicates(intArray4));
    }

    @Test
    public void testForStringArrayUniqueValues(){
        String[] stringArray = new String[]{"dog", "cat", "fox"};
        assertEquals(stringArray.length, arrayLength.getLengthWithoutDuplicates(stringArray));
    }

    @Test
    public void testForStringArrayWithRepeats(){
        String[] stringArray = new String[]{"dog", "cat","dog", "fox"};
        assertEquals( 3, arrayLength.getLengthWithoutDuplicates(stringArray));
    }

    @Test
    public void testForStringArrayWithFirstElementUnique(){
        String[] stringArray = new String[]{"horse", "dog", "cat","dog", "fox"};
        assertEquals( 4, arrayLength.getLengthWithoutDuplicates(stringArray));
    }

    @Test
    public void testForStringArrayWithLastElementUnique(){
        String[] stringArray = new String[]{ "dog", "cat","dog", "fox"};
        assertEquals( 3, arrayLength.getLengthWithoutDuplicates(stringArray));
    }


}
