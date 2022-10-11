package cz.acamar.tasks;

import java.util.Arrays;
import java.util.List;

public class Task2 {

    /**
     * Task 2. Squares of a sorted array.
     * <p>
     * Given an integer array sorted in non-decreasing order,
     * return an array of the squares of each number sorted in non-decreasing order.
     * <p>
     * Example input: [-4,-1,0,3,10]
     * Expected output: [0,1,9,16,100]
     * <p>
     * Explanation: After squaring, the array becomes [16,1,0,9,100].
     * After sorting, it becomes [0,1,9,16,100].
     *
     * @param input - an integer array sorted in non-decreasing order
     * @return - an array of the squares of each number sorted in non-decreasing order
     */
    public int[] squaresOfSortedArray(int[] input) {
        if (input.length == 0) {
            return input;
        }
        if (input.length == 1) {
            input[0] = input[0] * input[0];
            return input;
        }
        int headIndex = 0;
        int tailIndex = input.length - 1;
        int[] result = new int[input.length];
        int curIndex = tailIndex;
        while (curIndex >= 0) {
            int head = input[headIndex];
            int tail = input[tailIndex];
            int headSq = head * head;
            int tailSq = tail * tail;
            if (headSq > tailSq) {
                result[curIndex] = headSq;
                headIndex++;
                curIndex--;
            } else {
                result[curIndex] = tailSq;
                tailIndex--;
                curIndex--;
            }
        }
        return result;
    }
}
