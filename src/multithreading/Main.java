package multithreading;


import static java.lang.Thread.sleep;


class ChromeTab2 implements Runnable {


    @Override
    public void run() {

        for(int i = 1;i>=0;i++){
            System.out.println("the ChromeTab2 "+i);

//            try {
//                sleep(1);
//            } catch (InterruptedException e) {
//                throw new RuntimeException(e);
//            }

        }


    }
}

//First Way
class ChromeTab extends Thread{

    public void run(){ //We are overriding Thread's class run method()

        //We are in the Thread class

        for(int i=1;i>=0;i++){
            System.out.println("Chrome +"+i);
//            try {
//                sleep(2);
//            } catch (InterruptedException e) {
//                throw new RuntimeException(e);
//            }
        }
    }
}


public class Main {

    public static void main(String[] args) throws InterruptedException {


        ChromeTab chromeTab = new ChromeTab();
        chromeTab.start();

        //This will be for execution of the main thread

        for(int i=1;i>=0;i++){

            //sleep(1);
            System.out.println("Main tab"+i);
        }


        //In order to declare the second thread

        Thread thread = new Thread(new ChromeTab2());
        thread.start();

        thread.isAlive(); //True or false based on if thread is alive or not


        thread.getName(); //

        int priority = thread.getPriority();
        //Lower the priority : more the importance

        thread.join(); //Killing the thread and merging with main thread

        thread.getState();

        //get and set the priority of thread
    }

}
