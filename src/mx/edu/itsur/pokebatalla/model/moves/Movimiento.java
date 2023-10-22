package mx.edu.itsur.pokebatalla.model.moves;
import mx.edu.itsur.pokebatalla. model.Pokemons.Pokemon;

/**
 * Esta clase representa nn movimiento o ataque 
 * (Move en inglés; わざ Movimiento en japonés) 
 * es una técnica que los Pokémon son capaces de aprender 
 * y que usan en los combates con el fin de debilitar a sus oponentes.
 * https://www.wikidex.net/wiki/Movimiento
 * 
 * @author erick
 */
public class Movimiento {

    enum TiposDeMovimiento {
        AGUA,
        BICHO,
        DRAGON,
        ELECTRICO,
        FANTASMA,
        FUEGO,
        HIELO,
        LUCHA,
        NORMAL,
        PLANTA,
        PSIQUICO,
        ROCA,
        SINIESTRO,
        TIERRA,
        VENENO,
        VOLADOR   
    }

   
    protected TiposDeMovimiento tipo;
    protected int potencia;
    protected int precision;
    protected int puntosPoder;
    
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

  
    public void utilizar(Pokemon usuario, Pokemon objetivo) {
       
        int nivelAtacante = usuario.getNivel();
        int ataqueAtacante = usuario.getAtaque();
        int poderMovimiento = this.puntosPoder; 
        int defensaObjetivo = objetivo.getDefensa();
        double modificador = 1.0; 
           
        
        int danio = (int) (((
                ((2 * nivelAtacante / 5 + 2) 
                        * ataqueAtacante 
                        * poderMovimiento / defensaObjetivo) 
                  / 50) + 2) * modificador);
        
        objetivo.recibirDanio(danio); 

       
        System.out.println(
                         usuario.getClass().getSimpleName() + " aplica " + 
                         this.getClass().getSimpleName() + " a " +  
                         objetivo.getClass().getSimpleName() + " y causa danio de " +
                         danio);
        System.out.println("El objetivo quedo asi: " + objetivo);       
    }            
    
    
    
}    