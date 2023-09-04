public class Usuario {
    public static void main(String[] args) throws Exception {
    

        SmartTv smartTv = new SmartTv();

        //LIGANDO A TV
        
        smartTv.ligar();
        System.out.println("SAMSUMG!");
        System.out.println("TV ligada ? " + smartTv.ligada);
        

        //CANAL DA TV

        smartTv.mudarDeCanal(9);

        smartTv.subirDeCanal();
        smartTv.descerDeCanal();
        smartTv.descerDeCanal();
        smartTv.descerDeCanal();

        //VOLUME DA TV

        smartTv.aumentarVolume();
        smartTv.aumentarVolume();
        smartTv.aumentarVolume();
        smartTv.aumentarVolume();
        smartTv.aumentarVolume();
        smartTv.diminuirVolume();

        //DESLIGANDO A TV

        smartTv.desligar();
        System.out.println("ATÉ MAIS!!");
        System.out.println("TV ligada ? " + smartTv.ligada);

    }
}
