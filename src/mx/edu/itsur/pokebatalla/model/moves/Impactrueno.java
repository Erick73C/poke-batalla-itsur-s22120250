
package mx.edu.itsur.pokebatalla.model.moves;

/**
 *
 * @author erick
 */
public class Impactrueno extends MovimientoEspecial {
    public Impactrueno() {
        this.tipo = TiposDeMovimiento.ELECTRICO;
        this.potencia = 40;
        this.precision = 100;
        this.puntosPoder = 30;
    }
}

