package io.jpelczar.sda.sort;

import io.jpelczar.sda.Util;

import java.util.Collection;
import java.util.List;

public class BubbleSort implements SortingAlgorithm {

    @Override
    public Integer[] sort(Integer[] input) {
        Integer[] result = input.clone();

        for (int i = 0; i < result.length - 1; i++) {
            for (int j = 0; j < result.length - 1; j++) {
                if (result[j] > result[j + 1]) {
                    Util.swap(result, j, j + 1);
                }
            }
        }
        return result;
    }
}
