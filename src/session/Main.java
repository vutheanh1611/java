package fraction;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Fraction f1 = new Fraction();
        Fraction f2 = new Fraction();
        Fraction fTong;
        Fraction fThuong;
        Fraction fhieu;
        Fraction ftich;

        Scanner sc = new Scanner(System.in);

        // Nhap du lieu
        System.out.println("Nhap du lieu cho phan so 1:");
        f1.enterFrac(sc);
        System.out.println("Nhap du lieu cho phan so 2:");
        f2.enterFrac(sc);

        // Hien thi
        System.out.println("Phan so 1 vua nhap la:");
        f1.display();
        System.out.println("Phan so 2 vua nhap la:");
        f2.display();

        System.out.println("Phan so 1 rut gon la:");
        f1.reduce();
        System.out.println("Phan so 1 nghich dao la:");
        f1.inverse();

        // Cong 2 phan so
        fTong = f1.add(f2);

        // Tru 2 phan so
        fhieu = f1.sub(f2);

        // Nhan 2 phan so
        ftich = f1.mul(f2);

        // Chia 2 phan so
        fThuong = f1.div(f2);



        // Hien thi
        System.out.println("Phan so tong la:");
        fTong.display();
        System.out.println("Hieu phan so la:");
        fhieu.display();
        System.out.println("Tich phan so la:");
        ftich.display();
        System.out.println("Thuong phan so la:");
        fThuong.display();
    }
}