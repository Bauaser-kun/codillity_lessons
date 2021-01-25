package com.codillity.lessons.timeComplexity;

//With this code got 100% overall score

public class TapeEquilinrium {
    public int solution(int[] A) {
        int sum1 = A[0];
        int sum2 = 0;
        int minimalDifference = 10000;
        int checkedDifference = 0;

        if (A.length == 2) {
          if (A[0] < 0 && A[1] > 0) {
              return Math.abs(A[0]) + A[1];
          } else if (A[0] > 0 && A[1] < 0) {
              return Math.abs(A[1]) + A[0];
          } else {
              return Math.abs(A[0] - A[1]);
          }
        }

        for (int i = 1; i < A.length; i++) {
            sum2 +=A[i];
        }

        for (int i = 1; i < A.length; i++){
            checkedDifference = Math.abs(sum1 - sum2);

            if (checkedDifference < minimalDifference){
                minimalDifference = checkedDifference;
            }

            sum1 += A[i];
            sum2 -= A[i];
        }

        return minimalDifference;
    }
}
