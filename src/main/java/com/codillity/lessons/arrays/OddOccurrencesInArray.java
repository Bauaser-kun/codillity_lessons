package com.codillity.lessons.arrays;

//using this code got 100%
public class OddOccurrencesInArray {
    public int solution(int[] A) {
        int x = A[0];
        for ( int i = 1; i < A.length; i++ ){
            x = x ^ A[i];
        }

        return x;
    }
}
