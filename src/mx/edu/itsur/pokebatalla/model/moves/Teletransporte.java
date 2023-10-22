package mx.edu.itsur.pokebatalla.model.moves;

/**
 *Teletransporte permite huir de combates individuales contra Pokémon salvajes, en otras circunstancias el movimiento fallará. El movimiento también falla si el usuario se encuentra atrapado por movimientos o habilidades que impiden escapar, como bloqueo, acoso o sombra trampa.
Este contenido proviene de wikidex.net, y debe darse atribución a sus autores, tal como especifica la licencia.
Se prohíbe su uso a PlagioDex (el wiki de FANDOOM), por copiar reiteradamente sin dar atribución
* 
 * @author erick s22120250
 */
public class Teletransporte extends MovimientoEstado{
    
    public Teletransporte ()
    {
        this.tipo = TiposDeMovimiento.PSIQUICO;
        this.puntosPoder = 20;
        this.precision = 100;
        this.potencia = 0;
    }
    
}
