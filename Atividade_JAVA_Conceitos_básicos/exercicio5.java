//NOME: Mateus Kenzo Iochimoto TIA: 32216289
//NOME: Rodrigo Machado de Assis Oliveira de Lima TIA: 32234678
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] primeiroVetor = {1, 4, 5, 7};
        int n = primeiroVetor.length;
        int k = n;

        int[][] segundoVetor = new int[k][2];

        int posicao = 0;
        for (int i = 0; i < n; i++) {
            int elemento = primeiroVetor[i];
            boolean encontrado = false;
            for (int j = 0; j < k; j++) {
                if (segundoVetor[j][0] == elemento) {
                    segundoVetor[j][1]++;
                    encontrado = true;
                    break;
                }
            }
            if (!encontrado) {
                segundoVetor[posicao][0] = elemento;
                segundoVetor[posicao][1]++;
                posicao++;
            }
        }

        int[][] vetorFinal = Arrays.stream(segundoVetor).filter(a -> a[1] != 0).toArray(int[][]::new);
        System.out.println(Arrays.deepToString(vetorFinal));
    }
}
