package algorithms.binarysearch;

public final class BinarySearch {
    // Private constructor to prevent instantiation
    private BinarySearch() {
        throw new AssertionError("Cannot instantiate utility class");
    }


    /**
     * Performs binary search on a sorted integer array to find the index of the target value.
     *
     * @param array  the sorted array of integers to be searched (must be in ascending order)
     * @param target the value to be searched for in the array
     * @return the index of the target value if found; -1 if the target is not found in the array
     * @throws IllegalArgumentException if the input array is null
     * @BigO O(log n) — where n is the number of elements in the array
     */
    public static int binarySearch(int[] array, int target) {
        if (array == null) {
            throw new IllegalArgumentException("Input array cannot be null");
        }

        try {
            int left = 0;
            int right = array.length - 1;

            while (left <= right) {
                int mid = left + (right - left) / 2;

                if (array[mid] == target) { // if the target is found
                    return mid;
                } else if (array[mid] < target) { // if the target is greater than the middle element
                    left = mid + 1;
                } else { // if the target is less than the middle element
                    right = mid - 1;
                }
            }
            return -1;
        } catch (ArrayIndexOutOfBoundsException e) {
            // This handles the case when array is empty (length = 0) and we try to access array[0]
            return -1;
        }
    }
}
