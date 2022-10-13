package dio.metodos.exercicio01;

public class Main {
    public static void main(String[] args) {
        System.out.println("EXERCÍCIO CALCULADORA");
        double[] numeros = Calculadora.pegarNumeros();
        Calculadora.soma(numeros);
        Calculadora.subtracao(numeros);
        Calculadora.multiplicacao(numeros);
        Calculadora.divisao(numeros);
        System.out.println();

        System.out.println("EXERCÍCIO MENSAGEM");
        Mensagem.gerarMensagem();
        System.out.println();

        System.out.println("EXERCÍCIO EMPRÉSTIMO");
        Emprestimo.calcularEmprestimo();
    }
}
