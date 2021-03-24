package com.company.Algorithm.sort.sort;

import com.company.Algorithm.sort.Sort;

public class BubbleSort2 <T extends Comparable<T>> extends Sort<T> {
    @Override
    public void sort() {
        sort(array);
    }

    public void sort(T[] array){
        for(int i=0; i<array.length; i++){
            for (int j=0; j<array.length - 1 - i; j++){
                if (cmp(array[j] , array[j+1]) > 0){
                    T tmp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = tmp;
                }
            }
        }
    }
}
