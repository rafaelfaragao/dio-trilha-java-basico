import java.util.Scanner;

public class Ex5_Tabuada {
    /*
     * Gerador de Tabuada
     * Informar um numero de 1 a 10 e a saída será uma tabuada deste número:
     * 5x1 = 5
     * 5x2 = 10
     * ...
     * 5x10 = 50
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Número da Tabuada: ");
        int tabuada = scan.nextInt();

        System.out.println("Tabuada de: " + tabuada);

        for (int i = 1; i <= 10; i++ ){
            System.out.println(tabuada + "x" + i + " = " + (tabuada*i));
        }
    }
}
