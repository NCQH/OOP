import java.util.ArrayList;

public class Account {
    private double balance;
    private ArrayList<Transaction> transitionList;

    /**
     * Phuong thuc khoi tao.
     */
    public Account() {
        balance = 0;
        transitionList = new ArrayList<>();
    }

    /**
     * Phuong thuc deposit de nap tien vao tai khoan.
     * @param amount so tien giao dich
     */
    private void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            transitionList.add(new Transaction(Transaction.DEPOSIT, amount, balance));
        } else {
            System.out.println("So tien ban nap vao khong hop le!");
        }
    }

    /**
     * Phuong thuc withdraw de rut tien tu tai khoan.
     * @param amount so tien giao dich
     */
    private void withdraw(double amount) {
        if (amount > 0) {
            if (amount > balance) {
                System.out.println("So tien ban rut vuot qua so du!");
            } else {
                balance -= amount;
                transitionList.add(new Transaction(Transaction.WITHDRAW, amount, balance));
            }
        } else {
            System.out.println("So tien ban rut ra khong hop le!");
        }
    }

    /**
     * Phuong thuc them mot giao dich vao danh sach cac giao dich.
     * @param amount so tien giao dich
     * @param operation kieu giao dich
     */
    public void addTransaction(double amount, String operation) {
        if (operation.equals(Transaction.DEPOSIT)) {
            deposit(amount);
        } else if (operation.equals(Transaction.WITHDRAW)) {
            withdraw(amount);
        } else {
            System.out.println("Yeu cau khong hop le!");
        }
    }

    /**
     * Phuong thuc in cac giao dich.
     */
    public void printTransaction() {
        for (int i = 0; i < transitionList.size(); i++) {
            String type = transitionList.get(i).getOperation().equals(Transaction.DEPOSIT)
                    ? "Nap tien" : "Rut tien";
            double amount = transitionList.get(i).getAmount();
            double balance = transitionList.get(i).getBalance();
            System.out.printf("Giao dich %d: %s $%.2f. So du luc nay: $%.2f.\n",
                    i + 1, type, amount, balance);
        }
    }
}
