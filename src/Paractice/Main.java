package Paractice;

import Paractice.Complex;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Khai bao doi tuong
        Complex n1 = new Complex();
        Complex n2 = new Complex();
        Complex chiaComplex = new Complex();

        // Nhap
        System.out.println("Nhap  so phuc 1:");
        n1.nhap(sc);
        System.out.println("Nhap  so phuc 2:");
        n2.nhap(sc);

        // Print
        System.out.println("So phuc 1 la:");
        n1.print();
        System.out.println("So phuc 2 la:");
        n2.print();

        // Chia n1 cho n2
        chiaComplex = n1.chiaComplex(n2);

        // Print
        System.out.println("Ket qua cua phep chia n1 cho n2 la:");
        chiaComplex.print();

        sc.close();
    }
}