package bank;

import javax.swing.JOptionPane;

public class BankAccount {

    private double balance;

    public BankAccount() {
        balance = 0;
    }

    public BankAccount(double startBalance) {
        balance = startBalance;
    }

    public BankAccount(String str) {
        balance = Double.parseDouble(str);
    }

    public void setBalance(double newBalance) {
        balance = newBalance;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) {
        balance += amount;
    }

    public void deposit(String str) {
        balance += Double.parseDouble(str);
    }

    public void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
        } else {
            JOptionPane.showMessageDialog(null, "Insufficient funds");
        }
    }

    public void withdraw(String str) {
        double amount = Double.parseDouble(str);
        if (amount <= balance) {
            balance -= amount;
        } else {
            JOptionPane.showMessageDialog(null, "Insufficient funds");
        }
    }

    public void CreateAndTransaction() {
        BankAccount CreateAcc = new BankAccount();
        String NAccount = JOptionPane.showInputDialog("Would you like to create a new account?(yes or no ) ");
        if (NAccount.equalsIgnoreCase("yes")) {
            String InputBalacne = JOptionPane.showInputDialog("Enter the staring balance: ");
            double InputBalacnes = Double.parseDouble(InputBalacne);
            JOptionPane.showMessageDialog(null, "Thank you for creating an account with a starting balance of: " +
                    InputBalacnes);
            CreateAcc = new BankAccount(InputBalacnes);

        } else {
            JOptionPane.showMessageDialog(null, "GoodBye:");
            System.exit(0);
        }
        while (true) {

            String Choice = JOptionPane.showInputDialog(
                    "What would you like to do? (d: deposit, w: withdraw, g: get balance, or x: quit)");
            char SelectChoice = Choice.charAt(0);
            switch (SelectChoice) {
                case 'd':
                    String depositAmount = JOptionPane.showInputDialog("Enter amount to deposit: ");
                    double depositAmountS = Double.parseDouble(depositAmount);
                    CreateAcc.deposit(depositAmountS);
                    break;
                // not use String ot double
                case 'w':
                    double WithdeawAmount = Double
                            .parseDouble(JOptionPane.showInputDialog("Enter amount to deposit :"));
                    CreateAcc.withdraw(WithdeawAmount);
                    break;
                case 'g':
                    JOptionPane.showMessageDialog(null, "Your nalance is " + CreateAcc.getBalance());
                    break;
                case 'x':
                    System.exit(0);
                default:
                    JOptionPane.showMessageDialog(null, "Invalid choice. Please enter 'd', 'w', 'g', or 'x'.");
                    break;
            }
        }

    }

}