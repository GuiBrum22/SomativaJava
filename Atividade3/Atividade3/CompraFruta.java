package Atividade3;

import java.util.Scanner;

public class CompraFruta {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a quantidade de morangos(em Kg): ");
        double kgMorangos = scanner.nextDouble();

        System.out.print("Digite a quantidade de maçãs(em Kg): ");
        double kgMaca = scanner.nextDouble();

        System.out.print("Digite a quantidade de bananas (em Kg): ");
        double kgBanana = scanner.nextDouble();

        double valorTotal = (kgMorangos * 3.5) + (kgMaca * 2.3) + (kgBanana * 1.8);

        if (kgMorangos + kgMaca + kgBanana > 15 || valorTotal > 30) {
            valorTotal *= 0.9;
        }

        System.out.println("O valor total a ser pago pelo cliente é: R$ " + valorTotal);
    }
}
