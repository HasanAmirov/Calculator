package com.xasan.calculator;

public class calculate {
    private int upcomingNum1, upcomingNum2;

    public calculate(int upcomingNum1, int upcomingNum2){
        this.upcomingNum1 = upcomingNum1;
        this.upcomingNum2 = upcomingNum2;
    }

    public int sum(){
        return upcomingNum1 + upcomingNum2;
    }

    public int difference(){
        return upcomingNum1 - upcomingNum2;
    }

    public int division(){
        return upcomingNum1 / upcomingNum2;
    }

    public int times(){
        return upcomingNum1 * upcomingNum2;
    }
}
