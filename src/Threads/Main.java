import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        MyThread nt = new MyThread(20000);
        MyThread nt2 = new MyThread();
        Thread rt;
        Thread rt2;

        while (true) {
            System.out.println("Which Thread do you want to start?");
            Scanner scanner = new Scanner(System.in);
            String command = scanner.nextLine();

            rt = new Thread(nt, "MyThread1");
            rt2 = new Thread(nt2, "MyThread2");

            if(command.equals("1")) {
                rt.start();
                // nt.run();  program is blocked
            }

            else if (command.equals("2")) {
                rt2.start();
            }

            else if (command.equals("stop1") && nt.isRunning()) {
                nt = null;
                rt = null;
                nt = new MyThread();
                rt = new Thread(MyThread, "MyThread");
            }

            else if (command.equals("stop2") && nt2.isRunning()) {
                nt2 = null;
                rt2 = null;
                nt2 = new MyThread();
                rt2 = new Thread(MyThread, "MyThread2");
            }

            else {
                if (nt.isRunning()) {
                    System.out.println("Thread is running");
                }
            }
        }
    }
}
