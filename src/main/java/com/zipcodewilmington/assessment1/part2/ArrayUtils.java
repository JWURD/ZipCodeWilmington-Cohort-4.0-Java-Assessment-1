package com.zipcodewilmington.assessment1.part2;

import java.util.Arrays;

/**
 * Created by leon on 2/16/18.
 */
public class ArrayUtils {
    /**
     * @param objectArray   an array of any type of Object
     * @param objectToCount any non-primitive value
     * @return the number of times the specified `value` occurs in the specified `objectArray`
     * Given an array of objects, named `objectArray`, and an object `objectToCount`, return the number of times the `objectToCount` appears in the `objectArray`
     */
    public static Integer getNumberOfOccurrences(Object[] objectArray, Object objectToCount) {
        Integer count = 0;
        for (Object c : objectArray) {
            if (c == objectToCount) {
                count++;
            }
        }

        return count;
    }

    /**
     * @param objectArray    an array of any type of Object
     * @param objectToRemove a value to be removed from the `objectArray`
     * @return an array with identical content excluding the specified `objectToRemove`
     * Given an array of objects, name `objectArray`, and an object `objectToRemove`, return an array of objects with identical contents excluding `objectToRemove`
     */
    public static Object[] removeValue(Object[] objectArray, Object objectToRemove) {

        int size = (objectArray.length) - getNumberOfOccurrences(objectArray, objectToRemove);
        int index = 0;
        Object[] smallerArray = new Object[size];

        for (int i = 0; i < objectArray.length; i++) {

            if (objectToRemove != objectArray[i]) {
                smallerArray[index] = objectArray[i];

                index++;
            }
        }

        return smallerArray;
    }


    /**
     * @param objectArray an array of any type of Object
     * @return the most frequently occurring object in the array
     * given an array of objects, named `objectArray` return the most frequently occuring object in the array
     */
    public static Object getMostCommon(Object[] objectArray) {
        Integer currentMost = 0;
        Integer temp = 0;
        Object holder;
        Object most = 0;

        for (int i = 0; i < objectArray.length; i++) {
            temp = getNumberOfOccurrences(objectArray, objectArray[i]);
            holder = objectArray[i];
            if (temp > currentMost) {
                currentMost = temp;
                most = holder;
            }
        }
        return most;
    }


    /**
     * @param objectArray an array of any type of Object
     * @return the least frequently occurring object in the array
     * given an array of objects, named `objectArray` return the least frequently occuring object in the array
     */
    public static Object getLeastCommon(Object[] objectArray) {

        Integer currentLeast = 500;
        Integer temp = 0;
        Object holder;
        Object leastCommon = 0;

        for (int i = 0; i < objectArray.length; i++) {
            temp = getNumberOfOccurrences(objectArray, objectArray[i]);
            holder = objectArray[i];
            if (temp < currentLeast) {
                currentLeast = temp;
                leastCommon = holder;
            }
        }
        return leastCommon;
    }


    /**
     * @param objectArray      an array of any type of Object
     * @param objectArrayToAdd an array of Objects to add to the first argument
     * @return an array containing all elements in `objectArray` and `objectArrayToAdd`
     * given two arrays `objectArray` and `objectArrayToAdd`, return an array containing all elements in `objectArray` and `objectArrayToAdd`
     */
    public static Object[] mergeArrays(Object[] objectArray, Object[] objectArrayToAdd) {
        int size = objectArray.length + objectArray.length;
        int index = 0;
        Object[] merge = new Object[size];
        for (int i = 0; i < objectArray.length; i++) {
            merge[i] = objectArray[i];
            index = i;
        }

        // increase index by 1 to get proper index
        index += 1;
        for (int j = 0; j < objectArrayToAdd.length; j++) {
            merge[index + j] = objectArrayToAdd[j];
        }
        return merge;
    }

}
