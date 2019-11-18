import java.util.Scanner;

public class Smartphone {

    public static void main(String[] args) {
        String input = "";
        Smartphone smartphone = new Smartphone();
        Thread thread;
        Oven oven = new Oven();

        do {
            Scanner scanner = new Scanner(System.in);
            System.out.println(("Please type in action"));
            input = scanner.nextLine();


            if ("1".equals(input)) {
                System.out.println("Input: 1");
                OvenOnCommand ovenOnCommand = new OvenOnCommand(oven);
                thread = new Thread(ovenOnCommand);
                thread.start();

            }

            else if("2".equals(input)) {
                System.out.println("Input: 2");
                OvenOffCommand ovenOffCommand = new OvenOffCommand(oven);
                thread = new Thread(ovenOffCommand);
                thread.start();
            }

            else if ("3".equals(input)) {
                System.out.println("Input: 3");
                OvenTimerCommand ovenTimerCommand = new OvenTimerCommand(oven, 5);
                thread = new Thread(ovenTimerCommand);
                thread.start();
            }
            else if ("quit".equals(input)) {
                System.out.println("Terminating...");
                System.exit(0);
            }
            else {
                System.err.println("Invalid input!!!");
            }
        } while (!input.equals("quit"));
    }
}
