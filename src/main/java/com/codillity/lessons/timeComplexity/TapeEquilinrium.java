package com.codillity.lessons.timeComplexity;

//With this code got 46% overall score
//85% Correctnes 0% performance
//wrong answer on small elements with only one positive value
//timeout on everything
//Detected time complexity: O(N * N)
public class TapeEquilinrium {
    public int solution(int[] A) {
        int sum1 = 0;
        int sum2 = 0;
        int minimalDifference = 1000;

        if (A.length == 2) {
            if (A[0] < 0 && A[1] > 0) {
                return Math.abs(A[0]) + A[1];
            } else if (A[0] > 0 && A[1] < 0) {
                return Math.abs(A[1]) + A[0];
            } else {
                return Math.abs(A[0] - A[1]);
            }
        }

        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j <= i; j++) {
                sum1 += A[j];
            }

            for (int k = i+1; k <A.length; k++) {
                sum2 += A[k];
            }

            if (Math.abs(sum1 - sum2) < minimalDifference) {
                minimalDifference = Math.abs(sum1 - sum2);
            }

            sum1 = 0;
            sum2 = 0;
        }
        return minimalDifference;
    }
}
