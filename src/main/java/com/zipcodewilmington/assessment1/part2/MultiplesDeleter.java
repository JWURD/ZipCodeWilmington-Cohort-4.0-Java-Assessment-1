package com.zipcodewilmington.assessment1.part2;



import java.util.Arrays;

/**
 * Created by leon on 2/16/18.
 */
public class MultiplesDeleter {

//    public Integer[] remove(Integer[] number, Integer num){
//
//        Integer[] someArray = new Integer[1];
//        int temp;
//        int index = 0;
//        for (int i = 0; i < ints.length; i++) {
//            temp = ints[i];
//            if  (
//                someArray = Arrays.copyOf(cleanArray, index + 1);
//                cleanArray[index] = temp;
//                index++;
//            }
//        }
//
//        return cleanArray;
//
//    }


    public Integer[] deleteEvens(Integer[] ints) {
        Integer[] cleanArray = new Integer[1];
        int temp;
        int index = 0;
        for (int i = 0; i < ints.length; i++) {
            temp = ints[i];
            if  (temp == 1 | temp == 3 | temp == 7 | temp %2 != 0) {
                cleanArray = Arrays.copyOf(cleanArray, index + 1);
                cleanArray[index] = temp;
                index++;
            }
        }

        return cleanArray;
    }
    /**
     * @param ints array of Integer objects
     * @return all ints which are divisible by 2
     * given an array of integers, named `ints` return an identical array with odds removed
     */
    public Integer[] deleteOdds(Integer[] ints) {
        Integer[] cleanArray = new Integer[1];
        int temp;
        int index = 0;
        for (int i = 0; i < ints.length; i++) {
            temp = ints[i];
            if  (temp %2 == 0) {
                cleanArray = Arrays.copyOf(cleanArray, index + 1);
                cleanArray[index] = temp;
                index++;
            }
        }
        return cleanArray;
    }

    /**
     * @param ints array of Integer objects
     * @return all ints which are not divisible by 3
     * given an array of integers, named `ints` return an identical array with numbers indivisible by 3 removed
     */
    public Integer[] deleteMultiplesOf3(Integer[] ints) {
        Integer[] cleanArray = new Integer[1];
        int temp;
        int index = 0;
        for (int i = 0; i < ints.length; i++) {
            temp = ints[i];
            if  (temp %3 != 0) {
                cleanArray = Arrays.copyOf(cleanArray, index + 1);
                cleanArray[index] = temp;
                index++;
            }
        }

        return cleanArray;

    }

    /**
     * @param ints array of Integer objects
     * @param multiple the multiple to evaluate divisibility against
     * @return all ints which are not divisible by the `multiple` specified
     * given an array of integers, named `ints` return an identical array with numbers indivisible by `multiple` removed
     */
    public Integer[] deleteMultiplesOfN(Integer[] ints, int multiple) {
        Integer[] cleanArray = new Integer[1];
        int temp;
        int index = 0;
        for (int i = 0; i < ints.length; i++) {
            temp = ints[i];
            if  ( temp != multiple & temp % multiple != 0) {
                cleanArray = Arrays.copyOf(cleanArray, index + 1);
                cleanArray[index] = temp;
                index++;
            }
        }

        return cleanArray;
    }
}
