
package mx.edu.itsur.pokebatalla.model.moves;

/**
 *Destructor causa daño y no tiene ningún efecto secundario.
Este contenido proviene de wikidex.net, y debe darse atribución a sus autores, tal como especifica la licencia.
Se prohíbe su uso a PlagioDex (el wiki de FANDOOM), por copiar reiteradamente sin dar atribución
 * @author Erick  Omar Perez Gonzalez
 * s22120250
 */
public class Destructor extends MovimientoFisico {
    public Destructor ()
    {
        this.tipo = TiposDeMovimiento.NORMAL;
        this.puntosPoder = 35;
        this.precision = 100;
        this.potencia = 40;
    }
}
