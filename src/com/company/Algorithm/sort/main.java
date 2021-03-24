package com.company.Algorithm.sort;

import com.company.Algorithm.sort.sort.BubbleSort;
import com.company.Algorithm.sort.sort.QuickSort;
import com.company.Algorithm.sort.sort.SelectSort;
import com.company.Algorithm.sort.tools.Asserts;
import com.company.Algorithm.sort.tools.Integers;

import java.util.Arrays;

    public class main {
        public static void main(String[] args) {
            Integer[] array = {7, 3, 5, 8, 6, 7, 4, 5};

            testSorts(array,
                    new SelectSort(),
                    new BubbleSort(),
                    new QuickSort()
            );

        }

        static void testSorts(Integer[] array, Sort... sorts) {
            for (Sort sort : sorts) {
                Integer[] newArray = Integers.copy(array);
                sort.sort(newArray);
                Asserts.test(Integers.isAscOrder(newArray));
            }



            Arrays.sort(sorts);
            for (Sort sort : sorts) {
                System.out.println(sort);
            }
        }
}
