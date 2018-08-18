package io.jpelczar.sda.sort;

public class MergeSort implements SortingAlgorithm {

    @Override
    public Integer[] sort(Integer[] input) {
        return mergeSort(input, 0, input.length - 1);
    }

    private Integer[] mergeSort(Integer[] input, int left, int right) {
        Integer[] result = input.clone();

        if (left < right) {
            int mid = (left + right) / 2;
            result = mergeSort(result, left, mid);
            result = mergeSort(result, mid + 1, right);
            result = simpleMerge(result, left, mid, right);
        }
        return result;
    }

    private Integer[] merge(Integer[] input, int left, int mid, int right) {
        Integer[] result = input.clone();

        int i, j;
        Integer[] temp = new Integer[result.length];
        for (i = mid + 1; i > left; i--) {
            temp[i - 1] = result[i - 1];
        }
        for (j = mid; j < right; j++) {
            temp[right + mid - j] = result[j + 1];
        }

        for (int k = left; k <= right; k++) {
            if (temp[j] < temp[i]) {
                result[k] = temp[j];
                j--;
            } else {
                result[k] = temp[i];
                i++;
            }
        }

        return result;
    }

    private static Integer[] simpleMerge(Integer[] input, int left, int mid, int right) {
        Integer[] result = input.clone();

        Integer[] temp = new Integer[result.length];
        int leftIndex = left;
        int rightIndex = mid + 1;

        for (int i = left; i <= right; i++) {
            if (leftIndex > mid || (rightIndex <= right && result[rightIndex] < result[leftIndex])) {
                temp[i] = result[rightIndex];
                rightIndex++;
            } else {
                temp[i] = result[leftIndex];
                leftIndex++;
            }
        }

        for (int i = left; i <= right; i++) {
            result[i] = temp[i];
        }

        return result;
    }
}
