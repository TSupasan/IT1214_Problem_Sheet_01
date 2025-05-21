import java.util.ArrayList;

class BankAccounnt{
    private int accountNumber;
    private String accountHolder;
    private double balance;

    BankAccounnt(int accountNumber,String accountHolder,double balance){
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        this.balance = balance;
    }

    public int getAccountNumber(){
        return accountNumber;
    }

    public double getBalance(){
        return balance;
    }

    public String getAccountHolder(){
        return accountHolder;
    }

    public void setAccountNumber(int accountNumber){
        this.accountNumber = accountNumber;
    }

    public void setAccountHolder(String name){
        this.accountHolder = name;
    }

    public void setBalance(double balance){
        this.balance = balance;
    }

    public void vithdrawCash(double ammount){
        try {
            if(balance >= ammount){
                balance-=ammount;
                System.out.println("New Balance: " + balance);
            } else {
                throw new IllegalArgumentException("Insufficient Balance");
            }
                
    } catch (IllegalArgumentException e) {
        System.out.println(e.getMessage());
    }
}
}

class Bank{
    ArrayList <BankAccounnt> accounts = new ArrayList<>();
    int numberofAccount = 0;
    
    public void addAccount(BankAccounnt acc){
        if(numberofAccount <= 5){
            accounts.add(acc);
            numberofAccount++;
        }
         
    }

    public void printAccount(){
        for(int i=0;i<numberofAccount;i++){
            BankAccounnt acc = accounts.get(i);
            System.out.println("Account No: " + acc.getAccountNumber());
            System.out.println("Account Holders Name: " + acc.getAccountHolder());
            System.out.println("Account Balance: " + acc.getBalance());
        }
    }
}

class Problem03{
    public static void main(String[] args){
        BankAccounnt acc01 = new BankAccounnt(1001,"Alice",5000.00);
        BankAccounnt acc02 = new BankAccounnt(1002,"Bob",3000.00);

        Bank b01 = new Bank();

        b01.addAccount(acc01);
        b01.addAccount(acc02);

       b01.printAccount();

        acc01.vithdrawCash(6000.00);
        acc02.vithdrawCash(1000.00);


    }
}