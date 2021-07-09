package org.debugtutorial.practice;

public class ConditionalBreakPointPractice {
    public static void main(String[] args) {
        for (int i=0;i<1000;i++) {
            System.out.println("hello");
        }
    }
}

// i applied conditional breakpoint : i>500 && i %7==0
// so first breakpoint got hit at 504 dn 511 and so on..
