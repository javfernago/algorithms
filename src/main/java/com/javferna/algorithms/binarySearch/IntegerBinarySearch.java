package com.javferna.algorithms.binarySearch;

import com.javferna.algorithms.common.IntegerSearch;

/**
 * Binary Search algorithm implementation for an array of integers
 */
public class IntegerBinarySearch implements IntegerSearch {
    @Override
    public int find(int[] data, int number) {
        return find(data, number, 0, data.length-1);
    }

    private int find(int[] data, int number, int start, int end) {
        System.out.println("Binary Search cycle: "+start+":"+end);

        if (end < start) {
            return -1;
        }

        var mid = start + ((end - start) / 2);

        if (data[mid] == number) {
            return mid;
        } else if (data[mid] > number ) {
            return find(data, number, start, mid-1);
        } else if (data[mid] < number) {
            return find(data, number, mid+1, end);
        }

        return -1;
    }
}
