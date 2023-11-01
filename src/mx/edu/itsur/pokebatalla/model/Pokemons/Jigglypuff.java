package mx.edu.itsur.pokebatalla.model.Pokemons;

import mx.edu.itsur.pokebatalla.model.moves.BombaHuevo;
import mx.edu.itsur.pokebatalla.model.moves.Movimiento;

/**
 *
 * @author Erick  Omar Perez Gonzalez
 * s22120250
 */
public abstract  class Jigglypuff extends Pokemon{
    
    public enum Movimientos {
        BOMBA_HUEVO,
    }
    
    public void atacar(Pokemon oponente, Jigglypuff.Movimientos movimientoAUtilizar) {
        
        Movimiento instanciaMovimiento;
        
        switch (movimientoAUtilizar) {
            case BOMBA_HUEVO:
                instanciaMovimiento = new BombaHuevo();
                break;
            default:
                throw new AssertionError();
        }
        atacar(oponente, instanciaMovimiento);
    }
    /*
    @Override
    protected void atacar(Pokemon oponente, Movimiento move) {
        move.utilizar(this, oponente);
    }
    **/
}
