/*
 * Calcule as 4 operções básicas:
 * soma, subtração, multiplicação e divisão.
 * Sempre 2 valores devem ser passados.
 */

package dio.metodos.exercicio01;

import java.util.Scanner;

public class Calculadora {
    private static Scanner scan;

    public static double[] pegarNumeros(){
        scan = new Scanner(System.in);

        double[] numeros = new double[2];
        System.out.println("Digite o 1º número");
        numeros[0] = scan.nextDouble();
        System.out.println("Digite o 2º número");
        numeros[1] = scan.nextDouble();

        return numeros;
    }

    public static void soma(double[] numeros) {
        double resultado = numeros[0] + numeros[1];
        System.out.println("Soma: " + numeros[0] + " + "
                + numeros[1] + " = " + resultado);
    }

    public static void subtracao(double[] numeros) {
        double resultado = numeros[0] - numeros[1];
        System.out.println("Subtração: " + numeros[0] + " - "
                + numeros[1] + " = " + resultado);
    }

    public static void multiplicacao(double[] numeros) {
        double resultado = numeros[0] * numeros[1];
        System.out.println("Multiplicação: " + numeros[0] + " x "
                + numeros[1] + " = " + resultado);
    }

    public static void divisao(double[] numeros) {
        double resultado = numeros[0] / numeros[1];
        System.out.println("Divisão: " + numeros[0] + " / "
                + numeros[1] + " = " + resultado);
    }
}
