
package mx.edu.itsur.pokebatalla.Pokemons;

/**
 *
 * @author FJML1983
 */
public class Charmander extends Pokemon {
    public Charmander(){
        tipo = "FUEGO";
        hp = 39;
        ataque = 52;
        defensa = 43;
        nivel = 1;
        precision = 4;
    }
    
    //Constructor alterno 1
    public Charmander(String nombre){
        this(); //invocando al constructor default
        this.nombre = nombre;
    }
    
}
