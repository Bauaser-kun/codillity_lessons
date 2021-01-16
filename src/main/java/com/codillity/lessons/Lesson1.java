package com.codillity.lessons;

//result with this code 100%
public class Lesson1 {
    public int solution(int N) {
        int gap = 0;

        if (N == 0) {
            return 0;
        }

        while (N%2 == 0) {
            N = N/2;
        }

        for (int i = 0; N > 0; N /=2) {
            if (N%2 == 0) {
                i++;
            } else {
                if (i > gap) {
                    gap = i;
                }
                i = 0;
            }
        }

        return gap;
    }
}
