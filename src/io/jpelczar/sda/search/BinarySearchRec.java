package io.jpelczar.sda.search;

public class BinarySearchRec implements SearchAlgorithm {

    @Override
    public Integer search(Integer element, Integer[] input) {
        return search(element, input, 0, input.length - 1);
    }

    private Integer search(Integer element, Integer[] input, int low, int high) {
        if (high < low) {
            return -1;
        }
        int mid = (low + high) / 2;
        if (input[mid] > element) {
            return search(element, input, low, mid - 1);
        } else if (input[mid] < element) {
            return search(element, input, mid + 1, high);
        }
        return mid;
    }
}
