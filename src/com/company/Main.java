package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner n = new Scanner(System.in);
        System.out.println("Введите вес на Земле: ");
        double earthWeight = n.nextDouble();

        double moonWeight = earthWeight * 0.16;

        System.out.println("Вес на Луне = " + moonWeight);
    }
}
