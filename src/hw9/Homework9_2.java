package hw9;

public class Homework9_2 {
    /*
    熊大在念大學,生活費倚靠媽媽。
    媽媽怕熊大一天到晚領錢亂花,不好好唸書,所以只要看到熊大帳戶的餘額超過 3000 元,就會停止匯款給熊大;
    但要是帳戶餘額在 2000 元以下,熊大就會要求媽媽匯款給他。
    如果帳戶餘額低於熊大要提款的金額,熊大就會暫停提款,直到媽媽告知他錢已經入帳戶。
    假設媽媽一次匯款 2000 元,熊大一次提款 1000 元,寫一個Java程式模擬匯款10次與提款10次的情形。

    參考範例:TestWaitNotify.java
     */
    public static void main(String[] args) {
        Account account = new Account();
        Parents mom = new Parents(account);
        Child bear = new Child(account);
        mom.start();
        bear.start();
    }
}

class Account {
    private int deposit = 0;
    private int withdrawCount = 0;

    // 從帳戶領錢出來
    public synchronized void withdraw(int amount) {
        while (deposit < amount) {
            System.out.println("熊大看到帳戶沒錢，暫停提款");
            try {
                wait();
            } catch (InterruptedException ie) {
                ie.printStackTrace();
            }
        }
        deposit -= amount;
        System.out.println("熊大領了" + amount + "，帳戶共有：" + deposit);
        if (deposit < 2000) {
            System.out.println("熊大看到餘額在2000以下，要求匯款");
            notify();
        } else if (withdrawCount >= 9) {
            System.out.println("熊大已經領了十次錢，通知媽媽不用再匯錢了");
            notify();
        }
        withdrawCount++;
    }

    // 匯錢進去帳戶
    public synchronized void income(int amount) {
        if (withdrawCount >= 9) {
            return;
        }
        while (deposit > 3000) {
            System.out.println("媽媽看到餘額在3000以上，暫停匯款");
            try {
                wait();
                if (withdrawCount >= 9) {
                    return;
                }
            } catch (InterruptedException ie) {
                ie.printStackTrace();
            }
        }
        deposit += amount;
        System.out.println("媽媽存了" + amount + "，帳戶共有：" + deposit);
        notify();
    }
}

class Child extends Thread {
    Account account;

    public Child(Account account) {
        this.account = account;
    }

    public void run() {
        for (int i = 0; i < 10; i++) {
            account.withdraw(1000);
        }
    }
}

class Parents extends Thread {
    Account account;

    public Parents(Account account) {
        this.account = account;
    }

    public void run() {
        for (int i = 0; i < 10; i++) {
            account.income(2000);
        }
    }
}
