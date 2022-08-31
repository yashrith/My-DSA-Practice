package com.yashrith;

import java.util.*;
public class FindSmallest {
    public static void main(String[] args){
        System.out.println("what");
        int[] A={-2,1,-4,5,3};
        Scanner sc=new Scanner(System.in);
        int k=sc.nextInt();
        int N=A.length;
        int temp=0;
        int sum=0;
        for(int i=1;i<N;i++){
            for(int j=0;j<i;j++){
                if(A[i]<A[j]){
                    temp=A[i];
                    A[i]=A[j];
                    A[j]=temp;
                }
                else{

                    A[i]=A[i];
                    A[j]=A[j];
                }
            }
        }
        System.out.println("the number is: "+A[k-1]);

    }
}
