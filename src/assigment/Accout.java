package account;

public class Account {
    int id;
    String name;
    double balance;

    public Account(){
        balance = 50;
    }

    public Account(int id, String name, double balance) {
        this.id = id;
        this.name = name;
        this.balance = balance;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
    //Nap tien
    public boolean credit(int amount){
        if(amount < 0){
            System.out.println("So tien nap vao phai lon hon 0");
        }else {
            balance += amount;
        }
        return true;
    }
    //Thanh toan
    public boolean debit(int amoutn){
        if(amoutn > balance){
            System.out.println("Tai khoan khong du de thuc hien thanh toan");
        }else {
            balance -= amoutn;
        }
        return true;
    }
