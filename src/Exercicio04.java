public class Exercicio04 {
    public static int contarPares(int[] array) {
        int acumulador = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                acumulador++;
            }
        }

        return acumulador;
    }
}
