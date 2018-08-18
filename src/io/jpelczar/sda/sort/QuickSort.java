package io.jpelczar.sda.sort;

import io.jpelczar.sda.Util;

public class QuickSort implements SortingAlgorithm {

    @Override
    public Integer[] sort(Integer[] input) {
        return quickSort(input, 0, input.length - 1);
    }

    private Integer[] quickSort(Integer[] input, int left, int right) {
        Integer[] result = input.clone();

        int mid = (left + right) / 2;
        int firstGreaterThanPivot = left;
        int pivot = result[mid];
        result[mid] = result[right];
        for (int i = left; i < right; i++) {
            if (result[i] < pivot) {
                Util.swap(result, i, firstGreaterThanPivot);
                firstGreaterThanPivot++;
            }
        }
        result[right] = result[firstGreaterThanPivot];
        result[firstGreaterThanPivot] = pivot;

        if (left < firstGreaterThanPivot - 1) {
            result = quickSort(result, left, firstGreaterThanPivot - 1);
        }
        if (firstGreaterThanPivot + 1 < right) {
            result = quickSort(result, firstGreaterThanPivot + 1, right);
        }

        return result;
    }
}