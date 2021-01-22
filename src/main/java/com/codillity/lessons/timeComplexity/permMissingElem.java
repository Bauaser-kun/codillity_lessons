package com.codillity.lessons.timeComplexity;

import java.util.Arrays;

//With this code got 100% overall score
public class permMissingElem {
    public int solution(int[] A) {
        if(A.length == 0) return 1;

        int sumArr = 0;

        for(int i=0; i < A.length; i++){
            sumArr = sumArr + A[i];
        }

        int sumN = 0;

        for(int i=1; i <= A.length+1; i++){
            sumN = sumN + i;
        }

        if(sumArr == sumN)
            return A.length;

        return  sumN - sumArr;
    }
}


