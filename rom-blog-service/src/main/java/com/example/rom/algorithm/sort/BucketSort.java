package com.example.rom.algorithm.sort;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;

//TODO
public class BucketSort {

    static int[] bucketSort(int[] array, int minVisit, int maxVisit) {
        int bucketNum = array.length;
        ArrayList<LinkedList<Integer>> bucketList = new ArrayList<>(bucketNum);

        for (int i = 0; i < bucketNum; i++) {
            bucketList.add(new LinkedList<Integer>());
        }

        /* visitNum added to bucketList */
        for (int j : array) {
            int index = (int) ((j - minVisit) * (bucketNum - 1) / (maxVisit - minVisit));  // confirm Interval span
            bucketList.get(index).add(j);
        }

        for (LinkedList<Integer> integers : bucketList) {
            Collections.sort(integers);
        }

        int[] sortedArray = new int[array.length];
        int idx = 0;
        for (LinkedList<Integer> list : bucketList) {
            for (int element : list) {
                sortedArray[idx] = element;
                idx++;
            }
        }

        return sortedArray;
    }


    public static void main(String[] args) {
        int maxVisit = 100;
        int minVisit = 5;
        int[] visitNum = {6, 21, 8, 34, 66, 98, 5, 32, 45, 56, 100};  // visit num for url access

        bucketSort(visitNum, minVisit, maxVisit);  // O(n)
    }
}
