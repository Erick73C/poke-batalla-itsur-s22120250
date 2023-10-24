
package mx.edu.itsur.pokebatalla.model.moves;

/**
 *Hiperrayo causa daño y no tiene ningún efecto secundario. El usuario descansará el segundo turno, durante el cual no se podrán ejecutar movimientos, usar objetos o cambiar de Pokémon. Si el movimiento falla no se deberá recargar.
Este contenido proviene de wikidex.net, y debe darse atribución a sus autores, tal como especifica la licencia.
Se prohíbe su uso a PlagioDex (el wiki de FANDOOM), por copiar reiteradamente sin dar atribución
 * @author Erick  Omar Perez Gonzalez
 * s22120250
 */
public class Hiperrayo  extends MovimientoEspecial{
    public Hiperrayo ()
    {
        this.tipo = TiposDeMovimiento.NORMAL;
        this.puntosPoder = 5;
        this.precision = 90;
        this.potencia = 150;
    }
}
