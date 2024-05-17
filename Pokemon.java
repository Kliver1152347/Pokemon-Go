
public class Pokemon extends Pokedex
{
    String Nombre;
    String Tipo;
    
    
    public Pokemon()
    {
      
    }

    //metodos
    
    public void MostrarPokemon()
    {
      System.out.println ("El pokemos es:"+Nombre + "Y es de tipo: " + Tipo );
    }
    
    /**Metodo de acceso a la propiedad nombre*/
    public String getNombre(){
        return this.Nombre;
    }//end method getNombre

    /**Metodo de modificación a la propiedad nombre*/
    public void setNombre(String nombre){
        this.Nombre = Nombre;
    }//end method setNombre

    /**Metodo de acceso a la propiedad tipo*/
    public String getTipo(){
        return this.Tipo;
    }//end method getTipo

    /**Metodo de modificación a la propiedad tipo*/
    public void setTipo(String tipo){
        this.Tipo = Tipo;
    }//end method setTipo

}