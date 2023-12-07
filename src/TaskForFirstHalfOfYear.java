import java.util.Scanner;

public class Main {

    public static void task1(Scanner scanner) {
        System.out.print("Geben Sie Ihren Benutzernamen ein: ");
        String username = scanner.nextLine();

        System.out.print("Passwort eingeben: ");
        String password = scanner.nextLine();

        if (username.equals("admin") && password.equals("geheim")) {
            System.out.println("Anmeldung erfolgreich!");
        } else {
            System.out.println("Anmeldung fehlgeschlagen!");
        }
    }


    public static void task2(Scanner scanner) {
        System.out.println("Willkommen beim Taschenrechner!");

        while (true) {
            System.out.print("Geben Sie die gewünschte Operation ein (+, -, *, /): ");
            String operator = scanner.nextLine();

            System.out.print("Geben Sie den ersten Operanden ein: ");
            int firstOperand = scanner.nextInt();

            System.out.print("Geben Sie den zweiten Operanden ein: ");
            int lastOperand = scanner.nextInt();

            scanner.nextLine();

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
                    try {
                        System.out.println(firstOperand / lastOperand);
                    } catch (ArithmeticException e) {
                        System.out.println("Division by zero error.");
                    }
                    break;

                default:
                    System.out.println("Ungültige Operation!");
            }

            System.out.print("Möchten Sie eine weitere Berechnung durchführen? (ja/nein): ");
            String continueCalculation = scanner.nextLine();
            if (continueCalculation.equalsIgnoreCase("nein")) { 
                System.out.println("Auf Wiedersehen!");
                break;
            }
        }
    }


    public static void task3(Scanner scanner) {
        double usdToEurRate = 0.92;
        double eurToJpyRate = 163.87;
        double jpyToUsdRate = 0.0066;

        String[] currencies = { "USD (US-Dollar)", "EUR (Euro)", "JPY (Japanischer Yen)" };

        System.out.println("Willkommen beim Währungsumrechner!");

        while (true) {
            System.out.println("Verfügbare Währungen:");
            for (int i = 0; i < currencies.length; i++) {
                System.out.println((i + 1) + ". " + currencies[i]);
            }

            System.out.print("Geben Sie den Betrag in der Ausgangswährung ein: ");
            double amount = scanner.nextDouble();

            System.out.print("Geben Sie die Ausgangswährung (1/2/3): ");
            int sourceCurrency = scanner.nextInt();

            System.out.print("Geben Sie die Zielswährung (1/2/3): ");
            int targetCurrency = scanner.nextInt();

            double convertedAmount = 0.0;

            if (sourceCurrency == 1 && targetCurrency == 2) {
                convertedAmount = amount * usdToEurRate;
            } else if (sourceCurrency == 2 && targetCurrency == 3) {
                convertedAmount = amount * eurToJpyRate;
            } else if (sourceCurrency == 3 && targetCurrency == 1) {
                convertedAmount = amount * jpyToUsdRate;
            } else {
                System.out.println("Ungültige Auswahl von Währungen.");
            }

                System.out.println("Der umgerechnete Betrag ist: " + convertedAmount + " " + currencies[targetCurrency - 1]);

                System.out.print("Möchten Sie eine weitere Umrechnung durchführen? (ja/nein): ");
                String choice = scanner.next();

                if (choice.equalsIgnoreCase("nein")) {
                    System.out.println("Auf Wiedersehen!");
                    break;
                }
            }

    }



    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        task1(scanner);
        task2(scanner);
        task3(scanner);
        scanner.close(); 
    }
}
