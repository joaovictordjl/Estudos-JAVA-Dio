public class SmartTv {
   boolean ligada=false;
   int canal =1;
   int volume =25;

   //STATUS DA TV
    public void ligar(){
    ligada=true;
    System.out.println("Ligando a TV");
   }
    public void desligar(){
    ligada=false;
    System.out.println("Desligando a TV");
   }
   
//VOLUME DA TV
    public void aumentarVolume(){
    volume++;
    System.out.println("Aumentando o volume para : " + volume);
  }
    public void diminuirVolume(){
    volume--;
    System.out.println("Diminuindo o volume para : " + volume);
  }

   //CANAL DA TV
    public void mudarDeCanal(int novoCanal){
      canal = novoCanal;
      System.out.println("Mudando de canal para : " + canal);

   }
    public void subirDeCanal(){
    canal++;
    System.out.println("Subindo para o canal : " + canal);
  }
    public void descerDeCanal(){
    canal--;
    System.out.println("Descendo para o canal : " + canal);
  }
   
   
}
