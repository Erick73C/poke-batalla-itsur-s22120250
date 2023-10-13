
package mx.edu.itsur.pokebatalla.Moves;

import mx.edu.itsur.pokebatalla.Pokemons.Pokemon;
/**
 *
 * @author erick
 */
public class Habilidades {
    
    enum TiposDemovimiento
    {
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
    }
    
    protected TiposDemovimiento tipo;
    
    //protected  String tipo;
    protected  String clase;
    protected  int potencia;
    protected  int precision;
    protected  int puntosPoder;
    
    public void  utilizar (Pokemon oponente, Pokemon objetivo )
    {
        
    }
}
