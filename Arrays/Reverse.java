package com.yashrith;

import java.io.*;
import java.util.*;

public class Reverse {
    public static void main(String[] args) {

        int[] arr = { 1, 2, 3 };
        reverse(arr);
    }

    static void reverse(int[] arr) {
        int i = 0;
        int j = arr.length - 1;
        int temp = 0;
        while (i <= j) {
            if (i == j) {
                System.out.println("break");
            } else {
                System.out.println("hello");
                i++;
                j--;

                temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        for (int itr : arr) {
            System.out.println(itr);
        }

    }

}
