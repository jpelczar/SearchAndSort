package io.jpelczar.sda.search;

public class BinarySearchIter implements SearchAlgorithm {

    @Override
    public Integer search(Integer element, Integer[] input) {
        int low = 0;
        int hight = input.length - 1;
        while (low <= hight) {
            int mid = (low + hight) / 2;
            if (input[mid] > element) {
                hight = mid - 1;
            } else if (input[mid] < element) {
                low = mid + 1;
            } else {
                return mid;
            }
        }
        return -1;
    }
}
