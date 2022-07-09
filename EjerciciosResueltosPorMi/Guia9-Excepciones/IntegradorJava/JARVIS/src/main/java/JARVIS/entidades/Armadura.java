package JARVIS.entidades;

/*@author Angel Gabriel Arévalo*/
public class Armadura {
   private String colorPrimario;    //Color primario de la armadura
   private String colorSecundario;  //Color secundario de la armadura
   private int nivelResistencia;    //Nivel de resistencia de la armadura, depende del material de fabricación y se mide en Rockwell.
   private int nivelSalud;          //Nivel de salud de la armadura que va de 0 a 100
   private Bota botaIzquierda;      //Bota izquierda de la armadura
   private Bota botaDerecha;        //Bota derecha de la armadura
   private Guante guanteIzquierdo;  //Guante izquierdo de la armadura
   private Guante guanteDerecho;    //Guante derecho de la armadura
   private Casco casco;             //Casco de la armadura
   private Generador generador;     //Generador de la armadura. Este generador funciona de bateria.
   
   /**
    * La energía que se consume al caminar es igual al consumo de la bota
    * por el tiempo que se camine. El metodo le dice al generador de la armadura
    * que reste la energia consumida al caminar.
    * @param consumoBota El consumo que utiliza al caminar en una unidad de tiempo
    * @param tiempoCaminar Tiempo que se camina
    * @return se retorna la energía total que se consume al caminar;
    */
   public int caminar(int consumoBota, int tiempoCaminar){
       int energiaEstablecida=consumoBota*tiempoCaminar;
       generador.energiaConsumida(energiaEstablecida);
       return energiaEstablecida;
   }
   
   /**
    * Al correr se consume el doble de la energía que consume la bota por el
    * tiempo que se corra. El metodo le dice al generador que reste la energía 
    * consumida al correr.
    * @param consumoBota El consumo que se utiliza al correr en una unidad de tiempo.
    * @param tiempoCorrer Tiempo en el que se corre.
    * @return Se retorna el total de energía consumida al correr.
    */
   public int correr(int consumoBota, int tiempoCorrer){
       int energiaEstablecida=2*consumoBota*tiempoCorrer;
       generador.energiaConsumida(energiaEstablecida);
       return energiaEstablecida;
   }
   
   
   public int propulsarse(int consumoPropulsor, int tiempoCaminar){
       int energiaEstablecida=consumoBota*tiempoCaminar;
       generador.energiaConsumida(energiaEstablecida);
       return energiaEstablecida;
   }
}
