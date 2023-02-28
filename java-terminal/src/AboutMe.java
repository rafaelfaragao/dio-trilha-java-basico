public class AboutMe {
    /**
     * A classe AboutMe recebe dois parametros pelo args
     * O primeiro parametro é o nome (String) e o segundo é a idade (int).
     * @param args
     */
    public static void main(String[] args) {
        String nome = args[0];
        int idade = Integer.valueOf(args[1]);

        System.out.println("Olá, me chamo: " + nome + "e tenho " + idade + " anos.");
    }
}
