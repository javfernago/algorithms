package com.javferna.algorithms.binarySearch;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class IntegerBinarySearchTest {

    @Test
    public void should_find_number_if_exits() {
        IntegerBinarySearch integerBinarySearch = new IntegerBinarySearch();
        int[] data = {1,2,3,4,5,6,7,8,9,10};

        for (int i = 1; i <=10; i++ ) {
            var index = integerBinarySearch.find(data, i);
            assertEquals(i-1,index);
            System.out.println("---------------------------------");
        }

    }

    @Test
    public void should_not_find_number_if_not_exists() {
        IntegerBinarySearch integerBinarySearch = new IntegerBinarySearch();
        int[] data = {1,2,3,4,5,6,7,8,9,10};

        var index = integerBinarySearch.find(data, 20);
        assertEquals(-1,index);

        index = integerBinarySearch.find(data, 0);
        assertEquals(-1,index);
    }

    @Test
    public void should_find_number_in_big_arrays() {
        int size = 100000;
        IntegerBinarySearch integerBinarySearch = new IntegerBinarySearch();

        int[] data = new int[size];

        for (int i=0; i < size; i++) {
            data[i]=i*2;
        }

        for (int i=0; i < size; i++) {
            var index = integerBinarySearch.find(data, i*2);
            assertEquals(i,index);
            System.out.println("---------------------------------");
        }
    }

    @Test
    public void should_not_find_number_in_big_arrays() {
        int size = 100000;
        IntegerBinarySearch integerBinarySearch = new IntegerBinarySearch();

        int[] data = new int[size];

        for (int i=0; i < size; i++) {
            data[i]=i*2;
        }

        for (int i=0; i < size; i++) {
            var index = integerBinarySearch.find(data, i*2-1);
            assertEquals(-1,index);
            System.out.println("---------------------------------");
        }
    }
}
