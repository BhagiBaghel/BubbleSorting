package com.niit.jdp;

public class SortingAlgorithms {
    /**
     * This method sorts an integer array using bubble sort
     *
     * @param numbers - array to be sorted
     * @return int[] - sorted array
     */
    //int[] numbers = {5, 2, 6, 7, 3};
    public int[] bubbleSort(int[] numbers) {
        for (int pass = 1; pass < numbers.length; pass++) {
            for (int index = 0; index < numbers.length - 1; index++) {
                if (numbers[index] > numbers[index + 1]) {
                    //swap the two values
                    int temp = numbers[index + 1]; //temp = 2
                    numbers[index + 1] = numbers[index]; // numbers[1] = 5
                    numbers[index] = temp; // numbers[0] = 2
                }
            }
        }
        return numbers;
    }

    //int[] numbers = {9, 5, 1, 4, 3};
    public int[] insertionSort(int[] numbers) {
        for (int index = 1; index < numbers.length; index++) {
            //initializing key value to the current index
            int key = numbers[index];
            //assuming that the left side of the key value is sorted
            int sortedPosition = index - 1;
            //while the key value is less than the value at the sorted position (left side)
            //shift the value at the sorted position to the right and decrement the sorted position
            while (sortedPosition >= 0 && numbers[sortedPosition] > key) {
                numbers[sortedPosition + 1] = numbers[sortedPosition];
                sortedPosition--;
            }
            //finally, insert the key value at its correct position in the sorted array
            numbers[sortedPosition + 1] = key;
        }
        return numbers;
    }
}
