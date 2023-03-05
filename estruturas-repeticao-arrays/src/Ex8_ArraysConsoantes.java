import java.util.Scanner;

public class Ex8_ArraysConsoantes {
    /*
     * Faça um programa que leia um vetor de 6 caracteres,
     * e diga quantas consoantes foram lidas.
     * imprima as consoantes.
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String[] consoantes = new String[6];
        int quantConsoantes = 0;

        int count = 0;
        do {
            System.out.println("Letra: ");
            String letra = scan.next();

            if( !(letra.equalsIgnoreCase("a") | 
            letra.equalsIgnoreCase("e") | 
            letra.equalsIgnoreCase("i") | 
            letra.equalsIgnoreCase("o") |
            letra.equalsIgnoreCase("u"))) {
                consoantes[count] = letra;
                quantConsoantes++;
            }
            count++;
        }while(count < consoantes.length);

        System.out.print("\nConsoantes: ");
        for(String consoante : consoantes) { //foreach
            if(consoante != null){
                System.out.print(consoante + " ");
            }
        }
        System.out.print(("\nNumero de consoantes: " + quantConsoantes));
    }
}
