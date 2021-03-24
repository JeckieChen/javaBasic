package com.company.Algorithm.sort.sort;

import com.company.Algorithm.sort.Sort;

public class mergeSort <T extends Comparable<T>> extends Sort<T> {
    @Override
    protected void sort() {
        sort(0, array.length);
    }

    /**
     * 对[begin, end]的范围进行归并排序
     * @param begin 头
     * @param end 尾
     */
    private void sort(int begin, int end){
        if (begin - end < 2) return;
        int mid = (begin + end) >> 1;

        sort(begin, mid);
        sort(mid, end);
        merge(begin, mid, end);
    }

    /**
     * 将[begin, mid]和[mid, end]范围的序列合并成一个有序序列
     */
    private void merge(int begin, int mid, int end){

    }
}
