import java.util.Random;

public class Ex10_ArraysMultidimensional {
    /*
     * Gere e imprima uma matriz M 4x4 com valores aleatorios entre 0-9
     */
    public static void main(String[] args) {
        Random random = new Random();

        int [][] M = new int[4][4];

        for(int linha = 0; linha < M.length; linha++){
            for(int coluna=0; coluna < M[linha].length; coluna++){
                M[linha][coluna] = random.nextInt(9);
            }
        }

        System.out.println("Matriz 4x4:");
        for(int[] linha : M){
            for(int elementoDaColuna : linha){
                System.out.print(elementoDaColuna + " ");
            }
            System.out.println();
        }
    }
}
