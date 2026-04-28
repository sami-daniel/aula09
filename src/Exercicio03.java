public class Exercicio03 {
    public static int encontrarMaior(int[] array) {
        int maior = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > maior || i == 0) {
                maior = array[i];
            }
        }

        return maior;
    }
}
