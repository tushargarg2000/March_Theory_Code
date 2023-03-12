package class2.p1;


public class Class3 {

    public static void main(String[] args){

        Class1 c1 = new Class1();

        System.out.println(c1.defaultAttributeValue);

        Account account = new Account("pass",100);

        //Set at the first time

        int balance = account.getBalance("pass");


    }
}
