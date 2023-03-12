package class2.p1;

public class Account {

    private int accountNo;

    private String password;

    private int balance;

    public Account(String password, int balance) {
        this.accountNo = 1234;
        this.password = password;
        this.balance = balance;
    }

    public int getBalance(String passwordSent) {

        //Put a validation of my choice
        if(passwordSent==password){
            return balance;
        }
        return -1;
    }


    public String setPassword(String oldPassword,String newPassword){

        if(oldPassword==password){
            this.password = newPassword;
            return "Password updated sucessfully";
        }
        else{
            return "Please enter correct original password";
        }
    }


}
