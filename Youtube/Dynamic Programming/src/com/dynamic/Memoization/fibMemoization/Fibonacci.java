package com.dynamic.Memoization.fibMemoization;

import java.util.HashMap;
import java.util.Map;

public class Fibonacci {
    public static void main(String[] args){
        //Write a function that takes in a number as an argument.
        //The function should return the n-th number of the Fibonacci sequence.
        HashMap <Integer,Integer> memo=new HashMap<Integer, Integer>();
        System.out.println("Fib without recursion: "+fibNorm(50));
        System.out.println("Fib with dynamic programming: "+fibRec2(50,memo));
        System.out.println("Fib without dynamic programming: "+fibRec(50));

    }
    public static int fibNorm(int n){
        // Time complexity: O(n)
        // Space complexity:
        int a=0;
        int b=1;
        int c=0;
        for(int i=0;i<n;i++){
            c=a+b;
            a=b;
            b=c;

        }
        return a;
    }
    public static int foo(int n){
        // Time complexity: O(n)
        // Space complexity: O(n)
        //
        // foo(5):
        //   (5)
        //   (4)
        //   (3)
        //   (2)
        //   (1)
        // Height: 5, n
        // ie, Time complexity of foo(n) is O(n)

        if(n<=1)return 0;
        return (n-1);
    }
    public static int bar(int n){
        // Time complexity: O(n)
        // Space complexity: O(n)
        //
        // bar(6):
        //   (6)
        //   (4)
        //   (2)
        // Height: 3, n/2
        // ie, Time complexity of bar(n/2) ie O(n)
        if(n<=1)return 0;
        return bar(n-2);
    }
    ///////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    public static int dib(int n){
        // Time complexity: O(2^n)
        // Space complexity: O(n)
        //
        // bar(5):
        //                               (5)
        //
        //               (4)                             (4)
        //              /   \                           /   \
        //             /     \                         /     \
        //            /       \                       /       \
        //           /         \                     /         \
        //          /           \                   /           \
        //         /             \                 /             \
        //       (3)             (3)             (3)             (3)
        //      /   \           /   \           /   \           /   \
        //     /     \         /     \         /     \         /     \
        //    /       \       /       \       /       \       /       \
        //   (2)     (2)     (2)     (2)     (2)     (2)     (2)     (2)
        //   / \     / \     / \     / \     / \     / \     / \     / \
        //  /   \   /   \   /   \   /   \   /   \   /   \   /   \   /   \
        // (1) (1) (1) (1) (1) (1) (1) (1) (1) (1) (1) (1) (1) (1) (1) (1)
        //
        // Height: 5, n
        // Each level has 2^n nodes init
        // ie, Time complexity of dib(2^n)
        // In the case of space complexity,
        // every time a value is return it pop from the
        // call stack ie, dib only have O(height) space complexity
        // space complexity O(n)
        if(n<=1)return 0;
        return dib(n-1)+dib(n-1);
    }
    public static int lib(int n){
        // Time complexity: O(2^n)
        // Space complexity: O(n)
        //
        // bar(8):
        //                               (8)
        //
        //               (6)                             (6)
        //              /   \                           /   \
        //             /     \                         /     \
        //            /       \                       /       \
        //           /         \                     /         \
        //          /           \                   /           \
        //         /             \                 /             \
        //       (4)             (4)             (4)             (4)
        //      /   \           /   \           /   \           /   \
        //     /     \         /     \         /     \         /     \
        //    /       \       /       \       /       \       /       \
        //   (2)     (2)     (2)     (2)     (2)     (2)     (2)     (2)
        //   / \     / \     / \     / \     / \     / \     / \     / \
        //  /   \   /   \   /   \   /   \   /   \   /   \   /   \   /   \
        // (0) (0) (0) (0) (0) (0) (0) (0) (0) (0) (0) (0) (0) (0) (0) (0)
        //
        // Height: 5, n/2
        // Each level has 2^(n/2) nodes init
        // ie, Time complexity of dib(2^n)
        // In the case of space complexity,
        // every time a value is return it pop from the
        // call stack ie, dib only have O(height/2) space complexity
        // space complexity O(n)
        if(n<=1)return 0;
        return lib(n-2)+lib(n-2);
    }
    public static int fibRec(int n){
        // Time complexity: O(2^n)
        // Space complexity: O(n)
        //
        // fibRec(7):
        //                                 (7)
        //
        //                 (6)                             (5)
        //                /   \                           /   \
        //               /     \                         /     \
        //              /       \                       /       \
        //             /         \                     /         \
        //            /           \                   /           \
        //           /             \                 /             \
        //         (5)             (4)             (4)             (3)
        //        /   \           /   \           /   \           /   \
        //       /     \         /     \         /     \         /     \
        //      /       \       /       \       /       \       /       \
        //     (4)     (3)     (3)     (2)     (3)     (2)     (2)     (1)
        //     / \     / \     / \             / \
        //    /   \   /   \   /   \           /   \
        //  (3)  (2) (2) (1) (2) (1)        (2)  (1)
        //  / \
        //(2)(1)
        //
        // Height: 7
        // By analysing both lib(n) and dib(n) with fibRec(n)
        // we can conclude that fibRec(n) has the Time complexity
        // greater than dib(n) and less than lib(n)
        // ie,
        //    O(dib)<=O(fibRec)<=O(lib)
        //    O(2^n)<= O(2^n)  <=O(2^n)
        if(n<=2)return 1;
        return fibRec(n-1)+fibRec(n-2);
    }
    ////////////////////////////////////////////////////////////////////////////////////////////////////////////////

    // With Dynamic programming

    public static int fibRec2(int n,HashMap memo){
        // Time complexity: O(n)
        // Space complexity: O(n)
        //
        // bar(7):
        //                 (7)
        //                 / \
        //                /   \
        //              (6)   (5)      memo{
        //              / \                 3:2,
        //             /   \                4:3,
        //           (5)   (4)              5:5,
        //           / \                    6:8,
        //          /   \                   7:13,
        //        (4)   (3)                }
        //        / \
        //       /   \
        //     (3)   (2)
        //     / \
        //    /   \
        //  (2)   (1)
        if(memo.containsKey(n))return (int) memo.get(n);
        if(n<=2)return 1;

        memo.put(n, fibRec2(n-1,memo)+fibRec2(n-2,memo));
        return (int) memo.get(n);
    }
}
