package io.jpelczar.sda.sort;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Random;
import java.util.stream.IntStream;

public class SortMain {
    public static void main(String[] args) {
        Random random = new Random();
        Integer[] array = IntStream.range(0, random.nextInt(40) + 10).map(item -> random.nextInt(500))
                .boxed().toArray(Integer[]::new);
        System.out.println("Input array:\t" + Arrays.toString(array));

        Integer[] sorted = new BubbleSort().sort(array.clone());
        System.out.println("Bubble sort:\t" + Arrays.toString(sorted));

        sorted = new BubbleSort2().sort(array.clone());
        System.out.println("Bubble sort 2:\t" + Arrays.toString(sorted));

        sorted = new SelectionSort().sort(array.clone());
        System.out.println("Selection sort:\t" + Arrays.toString(sorted));

        sorted = new MergeSort().sort(array.clone());
        System.out.println("Merge sort:\t\t" + Arrays.toString(sorted));

        sorted = new QuickSort().sort(array.clone());
        System.out.println("Quick sort:\t\t" + Arrays.toString(sorted));

        sorted = new HeapSort().sort(array.clone());
        System.out.println("Heap sort:\t\t" + Arrays.toString(sorted));

        sorted = new CountingSort(Arrays.stream(array).max(Comparator.comparingInt(o -> o)).orElse(0))
                .sort(array.clone());
        System.out.println("Counting sort:\t" + Arrays.toString(sorted));

        sorted = new ShellSort().sort(array.clone());
        System.out.println("Shell sort:\t\t" + Arrays.toString(sorted));
    }
}
