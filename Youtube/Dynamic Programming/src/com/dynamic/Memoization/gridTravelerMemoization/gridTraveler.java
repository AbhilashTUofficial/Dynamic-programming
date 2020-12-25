package com.dynamic.Memoization.gridTravelerMemoization;

import java.util.HashMap;

public class gridTraveler {
    public static void main(String[] args){
        HashMap memo=new HashMap<String,Integer>();
        System.out.println(grid(2,3,memo));
    }
    public static int grid(int n, int m,HashMap memo){
        if(memo.containsKey(n+','+m)||memo.containsKey(m+','+n)){
            return (int) memo.get(n+','+m);
        }
        if(n==1 && m==1){
            return 1;
        }
        if(n==0||m==0){
            return 0;
        }
        memo.put(n+','+m,grid(n-1,m,memo)+grid(n,m-1,memo));
       // memo.put(m+','+n,grid(n-1,m,memo)+grid(n,m-1,memo));
        return (int) memo.get(m+','+n);
    }
}
/*
//JavaScript
const gridTraveler=(m,n,memo={}=>{
  const key=m+','+n;
  if(key in memo)return memo[key];
  if(m===1 && n===1) return 1;
  if(m===0 || n===0) return 0;
  memo[key]=gridTraveler(m-1,n,memo)+gridTraveler(m,n-1,memo);
  return memo[Key];
  };
 */