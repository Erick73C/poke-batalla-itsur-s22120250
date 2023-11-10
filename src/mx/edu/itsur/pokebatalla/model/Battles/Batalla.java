package mx.edu.itsur.pokebatalla.model.Battles;

import mx.edu.itsur.pokebatalla.model.Pokemons.Pokemon;

/**
 *
 * @author Erick Omar Perez Gonzalez s22120250
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
    public void desarrollarBatalla(int ordinalMovimiento) {
        //1. El entrenador en turno indica el pokemon a utilizar.
        //2. El entrenador en turno indica el ataque a utilizar.
        //3. El pokemon realiza el ataque.
        //4. Revisar si ya terminó la batalla 
        //     (Todos los pokemons del oponente quedan inhabilitados) 
        //5. Se cambia el turno y repite.

        while (!batallaFinalizada) {

            Entrenador entrenadorEnTurno = (turno == 1) ? entrenador1 : entrenador2;
            Entrenador oponente = (turno == 1) ? entrenador2 : entrenador1;

            System.out.println("Turno del entrenador: " + entrenadorEnTurno.getNombre());

            // Entrenador 1 elige pokemon
            seleccionarPokemon(entrenadorEnTurno);

            // Entrenador 2 elige pokemon
            seleccionarAtaque(entrenadorEnTurno);

            // El Pokemon  En Turno en turno realiza el ataque
            Pokemon pokemonEnTurno = entrenadorEnTurno.getPokemonActual();

            pokemonEnTurno.atacar(oponente.getPokemonActual(), ordinalMovimiento);

            // 4. Revisar si la batalla ha terminado (verifica si el oponente está derrotado)
            if (oponente.estaDerrotado(0)) {
                System.out.println("¡El entrenador " + oponente.getNombre() + " ha sido derrotado!");
                batallaFinalizada = true;
            } else {
                // 5. Cambiar el turno
                turno = (turno == 1) ? 2 : 1;
            }
        }
    }

    public void seleccionarPokemon(Entrenador entrenadorEnTurno) {

    }

    public void seleccionarAtaque(Entrenador entrenadorEnturno) {

    }

}
