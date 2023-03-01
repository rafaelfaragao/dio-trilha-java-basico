public class OperadosRelacionais {
    /**
     * Classe de exemplo para o exercício da aula 1 de operadores relacionais, lógicos e de fluxos em Java
     */
    public static void main(String[] args) throws Exception {
        
        int i1 = 10;
        int i2 = 20;
        float f1 = 4.5F;
        float f2 = 3.5F;
        double d1 = 59.6;
        char c1 = 'x';
        char c2 = 'y';
        String s1 = "Fulano";
        String s2 = "Fulano";
        String s3 = "Cicrano";
        boolean b1 = true;
        boolean b2 = false;

        long l1 = 1597L;
        long l2 = 8897L;
        byte by1 = 1;
        short h1 = 25;

        System.out.println("i1 == i2 " + (i1 == i2));
        System.out.println("i1 != i2 " + (i1 != i2));
        System.out.println("i1 > i2 " + (i1 > i2));
        System.out.println("i1 <= i2 " + (i1 <= i2));

        System.out.println("f1 == f2 " + (f1 == f2));
        System.out.println("f1 != f2 " + (f1 != f2));
        System.out.println("f1 >= f2 " + (f1 >= f2));
        System.out.println("f1 <= f2 " + (f1 <= f2));

        System.out.println("c1 == c2 " + (c1 == c2));
        System.out.println("c1 != c2 " + (c1 != c2));
        System.out.println("c1 > c2 " + (c1 > c2));
        System.out.println("c1 <= c2 " + (c1 <= c2));

        System.out.println("s1 == s2 " + (s1 == s2));
        System.out.println("s1 == s3 " + (s1 == s3));
        System.out.println("s1 != s2 " + (s1 != s2));
        //System.out.println(s2 != c1); não pode comparar com tipos diferentes
        //System.out.println(s3 != i1); 

        System.out.println("b1 == b2 " + (b1 == b2));
        System.out.println("b1 != b2 " + (b1 != b2));
        //System.out.println(b1 >= b2); //boolean não aceitam comparações de tamanho
        //System.out.println(b1 < b2);
        
        System.out.println("i2 > f1 " + (i2 > f1)); //aqui são de tipos diferentes, mas são todos numéricos
        System.out.println("d1 == h1 " + (d1 == h1));
        //System.out.println(s2 != c1);
        //System.out.println(s3 != i1);

        System.out.println("l1 == l2 " + (l1 == l2));
        System.out.println("l1 >= i1 " + (l1 >= i1));
        System.out.println("by1 != h1 " + (by1 != h1));
    }
}
