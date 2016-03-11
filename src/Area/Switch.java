package Area;


import java.util.Scanner;

public class Switch {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите команду: ");

        String command = scanner.nextLine();

        switch (command){
            case "start":
                System.out.println("Server is starting");
                break;
            case "stop":
                System.out.println("Server is going to shutdown");
                break;
            default:
                System.out.println("Unknown command: '" + command +"'");

        }

    }
}
