package com.sort;

/**
 * Created by wangyuan on 2017/3/16.
 * 1，冒泡排序
 * 2，简单选择排序
 * 3，直接插入排序
 * 4，快速排序
 *
 * 5，归并排序
 * 6，堆排序
 * 7，希尔排序(最小增量排序)
 * 8，基数排序
 */
public abstract class SortArray {

    public int[] arr = {70, 57, 42, 62, 83, 49,38,65,97,76,13,27,49,78,34,12,64,5,4,62,99,98,54,56,17,18,23,34,15,35,25,53,51};

    public abstract void sort(int[] arr);

    protected void printArr(int[] arr) {
        final int len = arr == null ? 0 : arr.length;
        for (int i= 0; i < len; i++) {
            System.out.print(i == 0 ? arr[i] : "," + arr[i]);
        }
    }
}
