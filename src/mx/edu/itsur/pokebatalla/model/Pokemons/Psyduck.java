package mx.edu.itsur.pokebatalla.model.Pokemons;

import mx.edu.itsur.pokebatalla.model.moves.Refugio;
import mx.edu.itsur.pokebatalla.model.moves.Surf;
import mx.edu.itsur.pokebatalla.model.moves.Cascada;
/**
 *
 * @author erick s22120250
 */

public class Psyduck extends Pokemon  {    
    
    
    public enum Movimientos {
        Refugio,
        Surf,
        Cascada
    }
    
    
    public Psyduck()
    {
        this.tipo = "Agua";
        this.ataque = 52;
        this.defensa = 48; 
        this.hp = 50; 
        this.precision = 5; 
        this.nivel =  1;
     }
    
    public Psyduck  (String nombre)
    {
        this();
        this.nombre = nombre; 
    }
    
    
        public  void atacar (Pokemon oponente, Psyduck.Movimientos movimientoAUtilizar)
    {
         mx.edu.itsur.pokebatalla.model.moves.Movimiento instanciaMovimiento;
         switch (movimientoAUtilizar) {
            case Refugio:
                instanciaMovimiento = new Refugio();
                break;
            case Cascada:
                instanciaMovimiento = new Cascada();
                break;
            case Surf:
                instanciaMovimiento = new Surf();
                break;
            default:
                throw new AssertionError();
                
        }
         instanciaMovimiento.utilizar(this, oponente);
    }
  
}