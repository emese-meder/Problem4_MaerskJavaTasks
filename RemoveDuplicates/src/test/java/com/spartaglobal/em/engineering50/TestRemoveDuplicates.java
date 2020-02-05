package com.spartaglobal.em.engineering50;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestRemoveDuplicates {

    RemoveDuplicates removeDuplicates = new RemoveDuplicates();

    @Test
    public <T> void testIfLengthIsTwoIfTwoNumbersAreRepeated(){
        Integer[] intArray = new Integer[]{2, 3, 3, 3, 2, 2, 3, 2};
        assertEquals( "[2, 3]", Arrays.toString(removeDuplicates.removeDuplicates(intArray)));

    }

    @Test
    public void testIfLengthIsTwoIfTwoCharactersAreRepeated(){
        Character[] charArray = new Character[]{'c', 'c', 'k', 'c', 'k', 'k'};
        assertEquals("[c, k]",  Arrays.toString(removeDuplicates.removeDuplicates(charArray)));
    }

    @Test
    public void testIfLengthIsThreeIfThreeCharactersAreRepeated(){
        Character[] charArray2 = new Character[]{'c', 'c', 'k', 'c', 'k', 'k', 'p'};
        assertEquals("[c, k, p]",  Arrays.toString(removeDuplicates.removeDuplicates(charArray2)));
    }

    @Test
    public void testIfLengthIsThreeIfThreeIntegersAreRepeated(){
        Integer[] intArray3 = new Integer[]{2, 3, 3, 3, 2,  2, 3, 2, 4};
        assertEquals("[2, 3, 4]",  Arrays.toString(removeDuplicates.removeDuplicates(intArray3)));
    }

    @Test
    public void testForUniqueValuesOnly(){
        Integer[] intArray4 = new Integer[]{1, 2, 3, 4, 6, 5};
        assertEquals("[1, 2, 3, 4, 6, 5]",  Arrays.toString(removeDuplicates.removeDuplicates(intArray4)));
    }

    @Test
    public void testForStringArrayUniqueValues(){
        String[] stringArray = new String[]{"dog", "cat", "fox"};
        assertEquals("[dog, cat, fox]",  Arrays.toString(removeDuplicates.removeDuplicates(stringArray)));
    }

    @Test
    public void testForStringArrayWithRepeats(){
        String[] stringArray2 = new String[]{"dog", "cat","dog", "fox"};
        assertEquals("[dog, cat, fox]",  Arrays.toString(removeDuplicates.removeDuplicates(stringArray2)));
    }

    @Test
    public void testForStringArrayWithFirstElementUnique(){
        String[] stringArray3 = new String[]{"horse", "dog", "cat","dog"};
        assertEquals("[horse, dog, cat]",  Arrays.toString(removeDuplicates.removeDuplicates(stringArray3)));
    }

    @Test
    public void testForStringArrayWithLastElementUnique(){
        String[] stringArray4 = new String[]{ "dog", "cat", "cat" , "dog", "fox"};
        assertEquals("[dog, cat, fox]",  Arrays.toString(removeDuplicates.removeDuplicates(stringArray4)));
    }


}
