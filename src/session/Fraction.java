package fraction;

import java.util.Scanner;

public class Fraction {
    int tuSo;
    int mauSo;

    public int getTuSo() {
        return tuSo;
    }

    public void setTuSo(int tuSo) {
        this.tuSo = tuSo;
    }

    public int getMauSo() {
        return mauSo;
    }

    public void setMauSo(int mauSo) {
        this.mauSo = mauSo;
    }

    // Ham nhap phan so
    public void enterFrac(Scanner sc) {
        int ts, ms;
        do {
            System.out.print("\tNhap vao tu so: ");
            ts = sc.nextInt();
            System.out.print("\tNhap vao mau so: ");
            ms = sc.nextInt();

            if (ms == 0) {
                System.out.println("Nhap lai thong tin cho phan so!");
            }
        } while (ms == 0);
        tuSo = ts;
        mauSo = ms;
    }

    // Ham hien thi phan so
    public void display() {
        if (tuSo * mauSo < 0) {
            System.out.println("-" + Math.abs(tuSo) + "/" + Math.abs(mauSo));
        } else {
            System.out.println(Math.abs(tuSo) + "/" + Math.abs(mauSo));
        }
    }

    // Ham rut gon phan so
    public void reduce() {
        // Tim uscln
        int a = tuSo;
        int b = mauSo;
        int r = a % b;
        while (r != 0) {
            a = b;
            b = r;
            r = a % b;
        }

        // Rut gon phan so
        tuSo /= b;
        mauSo /= b;
        System.out.println(Math.abs(tuSo) + "/" + Math.abs(mauSo));
    }

    // Ham nghich dao phan so
    public void inverse() {
        int tg = tuSo;
        tuSo = mauSo;
        mauSo = tg;
        System.out.println(Math.abs(tuSo) + "/" + Math.abs(mauSo));
    }

    // Ham cong 2 phan so
    public Fraction add(Fraction f2) {
        int ts = this.getTuSo() * f2.getMauSo() + f2.getTuSo() * this.getMauSo();
        int ms = this.getMauSo() * f2.getMauSo();
        return new Fraction();
    }

    // Ham tru 2 phan so
    public Fraction sub(Fraction f2) {
        int ts = this.getTuSo() * f2.getMauSo() - f2.getTuSo() * this.getMauSo();
        int ms = this.getMauSo() * f2.getMauSo();
        return new Fraction();
    }

    // Ham nhan 2 phan so
    public Fraction mul(Fraction f2) {
        int ts = this.getTuSo() * f2.getTuSo();
        int ms = this.getMauSo() * f2.getMauSo();
        return new Fraction();
    }

    // Chia 2 phan so
    public Fraction div(Fraction f2) {
        // Nghich dao ps2
        int tg = f2.tuSo;
        f2.tuSo = f2.mauSo;
        f2.mauSo = tg;

        // Nhan this vs ps2 (da nghich dao)
        int ts = this.getTuSo() * f2.getTuSo();
        int ms = this.getMauSo() * f2.getMauSo();
        return new Fraction();
    }
}