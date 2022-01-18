package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("ширина");
        int a = in.nextInt();
        System.out.println("длинна");
        int b = in.nextInt();
        System.out.println("высота");
        int c = in.nextInt();
        if (((a < 20) && (b < 55) && (c < 40)) || ((b < 20) && (c < 55) && (a < 40)) ||
                ((c < 20) && (b < 55) && (a < 40)) || ((a < 20) && (c < 55) && (b < 40)) ||
                ((b < 20) && (a < 55) && (c < 40)) || ((c < 20) && (a < 55) && (b < 40)))
            System.out.println("Допустимые размеры");
        else System.out.println("Недопустимые размеры");
    }
}
