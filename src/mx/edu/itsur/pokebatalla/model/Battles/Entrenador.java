package mx.edu.itsur.pokebatalla.model.Battles;

import java.util.List;
import mx.edu.itsur.pokebatalla.model.Pokemons.Pokemon;

/**
 *
 * @author Erick  Omar Perez Gonzalez
 * s22120250
 */
public class Entrenador {
    
    protected List<Pokemon> pokemonsCapturados;

    
    public void capturarPokemon(Pokemon pk){
        pokemonsCapturados.add(pk);
    }
}
