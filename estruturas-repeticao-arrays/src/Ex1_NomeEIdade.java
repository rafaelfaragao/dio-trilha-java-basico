import java.util.Scanner;

public class Ex1_NomeEIdade {
    /*
     * Faça um programa que leia conjuntos de dois valores,
     * o primeiro representando o nome do aluno e o segundo representando a sua idade.
     * (Pare o programa inserindo o valor 0 no campo nome)
     */
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);

        String nome;
        int idade;

        while(true){

            System.out.print("Nome: ");
            nome = scan.next();
            if(nome.equals("0")) break;

            System.out.print("Idade: ");
            idade = scan.nextInt();
        }
        System.out.println("Terminou a chamada... continua o programa...");
    }
}
