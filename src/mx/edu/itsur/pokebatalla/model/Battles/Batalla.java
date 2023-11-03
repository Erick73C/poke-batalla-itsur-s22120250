package mx.edu.itsur.pokebatalla.model.Battles;

/**
*  
* @author Erick  Omar Perez Gonzalez
 * s22120250
 */
public class Batalla {
     protected Entrenador entrenador1;
    protected Entrenador entrenador2;
    protected int turno = 1;
    protected boolean batallaFinalizada = false;

    //Constructor
    public Batalla(Entrenador entrenador1, Entrenador entrenador2) {
        this.entrenador1 = entrenador1;
        this.entrenador2 = entrenador2;
    }    

    //Metodos
    public void desarrollarBatalla(){
        //1. El entrenador en turno indica el pokemon a utilizar.
        //2. El entrenador en turno indica el ataque a utilizar.
        //3. El pokemon realiza el ataque.
        //4. Revisar si ya terminó la batalla 
        //     (Todos los pokemons del oponente quedan inhabilitados) 
        //5. Se cambia el turno y repite.

    }
}