package com.sort;

/**
 * Created by wangyuan on 2017/3/16.
 * 简单选择排序
 * 基本思想：在要排序的一组数中，选出最小的一个数与第一个位置的数交换；
 * 然后在剩下的数当中再找最小的与第二个位置的数交换，如此循环到倒数第二个数和最后一个数比较为止。
 * 时间复杂度O(n*n) 空间复杂度的s(1)
 */
public class SimpleSort extends SortArray {

    @Override
    public void sort(int[] arr) {
        if(arr == null)arr = this.arr;
        int position = 0;
        final int len = arr.length;
        for (int i = 0; i < len; i++) {
            position = i;
            int temp = arr[i];
            for (int j = i + 1; j < len; j++) {
                if(arr[j] < temp) {
                    temp = arr[j];
                    position = j;
                }
            }
            arr[position] = arr[i];
            arr[i] = temp;
        }
        printArr(arr);
    }
}
