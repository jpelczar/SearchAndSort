package io.jpelczar.sda.sort;

import io.jpelczar.sda.Util;

public class HeapSort implements SortingAlgorithm {

    @Override
    public Integer[] sort(Integer[] input) {
        return shiftHeap(heapify(input));
    }

    private Integer[] heapify(Integer[] input) {
        Integer[] result = input.clone();

        for (int i = 1; i < result.length; i++) {
            int currentNodeIndex = i;
            int parentIndex = getParentIndex(currentNodeIndex);
            int insertedValue = result[currentNodeIndex];
            while (parentIndex >= 0 && result[parentIndex] < insertedValue) {
                Util.swap(result, currentNodeIndex, parentIndex);
                currentNodeIndex = parentIndex;
                parentIndex = getParentIndex(currentNodeIndex);
            }
            result[currentNodeIndex] = insertedValue;
        }

        return result;
    }

    private Integer[] shiftHeap(Integer[] input) {
        Integer[] result = input.clone();

        for (int i = result.length - 1; i > 0; i--) {
            Util.swap(result, 0, i); //0 is a root eleemnt index
            int parentIndex = 0;
            int leftChildIndex = 1;
            while (leftChildIndex < i) {
                //Choose greater child
                int greaterChildIndex = leftChildIndex;
                int rightChildIndex = leftChildIndex + 1;
                if (rightChildIndex < i && result[rightChildIndex] > result[leftChildIndex]) {
                    greaterChildIndex = rightChildIndex;
                }
                //Compare child with parent
                if (result[greaterChildIndex] <= result[parentIndex]) {
                    break;
                }
                //If child is greater than child then swap child with parent and got to the next node
                Util.swap(result, parentIndex, greaterChildIndex);
                parentIndex = greaterChildIndex;
                leftChildIndex = getLeftChildIndex(parentIndex);
            }
        }
        return result;
    }

    private int getParentIndex(int index) {
        return (index <= 0) ? -1 : (index - 1) / 2;
    }

    private int getLeftChildIndex(int index) {
        return 2 * index + 1;
    }
}
