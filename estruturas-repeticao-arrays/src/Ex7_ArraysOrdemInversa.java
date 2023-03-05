public class Ex7_ArraysOrdemInversa {
    /*
     * Criar um vetor de 6 números inteiros e mostre-os em ordem inversa.
     */
    public static void main(String[] args) {
        
        int[] vetor = {0, -5, 15, 80, 8, 4};

        System.out.println(vetor);

        System.out.println("Vetor: ");
        int count=0;
        while(count < vetor.length){ //lenght = 6, o count vai de 0 a 5.
            System.out.print(vetor[count] + " ");
            count++;
        }

        System.out.println("\nVetor Inverso: ");
        for(int i = (vetor.length - 1); i>=0 ;i--){
            System.out.print(vetor[i] + " ");
        }
    }
}
