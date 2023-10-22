
package mx.edu.itsur.pokebatalla.model.moves;

/**
 *Refugio aumenta en un nivel la defensa del usuario.
Este contenido proviene de wikidex.net, y debe darse atribución a sus autores, tal como especifica la licencia.
Se prohíbe su uso a PlagioDex (el wiki de FANDOOM), por copiar reiteradamente sin dar atribución
* 
 * @author erick s22120250
 */
public class Refugio extends MovimientoEstado{
    
    public Refugio()
    {
        this.tipo = TiposDeMovimiento.AGUA;
        this.puntosPoder = 40;
        this.potencia = 0;
        this.precision = 100;
        
    }
    
}
