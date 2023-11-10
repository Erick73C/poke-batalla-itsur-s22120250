package mx.edu.itsur.pokebatalla.model.Pokemons;

import mx.edu.itsur.pokebatalla.model.moves.Destructor;
import mx.edu.itsur.pokebatalla.model.moves.Movimiento;
import mx.edu.itsur.pokebatalla.model.moves.Psicorrayo;
import mx.edu.itsur.pokebatalla.model.moves.Teletransporte;

/**
 * @author Erick Omar Perez Gonzalez s22120250
 */
public class Mew extends Pokemon {

    public enum Movimientos {
        Destructor,
        Psicorrayo,
        Teletransporte
    }

    public Mew() {
        this.tipo = "psiquico";
        this.ataque = 100;
        this.defensa = 100;
        this.hp = 100;
        this.nivel = 50;
        this.precision = 5;
        this.xp = 64;
    }

    public Mew(String nombre) {
        this();
        this.nombre = nombre;

    }

    @Override
    public Enum[] getMovimientos() {
        return Mew.Movimientos.values();
    }

    @Override
    public void atacar(Pokemon oponente, int ordinalMovimiento) {
        if (this.hp <= 0) {
            
            System.out.println("Mew. esta agotado y no puede realizar mas movimientos.");
            return;
        }

        Mew.Movimientos movimientoAUtilizar = Mew.Movimientos.values()[ordinalMovimiento];

        Movimiento instanciaMovimiento;
        switch (movimientoAUtilizar) {
            case Destructor:
                instanciaMovimiento = new Destructor();
                break;
            case Psicorrayo:
                instanciaMovimiento = new Psicorrayo();
                break;
            case Teletransporte:
                instanciaMovimiento = new Teletransporte();
                break;
            default:
                throw new AssertionError();
        }
        instanciaMovimiento.utilizar(this, oponente);
    }

}
