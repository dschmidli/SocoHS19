import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        MyThread mt1 = new MyThread(20000);
        MyThread mt2 = new MyThread();

        Thread rt1;
        Thread rt2;

        long elapsed1 = System.currentTimeMillis();
        long elapsed2 = System.currentTimeMillis();

        while (true) {
            System.out.println("Which Thread do you want to start?");
            Scanner scanner = new Scanner(System.in);
            String command = scanner.nextLine();

            if(command.equals("1") && !mt1.isRunning()) {
                rt1 = new Thread(mt1, "MyThread1");
                elapsed1 = System.currentTimeMillis();
                rt1.start();
                // nt.run();  program is blocked
            }

            else if (command.equals("2") && !mt2.isRunning()) {
                rt2 = new Thread(mt2, "MyThread2");
                elapsed2 = System.currentTimeMillis();
                rt2.start();
            }

            else if (command.equals("stop1") && mt1.isRunning()) {
                mt1 = null;
                rt1 = null;
                float time = System.currentTimeMillis() - elapsed1;
                System.out.println("Elapsed time 1: " + time);
                mt1 = new MyThread();
                rt1 = new Thread(mt1, "MyThread");
            }

            else if (command.equals("stop2") && mt2.isRunning()) {
                mt2 = null;
                rt2 = null;
                float time = System.currentTimeMillis() - elapsed2;
                System.out.println("Elapsed time 2: " + time);
                mt2 = new MyThread();
                rt2 = new Thread(mt2, "MyThread2");
            }

            else if (command.toLowerCase().equals("quit")) {
                System.err.println("User terminated successfully");
                System.exit(0);
            }

            else {
                if (mt1.isRunning()) {
                    System.out.println("Thread 1 is running");
                }
                if (mt2.isRunning()) {
                    System.out.println("Thread 2 is running");
                }
            }
        }
    }
}
