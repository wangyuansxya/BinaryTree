package com.sort;

/**
 * Created by wangyuan on 2017/3/16.
 * 快速排序
 * 基本思想：选择一个基准元素，通常是第一个或者最后一个，通过一趟扫描，将待排序的元素分为俩部分，
 * 一部分小于基准元素，一部分大于等于比基准元素
 * 此时基准元素位于其排好序的正确的位置
 * 然后再用同样的方法递归
 */
public class QuickSort extends SortArray{
    @Override
    public void sort(int[] arr) {
        if(arr == null)arr = this.arr;
        final int len = arr.length;
        quickSort(arr, 0 , len - 1);
        printArr(arr);
    }


    private void quickSort(int[] arr, int low, int high) {
        if(low < high) {
            int middle = getMiddle(arr, low, high);
            quickSort(arr, low, middle - 1);
            quickSort(arr, middle + 1, high);
        }
    }

    private int getMiddle(int[] arr, int low, int high) {
        int middle = 0;
        int temp = arr[low];//数组的第一个作为中轴
        while (low < high) {
            while (low < high && arr[high] >= temp) {
                high--;
            }
            arr[low] = arr[high];// //比中轴小的记录移到低端
            while (low < high && arr[low] <= temp) {
                low ++;
            }
            arr[high] = arr[low];//比中轴大的记录移到高端
        }
        arr[low] = temp;
        middle = low;//返回中轴的位置
        return middle;
    }

}