package Atividade1;

import java.util.Scanner;

public class MillenniumFalcon {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o primeiro número: ");
        double numero1 = scanner.nextDouble();

        System.out.print("Digite o segundo número: ");
        double numero2 = scanner.nextDouble();

        System.out.println("Escolha uma operação aritmética: ");
        System.out.println("1. Adição");
        System.out.println("2. Subtração");
        System.out.println("3. Multiplicação");
        System.out.println("4. Divisão");
        int escolha = scanner.nextInt();

        double resultado = 0.0;
        String operador = "";
        switch (escolha) {
            case 1:
                resultado = numero1 + numero2;
                operador = "+";
                break;
            case 2:
                resultado = numero1 - numero2;
                operador = "-";
                break;
            case 3:
                resultado = numero1 * numero2;
                operador = "*";
                break;
            case 4:
                resultado = numero1 / numero2;
                operador = "/";
                break;
            default:
                System.out.println("Opção inválida.");
                System.exit(0);
        }

        System.out.println(numero1 + " " + operador + " " + numero2 + " = " + resultado);
    }
}

