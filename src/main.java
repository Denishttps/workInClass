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

            System.out.print("Geben Sie den ersten Operanden ein: ");
            int firstOperand = scanner.nextInt();

            System.out.print("Geben Sie den zweiten Operanden ein: ");
            int lastOperand = scanner.nextInt();

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
                    break

                default:
                    System.out.println("Wie bitte?");

            }

            System.out.print("Möchten Sie eine weitere Berechnung durchführen? (ja/nein): ");
            if (scanner.nextLine() == "nein") {
                break
            }
        }
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(task1(scanner))
        task2(scanner)
    }
}