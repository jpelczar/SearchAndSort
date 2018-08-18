package io.jpelczar.sda.search;

import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class SearchMain {
    public static void main(String[] args) {
        List<Integer> list = IntStream.of(0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10).boxed().collect(Collectors.toList());
        Integer toSearch = new Random().nextInt(15);
        System.out.println("array = " + list);

        SearchAlgorithm linear = new LinearSearch();
        System.out.println("Linear search of " + toSearch + " index: " + linear.search(toSearch, list));

        SearchAlgorithm binaryRec = new BinarySearchRec();
        System.out.println("Binary rec search of " + toSearch + " index: " + binaryRec.search(toSearch, list));

        SearchAlgorithm binaryIter = new BinarySearchIter();
        System.out.println("Binary iter search of " + toSearch + " index: " + binaryIter.search(toSearch, list));
    }
}
