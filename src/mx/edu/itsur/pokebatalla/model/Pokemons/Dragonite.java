
package mx.edu.itsur.pokebatalla.model.Pokemons;

import mx.edu.itsur.pokebatalla.model.moves.Anulacion;
import mx.edu.itsur.pokebatalla.model.moves.AtaqueAereo;
import mx.edu.itsur.pokebatalla.model.moves.Hiperrayo;
import mx.edu.itsur.pokebatalla.model.moves.Movimiento;
/**
 * @author Erick  Omar Perez Gonzalez
 * s22120250
 */

public abstract  class Dragonite extends  Pokemon{
    
            public enum Movimientos {
                Anulacion, Hiperrayo,AtaqueAereo
            }
    
    
            public Dragonite   ()
            {
                this.tipo = "Dragon";
                this.hp = 91; 
                this.ataque = 134; 
                this.defensa = 95;
                this.precision = 3;
                this.nivel = 1; 
            }
            
            public Dragonite (String nombre)
            {
                this();
                this.nombre = nombre; 
            }
            
            public  void atacar (Pokemon oponente, Dragonite.Movimientos movimientoAUtilizar)
            {
                    Movimiento instanciaMovimiento;
                    switch (movimientoAUtilizar){
                        case Anulacion:
                         instanciaMovimiento = new Anulacion();
                         break;
                        case Hiperrayo: 
                            instanciaMovimiento = new Hiperrayo();
                         case AtaqueAereo: 
                             instanciaMovimiento = new AtaqueAereo();
                             break;
                            default:
                          throw new AssertionError();
                    }
              instanciaMovimiento.utilizar(this, oponente);
            }
            
            
}
