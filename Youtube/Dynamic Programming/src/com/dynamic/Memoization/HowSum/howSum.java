package com.dynamic.Memoization.HowSum;

import java.util.Arrays;

class Main {
    public static void main(String[] args){
        int numb=2;
        int[] arr={6,7,8,9,10};
        System.out.println(Arrays.toString(howSum(numb, arr)));
    }
    public static int[] howSum(int numb,int[] arr){
        if(numb==0)return arr;
        if(numb<0)return null;
        for (int n:arr) {
            int reminder=numb-n;
            int[] remArr=howSum(reminder,arr);
            if(Arrays.toString(remArr).contains(null)){
                return remArr;
            }
        }
        return null;
    }
}
