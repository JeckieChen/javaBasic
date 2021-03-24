package com.company.Algorithm.sort.sort;

import com.company.Algorithm.sort.Sort;

public class SelectSort <T extends Comparable<T>> extends Sort<T> {
    @Override
    protected void sort() {
        sort(array);
    }

    public void sort(T[] array){
        int min;
        for(int i=0; i<array.length; i++){
            min = i;
            for (int j=i+1; j<array.length; j++){
                if (cmp(array[min], array[j]) > 0) {
                    min = j;
                }
            }
            T tmp = array[min];
            array[min] = array[i];
            array[i] = tmp;
        }
    }
}
