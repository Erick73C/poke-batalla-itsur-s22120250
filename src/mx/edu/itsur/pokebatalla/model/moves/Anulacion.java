package mx.edu.itsur.pokebatalla.model.moves;

/**
 *Anulación elige al azar un movimiento que conozca el objetivo, cuyos PP sean mayores de 0 y lo anula, impidiendo usarlo de 1 a 8 turnos.
Este contenido proviene de wikidex.net, y debe darse atribución a sus autores, tal como especifica la licencia.
Se prohíbe su uso a PlagioDex (el wiki de FANDOOM), por copiar reiteradamente sin dar atribución
 * @author Erick  Omar Perez Gonzalez
 * s22120250
 */
public class Anulacion  extends MovimientoEstado{
    
    
    public Anulacion()
    {
        this.tipo = TiposDeMovimiento.NORMAL;
        this.puntosPoder = 20;
        this.precision = 100;
        this.potencia = 0;
    }
    
}
