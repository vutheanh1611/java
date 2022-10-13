package session1;

public class TamGiac {
    int canh1;
    int canh2;
    int canh3;

    public int getCanh1() {
        return canh1;
    }

    public void setCanh1(int canh1) {
        this.canh1 = canh1;
    }

    public int getCanh2() {
        return canh2;
    }

    public void setCanh2(int canh2) {
        this.canh2 = canh2;
    }

    public int getCanh3() {
        return canh3;
    }

    public void setCanh3(int canh3) {
        this.canh3 = canh3;
    }

    public int tinhChuVi(){
        return canh1+canh2+canh3;
    }

    public double tinhDienTich(){
        double p = (double)tinhChuVi()/2;
        return Math.sqrt(p*(p-canh1)*(p-canh2)*(p-canh3));
    }
}
