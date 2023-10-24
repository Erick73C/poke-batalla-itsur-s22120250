package mx.edu.itsur.pokebatalla.model.moves;

/**
 *Es un movimiento de tipo volador
 *  * @author Erick  Omar Perez Gonzalez
 * s22120250
 */
public class AtaqueAereo extends MovimientoFisico{
    public AtaqueAereo ()
    {
        this.tipo = TiposDeMovimiento.VOLADOR;
        this.puntosPoder = 5;
        this.precision = 90;
        this.potencia = 140;
    }
}
