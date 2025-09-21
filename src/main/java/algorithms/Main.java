package algorithms;

import static algorithms.binarysearch.BinarySearch.binarySearch;

//import static java.util.Arrays.binarySearch;
//
public class Main {
    public static void main(String[] args) {

        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int target = 78;
        int result = binarySearch(array, target);
        System.out.println("Target found at index: " + result);
    }
}
