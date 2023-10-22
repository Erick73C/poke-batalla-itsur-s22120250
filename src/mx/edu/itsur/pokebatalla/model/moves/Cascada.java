
package mx.edu.itsur.pokebatalla.model.moves;

/**
 *Cascada causa daño y no tiene ningún efecto secundario.
Este contenido proviene de wikidex.net, y debe darse atribución a sus autores, tal como especifica la licencia.
Se prohíbe su uso a PlagioDex (el wiki de FANDOOM), por copiar reiteradamente sin dar atribución
* 
 * @author erick s22120250
 */
public class Cascada extends MovimientoFisico{
    public Cascada ()
    {
        this.tipo = TiposDeMovimiento.AGUA;
        this.puntosPoder = 15;
        this.precision = 100;
        this.potencia = 80;
    }
}
