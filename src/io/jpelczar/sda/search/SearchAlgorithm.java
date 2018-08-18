package io.jpelczar.sda.search;

import java.util.List;

public interface SearchAlgorithm {

    default Integer search(Integer element, List<Integer> input){
        return search(element, input.toArray(new Integer[0]));
    }

    Integer search(Integer element, Integer[] input);

}
