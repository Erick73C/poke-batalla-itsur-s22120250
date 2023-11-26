package mx.edu.itsur.pokebatalla.model.Pokemons;

import java.io.Serializable;
import mx.edu.itsur.pokebatalla.model.moves.Movimiento;
import mx.edu.itsur.pokebatalla.model.moves.AtaqueRapido;

/**
 * @author Erick Omar Perez Gonzalez s22120250
 */
public class Charmander extends Pokemon  implements  Serializable{

    public enum Movimientos {
        ATAQUE_RAPIDO,
    }

    public Charmander() {
        tipo = "FUEGO";
        hp = 39;
        ataque = 52;
        defensa = 43;
        nivel = 1;
        precision = 4;
        xp = 64;
    }

    //Constructor alterno 1
    public Charmander(String nombre) {
        this(); //invocando al constructor default
        this.nombre = nombre;
    }

    //METODOS 
    @Override
    public Enum[] getMovimientos() {
        return Charmander.Movimientos.values();
    }

    @Override
    public void atacar(Pokemon oponente, int ordinalMovimiento) {

        if (this.hp <= 0) {
            System.out.println("Charmander. esta agotado y no puede realizar mas movimientos.");
            return;
        }

        Charmander.Movimientos movimientoAUtilizar = Charmander.Movimientos.values()[ordinalMovimiento];

        //Instanciar el movimiento solicitado
        Movimiento instanciaMovimiento;
        switch (movimientoAUtilizar) {
            case ATAQUE_RAPIDO:
                instanciaMovimiento = new AtaqueRapido();
                break;
            default:
                throw new AssertionError();
        }

        instanciaMovimiento.utilizar(this, oponente);

    }

}