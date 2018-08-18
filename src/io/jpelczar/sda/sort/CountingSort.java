package io.jpelczar.sda.sort;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CountingSort implements SortingAlgorithm {

    private final int maxElement;

    public CountingSort(int maxElement) {
        this.maxElement = maxElement + 1;
    }

    @Override
    public Integer[] sort(Integer[] input) {
        List<Integer> counter = new ArrayList<>(Collections.nCopies(maxElement, 0));
        for (int value : input) {
            counter.set(value, counter.get(value) + 1);
        }

        List<Integer> resultList = new ArrayList<>();
        for (int i = 0; i < counter.size(); i++) {
            resultList.addAll(Collections.nCopies(counter.get(i), i));
        }


        return resultList.toArray(new Integer[0]);
    }
}
