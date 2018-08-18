package io.jpelczar.sda.sort;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;

public interface SortingAlgorithm {

    default List<Integer> sort(Collection<Integer> input){
        return Arrays.asList(sort(input.toArray(new Integer[0])));
    }

    Integer[] sort(Integer[] input);

}
