package io.jpelczar.sda.sort;

public class ShellSort implements SortingAlgorithm {

    @Override
    public Integer[] sort(Integer[] input) {
        Integer[] result = input.clone();

        int size = result.length;
        int spread = 1;
        while (spread >= size) {
            spread = spread * 3 + 1;
        }

        spread /= 9;

        spread = (spread == 0) ? 1 : spread;

        while (spread > 0) {
            for (int j = size - spread; j >= 0; j--) {
                int x = result[j];
                int i = j + spread;
                while (i < size && x > result[i]) {
                    result[i - spread] = result[i];
                    i += spread;
                }
                result[i - spread] = x;
            }
            spread /= 3;
        }

        return result;
    }
}
