/*
 * Calcule o valor final de um empréstimo,
 * a partir do valor solicitado.
 * Taxas e parcelas influenciam.
 * Defina arbitrariamente as faixas
 * que influenciam nos valores.
 */

package dio.metodos.exercicio01;

import java.util.Scanner;

public class Emprestimo {
    private static Scanner scan;
    private static double taxa(int qtdParcelas) {
        if(qtdParcelas > 0 && qtdParcelas <= 3) {
            return 0.0;
        }else if(qtdParcelas <= 6) {
            return 0.3;
        }else if(qtdParcelas > 6) {
            return 0.45;
        }else {
            System.out.println("Número de parcelas inválido!");
            return -1;
        }
    }

    public static void calcularEmprestimo() {
        scan = new Scanner(System.in);

        double valor;
        do {
            System.out.println("Digite o valor do empréstimo: ");
            valor = scan.nextDouble();
            if (valor < 100){
                System.out.println("Empréstimos somente a partir de R$100,00!");
            }
        }while (valor < 100);

        int qtdParcelas;
        do {
            System.out.println("Digite a quantidade de parcelas: ");
            qtdParcelas = scan.nextInt();
            if (qtdParcelas <= 0){
                System.out.println("Número de parcelas inválido!");
            }
        }while (qtdParcelas <= 0);

        double tx = taxa(qtdParcelas);

        double valorfinal = valor + (valor * tx);
        System.out.printf("O valor final do empréstimo é de R$%.2f, "
                            + "parcelado em %d vezes, é de R$%.2f. \n"
                            , valor, qtdParcelas, valorfinal);
        System.out.println("A taxa paga nesse empréstimo é de " + (int)(tx*100) + "%.");
    }
}
