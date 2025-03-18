package com.core;

public class BreakAndContinue {
    public static void main(String[] args) {
        for (int i = 1; i <= 9; i++) {
            if (i == 3) {
                //immediately exists the loop if condition met
                break;
            }
            System.out.println("Break");
        }
        for (int i = 1; i <= 9; i++) {
            if (i == 3) {
                //skips current iteration of the loop and proceeds with next iteration
                continue;
            }
            System.out.println("continue");
        }
    }
}
