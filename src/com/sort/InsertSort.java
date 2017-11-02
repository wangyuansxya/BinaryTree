package com.sort;

/**
 * Created by wangyuan on 2017/3/16.
 * 直接插入排序
 * 基本思想：在要排序的一组数中，假设前面(n-1)[n>=2] 个数已经是排
 * 好顺序的，现在要把第n个数插到前面的有序数中，使得这n个数
 * 也是排好顺序的。如此反复循环，直到全部排好顺序。
 * 时间复杂度o(n*n) 空间复杂度s(1)
 */
public class InsertSort extends SortArray {
    @Override
    public void sort(int[] arr) {
        if (arr == null) arr = this.arr;
        final int len = arr.length;
        int temp = 0;
        for (int i = 1; i < len; i++) {
            int j = i -1;
            temp = arr[i];
            while (j >= 0 && temp < arr[j]) {//将大于temp的值整体后移一个单位
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = temp;
        }
        printArr(arr);
    }
}
