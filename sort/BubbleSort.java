package com.cleanmaster.pluginscommonlib;

/**
 * bubble sort
 */
public class BubbleSort {


    public static int [] bubleSort(int [] args){

        if (args == null || args.length <= 1) {
            return args;
        }

        int length = args.length;
        for (int i = 0; i < length; i++) {
            for (int j = i + 1; j < length; j++) {
                if (args[i] < args[j]) {
                    int temp = args[i];
                    args[i] = args[j];
                    args[j] = temp;
                }
            }
        }

        return args;
    }


    public static void main(String[] args) {

        int [] numbs = new int[]{ 0, 3, 19, 50 ,40 ,20 , 44, 2, 3 , 6, 3, 1, 0 };
        numbs = bubleSort(numbs);
        for (int i=0; i<numbs.length; i++){
            System.out.print("--" + numbs[i]);
        }

    }





}
