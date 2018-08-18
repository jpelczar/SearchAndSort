package io.jpelczar.sda.sort;

import io.jpelczar.sda.Util;

public class BubbleSort2 implements SortingAlgorithm {

    @Override
    public Integer[] sort(Integer[] input) {
        Integer[] result = input.clone();

        for (int i = result.length - 1; i >= 0; i--) {
            for (int j = 0; j < i; j++) {
                if (result[j] > result[j + 1]) {
                    Util.swap(result, j, j + 1);
                }
            }
        }
        return result;
    }
}
