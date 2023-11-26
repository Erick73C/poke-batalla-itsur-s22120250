package mx.edu.itsur.pokebatalla.model.Pokemons;

import java.io.Serializable;
import mx.edu.itsur.pokebatalla.model.moves.BombaHuevo;
import mx.edu.itsur.pokebatalla.model.moves.Movimiento;

/**
 *
 * @author Erick Omar Perez Gonzalez s22120250
 */
public class Jigglypuff extends Pokemon implements Serializable{

    public enum Movimientos {
        BOMBA_HUEVO,
    }
    
    public Jigglypuff() {
        this.tipo = "Normal";
        this.ataque = 62;
        this.defensa = 48;
        this.hp = 70;
        this.precision = 3;
        this.nivel = 1;
        this.xp = 64;
    }
    
    public Jigglypuff(String nombre) {
        this();
        this.nombre = nombre;
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
