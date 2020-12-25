package com.dynamic.Memoization.CanSum;

class Main {
    public static void main(String[] args){
        int[] array={2};
        System.out.println(canSum(3001,array));
    }
    public static boolean canSum(int n, int[] array ){
        // Time complexity: O(n)
        // Space complexity:
        if(n==0)return true;
        if(n<0)return false;
        for (int numb:array){
            int remainder=n-numb;
            if(canSum(remainder,array)){
                return true;
            }
        }
        return false;
    }
}
