
package mx.edu.itsur.pokebatalla.model.moves;

/**
 * @author Erick  Omar Perez Gonzalez
 * s22120250
 */
public class Impactrueno extends MovimientoEspecial {
    public Impactrueno() {
        this.tipo = TiposDeMovimiento.ELECTRICO;
        this.potencia = 40;
        this.precision = 100;
        this.puntosPoder = 30;
    }
}

