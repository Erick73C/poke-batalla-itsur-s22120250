package mx.edu.itsur.pokebatalla.model.moves;

/**
 *Psicorrayo causa daño y tiene una probabilidad del 10% de confundir al objetivo.
Este contenido proviene de wikidex.net, y debe darse atribución a sus autores, tal como especifica la licencia.
Se prohíbe su uso a PlagioDex (el wiki de FANDOOM), por copiar reiteradamente sin dar atribución
* 
 * @author erick s22120250
 */
public class Psicorrayo extends MovimientoEspecial{
    
    public Psicorrayo ()
    {
        this.tipo = TiposDeMovimiento.PSIQUICO;
        this.puntosPoder = 20;
        this.precision = 100;
        this.potencia = 65;
    }
}
