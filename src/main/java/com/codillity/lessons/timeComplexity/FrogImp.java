package com.codillity.lessons.timeComplexity;

//With this code got 44%
public class FrogImp {
    public int solution(int X, int Y, int D) {
        int jumps = 0;

        while (X < Y){
            X += D;
            jumps++;
        }

        return jumps;
    }
}
