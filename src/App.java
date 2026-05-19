// Nome: Sami Daniel Santos Silva
// Matricula: 1261950200

public class App {
    public static void main(String[] args) throws Exception {
        int[] numeros = { 10, 20, 30, 40, 50 };

        Exercicio01.imprimirArray(numeros);
        System.out.println(Exercicio02.somarArray(numeros));
        System.out.println(Exercicio03.encontrarMaior(numeros));
        System.out.println(Exercicio04.contarPares(numeros));
        System.out.printf("%.2f\n", Exercicio05.calcularMedia(numeros));

        System.out.println("---");

        Exercicio06.analizarNotasTurma();
    }
}
