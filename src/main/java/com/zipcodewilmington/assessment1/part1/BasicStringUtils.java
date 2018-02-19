package com.zipcodewilmington.assessment1.part1;

/**
 * Created by leon on 2/16/18.
 */
public class BasicStringUtils {
    /**
     * @param str string input from client
     * @return string with identical content, and the first character capitalized
     */
    public static String camelCase(String str) {

        //String s = str.toLowerCase();
        StringBuilder builder = new StringBuilder(str);
        builder.setCharAt(0, Character.toUpperCase(builder.charAt(0)));

        return builder.toString();
    }

    /**
     * @param str string input from client
     * @return string with identical contents, in the reverse order
     */
    public static String reverse(String str) {
        StringBuilder builder = new StringBuilder(str);
        builder.reverse();

        return builder.toString();
    }

    /**
     * @param str string input from client
     * @return string with identical contents, in reverse order, with first character capitalized
     */
    public static String reverseThenCamelCase(String str) {

        String s = reverse(str);


        return camelCase(s);
    }


    /**
     * @param str a string input from user
     * @return string with identical contents excluding first and last character
     */
    public static String removeFirstAndLastCharacter(String str) {
        StringBuilder builder = new StringBuilder(str);
        builder.deleteCharAt(0);
        builder.deleteCharAt(builder.length() - 1);

        return builder.toString();
    }

    /**
     * @param str a string input from user
     * @return string with identical characters, each with opposite casing
     */
    public static String invertCasing(String str) {
        char letter;

         StringBuilder sb = new StringBuilder();

         char[] lettersAsChars = str.toCharArray();

        for (int i = 0; i < lettersAsChars.length; i++) {
            letter = lettersAsChars[i];

            if (Character.isUpperCase(letter)) {
                //lettersAsChars[i] = Character.toLowerCase(letter);
             sb.append(Character.toLowerCase(letter));
            }
            else if(Character.isLowerCase(letter)){
                //lettersAsChars[i] = Character.toUpperCase(letter);
           sb.append(Character.toUpperCase(letter));
            }
            else{
                sb.append(letter);
            }
        }

        return  sb.toString();
    }
}
