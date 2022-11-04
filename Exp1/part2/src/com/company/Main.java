package com.company;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        ArrayList<Integer> sortedArray1 = new ArrayList<Integer>();
        ArrayList<Integer> sortedArray2 = new ArrayList<Integer>();
        /*
            use 20000 for bubble sort and 10e6 for efficient sort
         */
        int nu = 9000000;
//        int nu = 8000000;
        for (int i = 0; i < nu; i++) {
            sortedArray2.add(nu-i);
        }
        for (int i = sortedArray2.size(); i < (2 * sortedArray2.size()); i++) {
            sortedArray1.add(2*nu-i);
        }
        mergeTwoSortedArray(sortedArray1, sortedArray2);
    }

    private static void mergeTwoSortedArray(ArrayList<Integer> sortedArray1, ArrayList<Integer> sortedArray2) {
        ArrayList<Integer> rawArraylist = new ArrayList<Integer>();
        rawArraylist.addAll(sortedArray1);
        rawArraylist.addAll(sortedArray2);

        int L[] = new int[rawArraylist.size()];
        int R[] = new int[rawArraylist.size()];


        mergeSort(L, R, rawArraylist, 0, rawArraylist.size()-1);
//        bubbleSort(rawArraylist);


    }
    static void bubbleSort(ArrayList<Integer> arr){
        int n = arr.size();
        for (int i = 0; i < n-1; i++) {
            if(i % 1000 == 0)
                System.out.println(i);
            for (int j = 0; j < n - i - 1; j++)
                if (arr.get(j) > arr.get(j + 1)) {
                    // swap arr[j+1] and arr[j]
                    int temp = arr.get(j);
                    arr.set(j, arr.get(j + 1));
                    arr.set(j + 1, temp);
                }
        }
    }

    static void mergeSort(int[] L, int[] R, ArrayList<Integer> arr, int l , int r){
        int m = l + (r - l) / 2;
//        System.out.println(m+"  "+l+"  "+ r);
        if(l < r) {
            mergeSort(L, R, arr, l, m);
            mergeSort(L, R, arr, m + 1, r);
            efficientSort(L, R, arr, l, m, r);
        }
        // Merge the sorted halves

    }
    static void efficientSort(int[] L, int[] R, ArrayList<Integer> rawArraylist, int l, int m, int r){
        int n1 = m - l + 1;
        int n2 = r - m;

        /*Copy data to temp arrays*/
        for (int i = 0; i < n1; ++i)
            L[i] = rawArraylist.get(l + i);
        for (int j = 0; j < n2; ++j)
            R[j] = rawArraylist.get(m + 1 + j);

        /* Merge the temp arrays */

        // Initial indexes of first and second subarrays
        int i = 0, j = 0;

        // Initial index of merged subarray array
        int k = l;
        while (i < n1 && j < n2) {
            if (L[i] <= R[j]) {
                rawArraylist.set(k, L[i]);
                i++;
            }
            else {
                rawArraylist.set(k, R[j]);
                j++;
            }
            k++;
        }

        /* Copy remaining elements of L[] if any */
        while (i < n1) {
            rawArraylist.set(k, L[i]);
            i++;
            k++;
        }

        /* Copy remaining elements of R[] if any */
        while (j < n2) {
            rawArraylist.set(k, R[j]);
            j++;
            k++;
        }
    }
}