// Nome: Sami Daniel Santos Silva
// Matricula: 1261950200

public class Exercicio05 {
    public static double calcularMedia(int[] array) {
        int soma = 0;
        for (int i = 0; i < array.length; i++) {
            soma += array[i];
        }

        return (double)soma / array.length ;
    }
}
