package com.company;

public class Random {
    public static void main(String[] args) {
        int min = 100;
        int max = 200;
        double i = Math.random()*200-100;
        System.out.println("Random value in int from "+min+" to "+max+ ":");

        int random_int = (int)Math.floor(Math.random()*(max-min+1)+min);
        System.out.println(random_int);
    }
}

