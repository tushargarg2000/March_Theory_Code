package class2.BankApplication;

public class SBI implements Bank{

    private int balance;


    @Override
    public int getBalance() {
        return 0;
    }

    @Override
    public String addMoney(int money, String password, int accountNo) {
        return null;
    }

    @Override
    public String withdrawMoney(int money, String password) {
        return null;
    }

    @Override
    public int calculateRateOfInterest(int years) {
        return 0;
    }

}
