package com.codillity.lessons.CountingElements;

import java.util.ArrayList;
import java.util.List;

//With this code got 54% overall score
//100% correctness 0% performance - timeouts
public class FrogRiverOne {
    public int solution(int X, int[] A) {
        List<Integer> coveredFields = new ArrayList<>();
        int jumpOn = -1;

        for (int i = 0; i < A.length; i++) {
            if (!coveredFields.contains(A[i])) {
                coveredFields.add(A[i]);
            }
            if (coveredFields.size() == X) {
                jumpOn = i;
                break;
            }
        }

        return jumpOn;
    }
}
