package com.example.time.algorithm;

/**
 * insert sort
 */

public class InsertSort {

	public static int [] insertSort(int [] args){

		if (args == null || args.length < 2) {
			return args;
		}

		int length = args.length;
		for (int i=1; i<length; i++) {

			if (args [i] < args[i-1]) {

				int temp = args[i];
				for (int j=i-1; j>=0; j--) {
					if (args[j] > temp) {
						args[j+1] = args[j];
					} else {
						args[j+1] = temp;
					}
				}

			}
		}
		return args;
	}




}
