package com.ergiappa;

import java.util.Scanner;

public class SceltaBooleana {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Java è bello?");
        boolean bello = input.nextBoolean();

        if (bello == true) {
            System.out.println("Hai ragione!");
        }
        else {
            System.out.println("Ti sbagli!");
        }
        input.close();

    }
}
