package com.codillity.lessons.timeComplexity;

//With this code got 33%
public class FrogImp {
    public int solution(int X, int Y, int D) {
        int jumps = 0;

        do{
            X += D;
            jumps++;
        } while (X < Y);

        return jumps;
    }
}
