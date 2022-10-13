/*
 * A partir da hora do dia,
 * informe a mensagem adequada:
 * Bom dia!, Boa tarde! e Boa noite!
 */

package dio.metodos.exercicio01;

import java.util.Scanner;

public class Mensagem {
    private static Scanner scan;

    public static void gerarMensagem() {
        scan = new Scanner(System.in);

        int hora;
        do {
            System.out.println("Digite que horas são: ");
            hora = scan.nextInt();
            if (hora < 0 || hora > 24){
                System.out.println("Hora inválida!");
            }
        }while (hora < 0 || hora > 24);

        int minutos;
        do {
            System.out.println("Digite os minutos: ");
            minutos = scan.nextInt();
            if (minutos < 0 || minutos > 59){
                System.out.println("Valor de minutos inválido!");
            }
        }while (minutos < 0 || minutos > 59);


        switch (hora) {
            case 0: case 1: case 2: case 3:
            case 4: case 5: case 6: case 7:
            case 8: case 9: case 10: case 11:
            case 24:
                System.out.println("Horário: " + String.format("%02d", hora) + ":" + String.format("%02d", minutos) + "\nBom dia!");
                break;

            case 12: case 13: case 14: case 15:
            case 16: case 17:
                System.out.println("Horário: " + hora + ":" + String.format("%02d", minutos) + "\nBoa tarde!");
                break;

            case 18: case 19: case 20: case 21:
            case 22: case 23:
                System.out.println("Horário: " + hora + ":" + String.format("%02d", minutos) + "\nBoa noite!");
                break;

            default:
                break;
        }
    }
}
