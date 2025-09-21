package algorithms.binarysearch;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BinarySearchTest {

    @Test
    @DisplayName("Test binarySearch() with null input array should throw IllegalArgumentException")
    @Tag("edge-case")
    void testBinarySearch_withNullArray_shouldThrowException() {
        assertThrows(IllegalArgumentException.class, () -> BinarySearch.binarySearch(null, 5));
    }

    @Test
    @DisplayName("Test binarySearch() with empty array should return -1")
    @Tag("edge-case")
    void testBinarySearch_withEmptyArray_shouldReturnMinusOne() {
        assertEquals(-1, BinarySearch.binarySearch(new int[]{}, 10));
    }

    @Test
    @DisplayName("Test binarySearch() when target is found at beginning")
    @Tag("happy-path")
    void testBinarySearch_targetAtBeginning() {
        int[] input = {1, 3, 5, 7, 9};
        int target = 1;
        assertEquals(0, BinarySearch.binarySearch(input, target));
    }

    @Test
    @DisplayName("Test binarySearch() when target is found at middle")
    @Tag("happy-path")
    void testBinarySearch_targetAtMiddle() {
        int[] input = {1, 3, 5, 7, 9};
        int target = 5;
        assertEquals(2, BinarySearch.binarySearch(input, target));
    }

    @Test
    @DisplayName("Test binarySearch() when target is found at end")
    @Tag("happy-path")
    void testBinarySearch_targetAtEnd() {
        int[] input = {1, 3, 5, 7, 9};
        int target = 9;
        assertEquals(4, BinarySearch.binarySearch(input, target));
    }

    @Test
    @DisplayName("Test binarySearch() when target is not present")
    @Tag("negative")
    void testBinarySearch_targetNotFound() {
        int[] input = {1, 3, 5, 7, 9};
        int target = 4;
        assertEquals(-1, BinarySearch.binarySearch(input, target));
    }

    @Test
    @DisplayName("Test binarySearch() with single-element array where target exists")
    @Tag("edge-case")
    void testBinarySearch_singleElement_targetFound() {
        int[] input = {5};
        int target = 5;
        assertEquals(0, BinarySearch.binarySearch(input, target));
    }

    @Test
    @DisplayName("Test binarySearch() with single-element array where target does not exist")
    @Tag("edge-case")
    void testBinarySearch_singleElement_targetNotFound() {
        int[] input = {3};
        int target = 1;
        assertEquals(-1, BinarySearch.binarySearch(input, target));
    }
}
