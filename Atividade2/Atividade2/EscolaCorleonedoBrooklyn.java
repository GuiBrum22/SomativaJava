package Atividade2;

import java.util.Scanner;
import java.util.Random;

public class EscolaCorleonedoBrooklyn {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        System.out.print("Digite o número de matrícula do aluno: ");
        int matricula = scanner.nextInt();

        int time = random.nextInt(4);
        String nomeTime = "";
        switch (time) {
            case 0:
                nomeTime = "Time do Chris";
                break;
            case 1:
                nomeTime = "Time do Greg";
                break;
            case 2:
                nomeTime = "Time do Caruso";
                break;
            case 3:
                nomeTime = "Time do Jerome";
                break;
        }

        System.out.println("O aluno de matrícula " + matricula + " faz parte do " + nomeTime + ".");
    }
}
