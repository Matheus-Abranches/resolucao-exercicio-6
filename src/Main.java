import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("digite qualquer valor:");
        int valor = scanner.nextInt();

        double valorreajustado = valor * 1.05;

        System.out.println("o valor digitado reajusta com 5% é: " + valorreajustado);

    }
}