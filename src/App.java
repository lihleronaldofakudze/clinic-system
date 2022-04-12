import java.util.Scanner;

public class App {
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        DatabaseConnection.getConnection();
        System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
        login();
    }

    public static void login() {
        System.out.println("Welcome to the Hospital Management System");
        System.out.println("\t 1. Login");
        System.out.println("\t 2. Exit");
        System.out.print("Enter your choice: ");
        int response = scanner.nextInt();
        scanner.nextLine();
        switch (response) {
            case 1:
                System.out.print("Enter your username: ");
                String username = scanner.nextLine();
                System.out.print("Enter your password: ");
                String password = scanner.nextLine();

                User user = new User();
                boolean isLogged = user.login(username, password);

                if (isLogged) {
                    Interface.mainMenu();
                } else {
                    System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
                    System.out.println("ERROR: Invalid username or password");
                    System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
                    login();
                }

                break;
            case 2:
                System.exit(0);
                System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
                System.out.println("Thank you for using the Hospital Management System");
                System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
                break;
            default:
                System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
                System.out.println("Invalid choice");
                System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
                login();
        }
    }
}
