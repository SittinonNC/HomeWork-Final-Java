import javax.swing.JOptionPane;
import bank.BankAccount;

public class TestBankAccount {
    public static void main(String[] args) {
        BankAccount CreateAcc = new BankAccount();
        JOptionPane.showMessageDialog(null, "Welcome to the Bank Account Program ");
        CreateAcc.CreateAndTransaction();

    }
}
