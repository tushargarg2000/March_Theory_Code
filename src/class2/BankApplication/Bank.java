package class2.BankApplication;

public interface Bank {

    public int getBalance();

    public String addMoney(int money,String password,int accountNo);

    public String withdrawMoney(int money,String password);

    public int calculateRateOfInterest(int years);

}
