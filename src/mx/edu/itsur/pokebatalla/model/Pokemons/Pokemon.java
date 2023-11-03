package mx.edu.itsur.pokebatalla.model.Pokemons;
import java.util.List;
import java.util.Random;
import mx.edu.itsur.pokebatalla.model.moves.Movimiento;

/**
 *
 * @author Erick  Omar Perez Gonzalez
 * s22120250
 */
public abstract  class Pokemon {

    //Atributos
    protected String tipo;
    protected String nombre;
    protected int nivel;
    protected int hp;
    protected int ataque;
    protected int defensa;
    protected double precision;
    protected int xp;
            
   
    /**
     * Formula de ataque de pokemon incluyendo  variables aleatorias 
    // Variables de formula de ataque de pokemon
    double Bonificacion = 1.5;
    
    
    double efectividad [] ={0.0, 0.25, 0.50, 1.00, 2.00, 4.00};
    Random efectividadd = new Random ();
    int valoresAleatoriosIndice = efectividadd.nextInt(efectividad.length);
    //Imprimir el valorAleatorio para que de un numero que esta en las posibilidades y implementarlo en la forma 
    double valorAleatorio =  efectividad [valoresAleatoriosIndice];
    
    int variacion [] = {85,86,87,88,89,90,91,92,93,94,95,96,97,98,99,100};
    Random variacionn = new Random ();
    int variacionAleatoria = variacionn.nextInt(variacion.length);
    * --------------------------------------------------------------------------
    * 
    * */

    Pokemon() {
        
    }

 
     public int getNivel() {
        return nivel;
    }
    public int getAtaque() {
        return ataque;
    }    
    public int getDefensa(){
        return defensa;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void recibirDanio(int danio){
        this.hp = this.hp - danio;
         if ( this.hp<= 0 )
        {
            System.out.println(this.getClass().getSimpleName() + " YA NO PUEDE CONTINUAR") ;
        }
    }
    /**
    public void gethp (int hp)
    {
        this.hp = this.hp;
    }
    **/
    protected abstract void atacar(Pokemon oponente, Movimiento move );
    
    @Override
    public String toString() {
           if(hp<0)
           {
        return this.getClass().getSimpleName()+ "{tipo:" + tipo + " hp:" + "0" + "}";
           }
           else {
               
           
           return this.getClass().getSimpleName() + "{tipo:" + tipo + " hp:" + hp  + "}";
           }
    }

}