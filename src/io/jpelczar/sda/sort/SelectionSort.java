package io.jpelczar.sda.sort;

import io.jpelczar.sda.Util;

public class SelectionSort implements SortingAlgorithm {

    @Override
    public Integer[] sort(Integer[] input) {
        Integer[] result = input.clone();

        for (int i = 0; i < result.length - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < result.length; j++) {
                if (result[j] < result[minIndex]) {
                    minIndex = j;
                }
            }
            Util.swap(result, i, minIndex);
        }
        return result;
    }
}
