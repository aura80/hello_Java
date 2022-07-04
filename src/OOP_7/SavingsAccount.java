package OOP_7;

public class SavingsAccount extends BankAccount {

    public SavingsAccount(String owner, String  accountNb, float balance) {
        super(owner, accountNb, balance);
    }


    @Override
    public float deposit(float dep) {
        System.out.println("\nHello " + getNameOwner() + " your situation is: ");
        return super.deposit(dep);
    }

    @Override
    public String getAccountDetails() {
        return super.getAccountDetails() + " and he will add moore :)";
    }


    public float withdraw() {
        //System.out.println("--- After paying " + balance/5 + ", 5% fees ");
        return super.balance/5;
    }

    public float withdraw(int managingAccount) {
        //System.out.println("--- After paying " + managingAccount + " RON, for managing account ");
        return managingAccount;
    }

    public float withdraw(float a, float b) {
        a = withdraw();
        b = withdraw(12);

        return a + b;
    }

    public float getAccountDetails(float w) {
        SavingsAccount ww = new SavingsAccount(super.getNameOwner(),super.accountNb,super.balance);
        w = withdraw(ww.withdraw(), ww.withdraw(12));

        System.out.print("\nRemaining:   " + super.balance + " - " + w + " = ");

        return super.balance - w;
    }

    public static void main(String[] args) {
        BankAccount cont1 = new BankAccount("Popescu", "123456789", 10000.0f);
        System.out.println(cont1.getNameOwner() + " initial sold:  " + cont1.balance + " RON ");
        System.out.println("Make a deposit of:     " + cont1.deposit(300.3f) + " RON ");
        System.out.println("The remaining amount:  " + cont1.withdraw(30) + " RON ");
        System.out.println("\n***   " + cont1.getAccountDetails());

        System.out.println();

        SavingsAccount sav1 = new SavingsAccount("Dolanescu", "09434242432232", 1000000.4f);
        System.out.println(sav1.getNameOwner() + " initial sold:         " + sav1.balance + " RON ");
        System.out.println(" +  After adding money:             " + sav1.deposit(500052.34f) + " RON ");
        System.out.println(" +  After withdrawing money:        " + sav1.withdraw(3.11f) + " RON ");
        System.out.println("\n***   " + sav1.getAccountDetails());
        System.out.println();
        System.out.println(" +  After adding money:             " + sav1.deposit(300000) + " RON ");
        System.out.println(" -  After taking money:             " + sav1.withdraw(9.5f) + " RON ");
        System.out.println(" +  After adding money:             " + sav1.deposit(20) + " RON ");
        System.out.println("--- After paying " + sav1.withdraw() + ", 5% fees ");
        System.out.println("--- After paying " + sav1.withdraw(12) + " RON, for managing account ");
        System.out.println(" -  After taking money:    " + sav1.balance + " - " + (sav1.withdraw() + sav1.withdraw(12)) + " = " + sav1.withdraw(sav1.withdraw() + sav1.withdraw(12)) + " RON     remaining in the account");
        System.out.println("\n***   " + sav1.getAccountDetails());
        System.out.println(" +  After adding money:             " + sav1.deposit(60000) + " RON ");
        System.out.println(" +  After adding money:             " + sav1.deposit(300000) + " RON ");
        System.out.println(" -  After taking money:             " + sav1.withdraw(3.1f) + " RON ");
        System.out.println(" +  After adding money:             " + sav1.deposit(400033.5f) + " RON ");
        System.out.println("\n***   " + sav1.getAccountDetails());
        System.out.println();
        System.out.print("Debts:       " + sav1.withdraw() + " + " + sav1.withdraw(12) + " = " + sav1.withdraw(sav1.withdraw(), sav1.withdraw(12)) + " RON *****");
        System.out.println();
        System.out.println("  " + sav1.getAccountDetails(sav1.withdraw(sav1.withdraw(), sav1.withdraw(12))) + "   *****  is the remaining amount after paying new debts  *****");


    }
}
