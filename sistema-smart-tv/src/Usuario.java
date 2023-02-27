public class Usuario {
    public static void main(String[] args) throws Exception {
        SmartTv smartTv = new SmartTv();

        System.out.println("TV Ligada: " + smartTv.ligada);
        System.out.println("Canal Atual: " + smartTv.canal);
        System.out.println("Volume Atual: " + smartTv.volume);
        
        smartTv.ligarDesligar();

        System.out.println("TV Ligada: " + smartTv.ligada);

        smartTv.diminuirVolume();
        smartTv.diminuirVolume();
        smartTv.diminuirVolume();
        smartTv.aumentarVolume();
        System.out.println("Volume Atual: " + smartTv.volume);

        smartTv.aumentarCanal();
        System.out.println("Canal Atual: " + smartTv.canal);

        smartTv.mudarCanalPara(10);
        System.out.println("Canal Atual: " + smartTv.canal);

    }
}
