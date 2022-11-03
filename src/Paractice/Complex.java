package Paractice;

import java.awt.color.CMMException;
import java.util.Scanner;

public class Complex {
    private double n1;
    private double n2;

//    Ham tao khong doi so
    public Complex(){
        n1 = 0;
        n2 = 0;
    }

    public double getN1() {
        return n1;
    }

    public void setN1(double n1) {
        this.n1 = n1;
    }

    public double getN2() {
        return n2;
    }

    public void setN2(double n2) {
        this.n2 = n2;
    }

//    Ham khoi tao co doi so

    public Complex(double n1, double n2) {
        this.n1 = n1;
        this.n2 = n2;
    }

//    Ham so phuc
    public void nhap(Scanner sc){
        System.out.println("Nhap so phuc");
        n1 = sc.nextDouble();
        System.out.println("Nhap so phuc");
        n2 = sc.nextDouble();

    }
//    Ham hien thi so phuc
    public void print(){
        if (n2 < 0){
            System.out.println(n1 + "-" + Math.abs(n2) + "*i");
        }else{
            System.out.println(n1 + "+" + n2 + "*i");
        }
    }
//    Ham cong so phuc
    public Complex congComplex(Complex s2){
        double x = n1 + s2.n1;
        double y = n2 + s2.n2;
        return new Complex(x, y);
    }
//    Ham tru so phuc
    public  Complex truComplex(Complex s2){
        double x = n1 - s2.n1;
        double y = n2 - s2.n2;
        return new Complex(x, y);
    }
//    Ham nhan so phuc
    public Complex nhanComplex(Complex s2) {
        double x = n1 * s2.n1 - n2 * s2.n2;
        double y = n1 * s2.n2 + s2.n1 * n2;
        return new Complex(x, y);
    }
//    Ham chia so phuc
    public Complex chiaComplex(Complex s2) {
        double x = (n1 * s2.n1 + n2 * s2.n2) / (s2.n1 * s2.n1 + s2.n2 * s2.n2);
        double y = (s2.n1 * n2 - n1 * s2.n2) / (s2.n1 * s2.n1 + s2.n2 * s2.n2);
        return new Complex(x, y);
    }

    @Override
    public String toString() {
        return "Complex{" +
                "n1=" + n1 +
                ", n2=" + n2 +
                '}';
    }
}
