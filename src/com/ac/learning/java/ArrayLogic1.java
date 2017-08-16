package com.ac.learning.java;

public class ArrayLogic1 {
    public static void main(String[] args) {

        int[] a = {1, 1, 1, 2, 2, 3, 4, 5, 5, 1, 1, 2};
        series2_count(a);

    }

    public static void series2_count(int a[]) {
        int count = 0;
        int previous_no = 0;
        int current_no;

        for (int i = 0; i < a.length; i++) {
            current_no = a[i];

            if (current_no == previous_no) {
                count = count + 1;

            } else {
                if (i == 0) {
                    // dont print
                } else {
                    System.out.println(previous_no + " - " + count);

                }

                count = 1;
            }

            if (i == a.length - 1) {
                System.out.println(current_no + " - " + count);
            }

            previous_no = current_no;

        }
    }

}
