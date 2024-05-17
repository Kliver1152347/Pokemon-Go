

public class Pokedex
{
   String Entrenador;
   //variables del mundo
   static int Agua;
   static int Fuego;
   static int Dragon;
   static int Planta;
   static int Electrico;
   static int Roca;
   static int Volador;
   //Entrenador
   private int Aguas;
   private int Fuegos;
   private int Dragones;
   private int Plantas;
   private int Electricos;
   private int Rocas;
   private int Voladores;
   static int Entrena;
  
    public Pokedex()
    {
       Entrena++;
    }

   public void CapturarPokemon(Pokemon P)
    {
    if (P.Tipo=="Agua") {
        Agua++;
        Aguas++;
    } else if (P.Tipo=="Fuego") {
        Fuego++;
        Fuegos++;
    } else if (P.Tipo=="Dragon") {
        Dragon++;
        Dragones++;
    } else if (P.Tipo=="Planta") {
        Planta++;
        Plantas++;
    } else if (P.Tipo=="Electrico") {  
        Electrico++;
        Electricos++;
    } else if (P.Tipo=="Roca") {
        Roca++;
        Rocas++;
    } else if (P.Tipo=="Volador"){
        Volador++;
        Voladores++;
    }
    }
  
   public void LiberarPokemon(Pokemon P)
    {
      if (P.Tipo=="Agua") {
        Aguas--;
            } else if (P.Tipo=="Fuego") {
        Fuegos--;
    } else if (P.Tipo=="Dragon") {
        Dragones--;
    } else if (P.Tipo=="Planta") {
        Plantas--;
    } else if (P.Tipo=="Electrico") {  
        Electricos--;
    } else if (P.Tipo=="Roca") {
        Rocas++;
    } else if (P.Tipo=="Volador"){
        Voladores--;
    }
    }
   
    public void IntercambioDePokemon(Pokemon Pnuevo, Pokemon Pantiguo)
    {
    this.CapturarPokemon(Pnuevo);
    this.LiberarPokemon(Pantiguo);
    
    }
    
    public void reiniciarPokedex()
    {
        Aguas=0;
        Fuegos=0;
        Dragones=0;
        Plantas=0;
        Electricos=0;
        Rocas=0;
        Voladores=0;
        
    }
   
    public void MostrarEnPokedex()
    {
        System.out.println ("Pokemones de Tipo Aguas: " +Aguas);
        System.out.println ("Pokemones de Tipo Fuegos: " +Fuegos);
        System.out.println ("Pokemones de Tipo Dragones: " +Dragones);
        System.out.println ("Pokemones de Tipo Plantas: " +Plantas);
        System.out.println ("Pokemones de Tipo Electricos: " +Electricos);
        System.out.println ("Pokemones de Tipo Rocas: " +Rocas);
        System.out.println ("Pokemones de Tipo Voladores: " +Voladores);
    }
   
    public double MediaDePokemon()
    {
      return (Agua+Fuego+Dragon+Planta+Electrico+Roca+Volador)/Entrena;
    }
   
    /**Metodo de acceso a la propiedad entrenador*/
    public String getEntrenador(){
        return this.Entrenador;
    }//end method getEntrenador

    /**Metodo de modificación a la propiedad entrenador*/
    public void setEntrenador(String Entrenador){
        this.Entrenador = Entrenador;
    }//end method setEntrenador

    /**Metodo de acceso a la propiedad agua*/
    public int getAgua(){
        return this.Agua;
    }//end method getAgua

    /**Metodo de modificación a la propiedad agua*/
    public void setAgua(int Agua){
        this.Agua = Agua;
    }//end method setAgua

    /**Metodo de acceso a la propiedad fuego*/
    public int getFuego(){
        return this.Fuego;
    }//end method getFuego

    /**Metodo de modificación a la propiedad fuego*/
    public void setFuego(int Fuego){
        this.Fuego = Fuego;
    }//end method setFuego

    /**Metodo de acceso a la propiedad dragon*/
    public int getDragon(){
        return this.Dragon;
    }//end method getDragon

    /**Metodo de modificación a la propiedad dragon*/
    public void setDragon(int Dragon){
        this.Dragon = Dragon;
    }//end method setDragon

    /**Metodo de acceso a la propiedad planta*/
    public int getPlanta(){
        return this.Planta;
    }//end method getPlanta

    /**Metodo de modificación a la propiedad planta*/
    public void setPlanta(int Planta){
        this.Planta = Planta;
    }//end method setPlanta

    /**Metodo de acceso a la propiedad electrico*/
    public int getElectrico(){
        return this.Electrico;
    }//end method getElectrico

    /**Metodo de modificación a la propiedad electrico*/
    public void setElectrico(int Electrico){
        this.Electrico = Electrico;
    }//end method setElectrico

    /**Metodo de acceso a la propiedad roca*/
    public int getRoca(){
        return this.Roca;
    }//end method getRoca

    /**Metodo de modificación a la propiedad roca*/
    public void setRoca(int roca){
        this.Roca = Roca;
    }//end method setRoca

    /**Metodo de acceso a la propiedad volador*/
    public int getVolador(){
        return this.Volador;
    }//end method getVolador

    /**Metodo de modificación a la propiedad volador*/
    public void setVolador(int Volador){
        this.Volador = Volador;
    }//end method setVolador

    /**Metodo de acceso a la propiedad aguas*/
    public int getAguas(){
        return this.Aguas;
    }//end method getAguas

    /**Metodo de modificación a la propiedad aguas*/
    public void setAguas(int Aguas){
        this.Aguas = Aguas;
    }//end method setAguas

    /**Metodo de acceso a la propiedad fuegos*/
    public int getFuegos(){
        return this.Fuegos;
    }//end method getFuegos

    /**Metodo de modificación a la propiedad fuegos*/
    public void setFuegos(int Fuegos){
        this.Fuegos = Fuegos;
    }//end method setFuegos

    /**Metodo de acceso a la propiedad dragons*/
    public int getDragones(){
        return this.Dragones;
    }//end method getDragons

    /**Metodo de modificación a la propiedad dragons*/
    public void setDragones(int Dragones){
        this.Dragones = Dragones;
    }//end method setDragons

    /**Metodo de acceso a la propiedad plantas*/
    public int getPlantas(){
        return this.Plantas;
    }//end method getPlantas

    /**Metodo de modificación a la propiedad plantas*/
    public void SetPlantas(int Plantas){
        this.Plantas = Plantas;
    }//end method setPlantas

    /**Metodo de acceso a la propiedad electricos*/
    public int getElectricos(){
        return this.Electricos;
    }//end method getElectricos

    /**Metodo de modificación a la propiedad electricos*/
    public void setElectricos(int Electricos){
        this.Electricos = Electricos;
    }//end method setElectricos

    /**Metodo de acceso a la propiedad rocas*/
    public int getRocas(){
        return this.Rocas;
    }//end method getRocas

    /**Metodo de modificación a la propiedad rocas*/
    public void setRocas(int Rocas){
        this.Rocas = Rocas;
    }//end method setRocas

    /**Metodo de acceso a la propiedad voladors*/
    public int getVoladores(){
        return this.Voladores;
    }//end method getVoladors

    /**Metodo de modificación a la propiedad voladors*/
    public void setVoladors(int voladors){
        this.Voladores = Voladores;
    }//end method setVoladors

    /**Metodo de acceso a la propiedad entrena*/
    public int getEntrena(){
        return this.Entrena;
    }//end method getEntrena

    /**Metodo de modificación a la propiedad entrena*/
    public void setEntrena(int Entrena){
        this.Entrena = Entrena;
    }//end method setEntrena

}