package com.sort;

/**
 * Created by wangyuan on 2017/3/16.
 * 冒泡排序
 * 时间复杂度是O(n)
 * 空间复杂度是s(1)
 * 基本思想：在要排序的一组数中，对当前还未排好序的范围内的全部数，自上而下对相邻的两个数依次进行比较和调整，
 * 让较大的数往下沉，较小的往上冒。
 * 即：每当两相邻的数比较后发现它们的排序与排序要求相反时，就将它们互换。
 */
public class BubbleSort extends SortArray {

    @Override
    public void sort(int[] arr) {
        if(arr == null)arr = this.arr;
        final int len = arr == null ? 0 : arr.length;
        for (int i= 0; i < len - 1; i++) {
            for (int j = i + 1; j < len; j++) {
                int temp;
                if(arr[i] > arr[j]) {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        printArr(arr);
    }
}
