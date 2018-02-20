package com.zipcodewilmington.assessment1.part4;

public class Jumper {

    /*
     * Complete the function below.
     */
    public int jumps(int k, int j) {
        int score = k;
        int count = 0;

        for (int s = 0; s < k; s++) {
            if (score == 0) {
                break;
            }

            if ((score - j) > 0) {
                score -= j;
                count++;
            } else {
                count++;
               score --;
            }

        }
        return count;
    }
}
