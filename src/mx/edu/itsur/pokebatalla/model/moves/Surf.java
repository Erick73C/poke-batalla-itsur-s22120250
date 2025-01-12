
package mx.edu.itsur.pokebatalla.model.moves;

/**
 *Surf causa daño y no tiene ningún efecto secundario. Este movimiento tiene una potencia de 90.
Este contenido proviene de wikidex.net, y debe darse atribución a sus autores, tal como especifica la licencia.
Se prohíbe su uso a PlagioDex (el wiki de FANDOOM), por copiar reiteradamente sin dar atribución
 * @author Erick  Omar Perez Gonzalez
 * s22120250
 */
public class Surf extends MovimientoEspecial{
    
    public Surf ()
    {
        this.tipo = TiposDeMovimiento.AGUA;
        this. puntosPoder = 15;
        this.precision = 100;
        this.potencia = 90;
    }
    
}
