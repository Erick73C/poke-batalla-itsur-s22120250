package mx.edu.itsur.pokebatalla.model.Pokemons;

import mx.edu.itsur.pokebatalla.model.moves.BombaHuevo;
import mx.edu.itsur.pokebatalla.model.moves.Movimiento;

/**
 *
 * @author Erick Omar Perez Gonzalez s22120250
 */
public class Jigglypuff extends Pokemon {

    public enum Movimientos {
        BOMBA_HUEVO,
    }

    @Override
    public Enum[] getMovimientos() {
        return Jigglypuff.Movimientos.values();
    }

    @Override
    public void atacar(Pokemon oponente, int ordinalMovimiento) {

        if (this.hp <= 0) {
            System.out.println("Jigglypuff. esta agotado y no puede realizar mas movimientos.");
            return;
        }

        Jigglypuff.Movimientos movimientoAUtilizar = Jigglypuff.Movimientos.values()[ordinalMovimiento];
        Movimiento instanciaMovimiento;

        switch (movimientoAUtilizar) {
            case BOMBA_HUEVO:
                instanciaMovimiento = new BombaHuevo();
                break;
            default:
                throw new AssertionError();
        }
        instanciaMovimiento.utilizar(this, oponente);
    }
    /*
    @Override
    protected void atacar(Pokemon oponente, Movimiento move) {
        move.utilizar(this, oponente);
    }
    **/
}
