import java.util.Scanner;

public class Exercicio06 {
    public static void analizarNotasTurma() {
        double[] notas = new double[5];
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < notas.length; i++) {
            System.out.println("Digite a nota do " + (i + 1) + "º aluno: ");
            notas[i] = scanner.nextDouble();
        }

        System.out.println("Notas digitadas: ");
        imprimirNotas(notas);

        System.out.println("Média da turma: " + calcularMedia(notas));
        System.out.println("Maior nota da turma: " + encontrarMaior(notas));

        int aprovados = contarAprovados(notas);
        System.out.println("Alunos aprovados: " + aprovados);

        scanner.close();
    }

    public static void imprimirNotas(double[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }

    public static double calcularMedia(double[] array) {
        double soma = 0.0;
        for (int i = 0; i < array.length; i++) {
            soma += array[i];
        }

        return soma / array.length;
    }

    public static double encontrarMaior(double[] array) {
        double maior = array.length > 0 ? array[0] : 0.0;
        for (int i = 1; i < array.length; i++) {
            if (array[i] > maior) {
                maior = array[i];
            }
        }

        return maior;
    }

    public static int contarAprovados(double[] array) {
        int contador = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] >= 6.0) {
                contador++;
            }
        }

        return contador;
    }

}
