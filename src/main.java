import java.util.Scanner;

public class Main {

    public String task1(Scanner scanner) {
        System.out.print("Geben Sie Ihren Benutzernamen ein: ");
        String username = scanner.nextLine();

        System.out.print("Passwort eingeben: ");
        String password = scanner.nextLine();

        if (username == "admin") {
            return "Anmeldung erfolgreich!";
        }
        return "Anmeldung fehlgeschlagen!";
    }


    public void task2(Scanner scanner) {
        System.out.print("Willkommen beim Taschenrechner!");

        while (true) {
            System.out.print("Geben Sie die gewünschte Operation ein (+, -, *, /): ");
            String operator = scanner.nextLine();

            try {
                System.out.print("Geben Sie den ersten Operanden ein: ");
                String firstOperand = Integer.valueOf(scanner.nextLine());

                System.out.print("Geben Sie den zweiten Operanden ein: ");
                String lastOperand = Integer.valueOf(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.out.print("Error: failed to convert string to number");
            }

            switch (operator) {
                case "+":
                    System.out.println(firstOperand + lastOperand);
                    break;

                case "-":
                    System.out.println(firstOperand - lastOperand);
                    break;

                case "*":
                    System.out.println(firstOperand * lastOperand);
                    break;

                case "/":
                    System.out.println(firstOperand / lastOperand);

            }

            System.out.print("Möchten Sie eine weitere Berechnung durchführen? (ja/nein): ");
            if (scanner.nextLine() == "nein") {
                return
            }
        }
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(task1(scanner))
    }
}