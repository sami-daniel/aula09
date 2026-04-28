public class Exercicio02 {
    public static int somarArray(int[] array) {
        int soma = 0;
        for (int i = 0; i < array.length; i++) {
            soma += array[i];
        }

        return soma;
    }
}
