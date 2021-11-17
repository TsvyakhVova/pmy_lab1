package com.example.p1;

/**
 * main class
 * @author tsvya
 * @version 1.0
 */
public class Main {
    /**
     * choise Max value for array
     * @param mas -
     * @return max value
     */
    public int Max(int[] mas){
        int max = 0;
        for(int i = 0; i < 3; i++) {
            if (max < mas[i]){
                max = mas[i];
            }
        }
        return max;
    }
    /**
     * choise Min value for array
     * @param mas -
     * @return temp value
     */
    public int Min(int[] mas){
        int min = mas[0];
        for(int i = 0; i < 3; i++) {
            if (min > mas[i]){
                min = mas[i];
            }
        }
        return min;
    }
}
