package io.jpelczar.sda.search;

public class LinearSearch implements SearchAlgorithm {

    @Override
    public Integer search(Integer element, Integer[] input) {
        for (int i = 0; i < input.length; i++) {
            if (input[i].equals(element)) {
                return i;
            }
        }
        return -1;
    }
}
