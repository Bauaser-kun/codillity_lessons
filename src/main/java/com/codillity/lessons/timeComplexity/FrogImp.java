package com.codillity.lessons.timeComplexity;

//With this code got 100% overall score
public class FrogImp {
     public int solution(int X, int Y, int D) {
        if (X == Y) {
            return 0;
        } else if ((Y - X)%D == 0) {
            return ((Y - X)/D);
        } else {
            return ((Y - X)/D) + 1;
        }
    }

    //this gave 100% correct answers but takes to
    //long - leading to 44% overall score of lesson
    public int solution2(int X, int Y, int D) {
        int jumps = 0;

        while (X < Y){
            X += D;
            jumps++;
        }

        return jumps;
    }
}


