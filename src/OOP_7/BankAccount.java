package OOP_7;

public class BankAccount {
//    1.Am o clasa BankAccount(owner, accountNb, balance) cu behavior: getAccountDetails(toate detaliile contului), deposit(), withdraw().
//      Am o clasa SavingsAccount care mosteneste clasa BankAccount si care poate sa faca operatiuni pe cont: adaugare, scoatere bani.
//
//    Am si suma curenta din cont pe care o tin intr-o constanta.
//
//    Implementeaza clasele, adauga si scoate bani din cont si obtine umatoarea secventa:
//
//    Contul 09434242432232 cu balanta 1234.

    private String owner;
    String accountNb;
    float balance;


    public BankAccount(String owner, String accountNb, float balance) {
        this.owner = owner;
        this.accountNb = accountNb;
        this.balance = balance;
    }

    public String getAccountDetails() {
        final float CURRENT_MONEY = this.balance;
        return "Account no. " + this.accountNb + ", with balance " + CURRENT_MONEY + " RON , owner: " + this.owner;
    }

    public float deposit(float deposit) {
        System.out.println("Add " + deposit + " RON");
        return this.balance += deposit;
    }

    public float withdraw(float withdraw) {
        System.out.println("Withdraw " + withdraw + " RON");
        return this.balance -= withdraw;
    }

    public String getNameOwner() {
        return this.owner;
    }

}
