import java.util.Scanner;
import java.math.BigDecimal;

class Main {
    public static void main(String[] args) {
        begruesseBenutzer();
        addiereZahlen(new BigDecimal("4.76"), new BigDecimal("3.5"));
        druckeMultiplikationstabelle(5);
        
        System.out.println(berechneQuadrat(new BigDecimal("0.1")));
        System.out.println(berechneQuadrat(new BigDecimal("5")));
        System.out.println(findeGroessereZahl(3, 5));
        System.out.println(findGreaterNumber(0,2,4,6,5,1,3,2));
        System.out.println(berechneFakultaet(5));
        System.out.println(konvertiereEuroInDollar(new BigDecimal(100)));

        String text = "Hallo Welt";
        System.out.println(umkehren(text));
        System.out.println(berechneDurchschnitt(10, 12, 7));
    }


    public static void begruesseBenutzer() {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Wie heißt du?");
        String name = scanner.nextLine();
        System.out.println(name + ", Willkommen!");
        scanner.close();
    }


    public static void addiereZahlen(BigDecimal zahl1, BigDecimal zahl2) {
        BigDecimal summe = zahl1.add(zahl2);
        System.out.println(summe); 
    }


    public static void druckeMultiplikationstabelle(int zahl) {
        System.out.println("Tabelle für " + zahl);
        String tabele = "";
        for (int i = 1; i <= 10; i++) {
            int product = zahl * i;
            tabele += zahl + " * " + i + " = " + product + "\n";
        }
        System.out.println(tabele);
    }


    public static BigDecimal berechneQuadrat(BigDecimal zahl) {
        return zahl.multiply(zahl);
    }


    public static double findeGroessereZahl(double zahl1, double zahl2) {
        if (zahl1 > zahl2) {
            return zahl1;
        }
        return zahl2;
    }


    public static double findGreaterNumber(double... nums) {
        double greatest = nums[0];
        for (double num : nums) {
            if (num > greatest) {
                greatest = num;
            }
        }
        return greatest;
    }


    public static int berechneFakultaet(int num) {
        if (num <= 1) {
            return 1;
        }
        return num * berechneFakultaet(num - 1);
    }


    public static BigDecimal konvertiereEuroInDollar(BigDecimal euro) {
        final BigDecimal eurToUsd = new BigDecimal("1.08");
        return euro.multiply(eurToUsd);
    }


    public static String umkehren(String text) {
        String reversedText = "";
        for (int i = text.length() - 1; i >= 0; i--) {
            reversedText += text.charAt(i);
        }
        return reversedText;
    }


    public static double berechneDurchschnitt(int... grade) {
        int sum = 0;
        for (int grades : grade) {
            sum += grades;
        }
        return sum / grades.length;
    }  
}
