package com.company;

import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        String[] months = new String[]{"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};
        Scanner scn = new Scanner(System.in);
        char n = 0;
        System.out.println("Please enter a number of month ");

        scn.next().charAt(0);

        switch (n) {
            case '1':
                System.out.println("January");
                break;
            default:

                System.out.println(months);
        }
    }
}


