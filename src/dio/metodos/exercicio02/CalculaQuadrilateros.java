/*
Criar uma aplicação que calcula a área dos
3 quadriláteros notáveis: quadrado, retângulo e trapézio.

Obs: Use sobrecarga.
 */

package dio.metodos.exercicio02;

public class CalculaQuadrilateros {
    public static void area(double lado){
        System.out.println("Área do quadrado: " + lado*lado);
    }

    public static void area(double altura, double largura){
        System.out.println("Área do retangulo: " + altura*largura);
    }

    public static void area(double baseMaior, double baseMenor, double altura){
        System.out.println("Área do trapézio: " + ((baseMaior+baseMenor)*altura)/2);
    }
}
