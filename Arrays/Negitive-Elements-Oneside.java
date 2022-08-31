package com.yashrith;

public class Oneside {
    public static void main(String[] args){
        System.out.println("hello");
        int[] arr={2,2,-5,-1,1};
        int N=arr.length;
        int temp=0;
        int sum=0;
        for(int i=1;i<N;i++){
            for(int j=0;j<i;j++){
                if(arr[i]<arr[j]){
                    temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
                else{

                    arr[i]=arr[i];
                    arr[j]=arr[j];
                }
            }
        }
        for(int itr:arr){
            System.out.println(itr);
        }
    }
}
