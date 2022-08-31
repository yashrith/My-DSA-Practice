package com.yashrith;

public class MaxMin {
    public static void main(String[] args) {
        System.out.println("yash");
        int[] A = { -2, 1, -4, 5, 3 };
        int N = A.length;
        int temp = 0;
        int sum = 0;
        for (int i = 1; i < N; i++) {
            for (int j = 0; j < i; j++) {
                if (A[i] < A[j]) {
                    temp = A[i];
                    A[i] = A[j];
                    A[j] = temp;
                } else {

                    A[i] = A[i];
                    A[j] = A[j];
                }
            }
        }

        sum = A[0] + A[N - 1];
        System.out.println("max: " + A[0]);
        System.out.println("min: " + A[N - 1]);
        System.out.println("sum: " + sum);
    }

}
