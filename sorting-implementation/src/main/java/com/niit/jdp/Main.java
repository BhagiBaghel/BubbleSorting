package com.niit.jdp;

public class Main {
    public static void main(String[] args) {
        SortingAlgorithms sortingAlgorithms = new SortingAlgorithms();
        int[] numbers = {9, 29, 46, 5, 1, 4, 3, 5, 10, 0};
        numbers = sortingAlgorithms.bubbleSort(numbers);
        System.out.println("Numbers in Bubble Sort :");
        for (int number : numbers) {
            System.out.print(number + ", ");
        }
        System.out.println();
        System.out.println();
        int[] moreNumbers = {45, 23, 11, 89, 77, 98, 4, 28, 65, 43};
        moreNumbers = sortingAlgorithms.insertionSort(moreNumbers);
        System.out.println("Numbers in Insertion Sort :");
        for (int moreNumber : moreNumbers) {
            System.out.print(moreNumber + ", ");
        }
        System.out.println();
    }
}