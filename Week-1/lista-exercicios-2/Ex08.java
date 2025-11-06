import java.util.Scanner;
import java.util.Locale;

/**
 *
 * @author Nzola Kiampava
 */

public class Ex08 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US); // garante o uso do ponto como separador decimal
        Scanner sc = new Scanner(System.in);

        double salario = sc.nextDouble();
        double imposto = 0.0;

        if (salario <= 2000.00) {
            System.out.println("Isento");
        } 
        else if (salario <= 3000.00) {
            imposto = (salario - 2000.00) * 0.08;
            System.out.printf("R$ %.2f%n", imposto);
        } 
        else if (salario <= 4500.00) {
            imposto = (salario - 3000.00) * 0.18 + 1000.00 * 0.08;
            System.out.printf("R$ %.2f%n", imposto);
        } 
        else {
            imposto = (salario - 4500.00) * 0.28 + 1500.00 * 0.18 + 1000.00 * 0.08;
            System.out.printf("R$ %.2f%n", imposto);
        }

        sc.close();
    }
}
