package algorithms;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static algorithms.binarysearch.BinarySearch.binarySearch;

public class Main {
    private static final Logger logger = LoggerFactory.getLogger(Main.class);

    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int target = 78;
        
        logger.debug("Starting binary search for target: {}", target);
        int result = binarySearch(array, target);
        
        if (result == -1) {
            logger.info("Target {} not found in the array", target);
        } else {
            logger.info("Target {} found at index: {}", target, result);
        }
    }
}
