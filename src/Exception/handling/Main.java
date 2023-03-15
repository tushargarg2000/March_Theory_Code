package Exception.handling;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;
import java.util.Scanner;

public class Main {

    public static void main(String[] args){



        //Critical statement
        try{

//            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
//
//            int  j = Integer.parseInt(bufferedReader.readLine());
//
//
//            int ans = 10/a;
//
//            int[] arr = new int[4];
//            for(int i=0;i<=4;i++){
//                System.out.println(arr[i]+" ");
//            }

            A obj = new A();

            obj.letsRockTogethor();


        }catch (TsunamiException e){
            System.out.println(e.getMessage());
        }

        catch (ArithmeticException e){
            System.out.println("This is arithmetic exception : Reason "+e.getMessage());
        }
        catch (ArrayIndexOutOfBoundsException e){
            System.out.println("This is final exception that we are having Exception "+e.getMessage());
        }catch (Exception e){
            System.out.println("This is the exception"+e.getMessage());
        }
        finally {
            System.out.println("this is finally block , Even in tsunami it might work");
        }
        System.out.println(" Post try catch code : ");
    }
}

class A {

    public void letsRockTogethor() throws TsunamiException {

        Scanner sc = new Scanner(System.in);

        int waterLevel = sc.nextInt();

        if(waterLevel>100){
            throw new TsunamiException("Tsunami has come Bhaagooooo!!!");
        }



//        int a = sc.nextInt();
//
//        if(a==0){
//            throw new ArithmeticException("The value of a is "+a);
//        }
//
//        int ans = 10/a;
//
//
//
//        int b = sc.nextInt();
//
//        if(b==0){
//            throw new ArithmeticException("the value of b is "+0);
//        }
//
//        int ans1 = 10/b;



    }
}

class TsunamiException extends Exception {

    public TsunamiException(String message){
        super(message);
    }
}


