import java.util.Scanner;

public class Smartphone implements Runnable{

    @Override
    public void run() {

    }

    public static void main(String[] args) {
        String input = "";
        Smartphone smartphone = new Smartphone();

        do {
            Scanner scanner = new Scanner(System.in);
            System.out.println(("Please type in action"));
            input = scanner.nextLine();
            Thread thread;

            if ("1".equals(input)) {
                System.out.println("Input: 1");
            }

            else if("2".equals(input)) {
                System.out.println("Input: 2");
            }

            else if ("3".equals(input)) {
                System.out.println("Input: 3");
            }
            else if ("quit".equals(input)) {
                System.out.println("Terminating...");
            }
            else {
                System.err.println("Invalid input!!!");
            }

        } while (!input.equals("quit"));
    }
}
