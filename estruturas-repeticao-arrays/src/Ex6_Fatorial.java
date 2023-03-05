import java.util.Scanner;

public class Ex6_Fatorial {
    /*
     * Faça um programa que calcule o fatorial de um numero inteiro fornecido pelo usuário
     * Ex.: 5! = 120 (5x4x3x2x1)
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Fatorial: ");
        int fatorial = scan.nextInt();
        int multiplicacao = 1;

        System.out.print(fatorial + "! = ");
        for(int i = fatorial ; i >= 1; i--){
            multiplicacao = multiplicacao * i;
        }

        System.out.println(multiplicacao);
    }
}
