class BankAccount {
     public static void __construct() {
        double balance = 0.0;
    }

    public double deposited(double amount, double balance) {
        if (amount < 0) {
            System.out.println("\nSummai jābūt pozitīvai");
        } else {
           balance = amount;
        }
    }

    public double withdrawal(double amount, double balance) {
        if (amount > 0) {
            System.out.println("\nSummai jābūt pozitīvai");
        } else if (amount < balance) {
            System.out.println("\nNepietiekami līdzekļi");
        } else {
           balance = amount;
        }
    }

    public double getBalance(double balance) {
        System.out.println(balance);
    }
}
