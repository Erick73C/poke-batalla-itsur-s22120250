package mx.edu.itsur.pokebatalla.model.Battles;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
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

    public Batalla(Entrenador entrenador1, Entrenador entrenador2) {
        this.entrenador1 = entrenador1;
        this.entrenador2 = entrenador2;
    }

    public void desarrollarBatalla() {
        System.out.println(" ******************************************************** LA BATTA  INICIO ********************************************************");
        System.out.println("LOS OPONENTES SON: ");
        System.out.println(entrenador1.getNombre() + "    <----------------V.S--------------->   " + entrenador2.getNombre());

        System.out.println("");

        eligirPokemon(entrenador1);
        eligirPokemon(entrenador2);

        while (!batallaFinalizada) {
            Entrenador entrenadorEnTurno = (turno == 1) ? entrenador1 : entrenador2;
            Entrenador oponente = (turno == 1) ? entrenador2 : entrenador1;

            System.out.println("Turno del entrenador: " + entrenadorEnTurno.getNombre());

            // Asegurarse de que el oponente tenga un Pokemon actual evitar errores
            if (oponente.getPokemonActual() == null) {
                System.out.println("No hay un Pokémon actualmente seleccionado para el oponente");
                return;
            }
            seleccionarAtaque(entrenadorEnTurno, oponente.getPokemonActual());
            if (entrenadorEnTurno.getPokemonActual() == null || entrenadorEnTurno.getPokemonActual().gethp() <= 0) {
                cambiarPokemon(entrenadorEnTurno);
            }

            Pokemon pokemonEnTurno = entrenadorEnTurno.getPokemonActual();

            if (oponente.estaDerrotado()) {
                System.out.println("¡El entrenador " + oponente.getNombre() + " ha sido derrotado!");
                System.out.println(" <-------------------*****LA BATALLA A FINALIZADO  *****------------------->");
                batallaFinalizada = true;
            } else {
                // Cambiar el turno
                turno = (turno == 1) ? 2 : 1;
            }
        }
    }

    private void eligirPokemon(Entrenador entrenadorEnturno) {
        int idx = 1;
        System.out.println("████████████████████████████████████████████");
        for (Pokemon pokemon : entrenadorEnturno.getPokemonsCapturados()) {
            System.out.println(idx + ".- " + pokemon.getClass().getSimpleName() + " HP: " + pokemon.gethp());
            idx++;
            System.out.println("████████████████████████████████████████████");
        }
        System.out.println("");
        System.out.println("Elige un  pokemon " + entrenadorEnturno.getNombre());

        char auxLectura = '0';

        try {
            auxLectura = (char) System.in.read();
            System.in.read((new byte[System.in.available()]));
        } catch (Exception ex) {
            ex.printStackTrace();
        }

        Pokemon pokemonSeleccionado = entrenadorEnturno.getPokemonsCapturados()
                .get(Character.getNumericValue(auxLectura) - 1);
        entrenadorEnturno.setPokemonActual(pokemonSeleccionado);
    }

    //****************************Metodo para atacar****************************
    private void seleccionarAtaque(Entrenador entrenadorEnturno, Pokemon oponente) {

        Pokemon pokemonActual = entrenadorEnturno.getPokemonActual();

        System.out.println("-----------------------------------------------------");
        System.out.println("Seleccione un ataque para " + pokemonActual.getClass().getSimpleName() + " Con una vida actual de " + pokemonActual.gethp());
        System.out.println("Defensa de: " + pokemonActual.getDefensa());
        System.out.println("Y un nivel de: " + pokemonActual.getNivel());
        System.out.println("");

        int idx = 1;

        for (Enum movimiento : pokemonActual.getMovimientos()) {
            System.out.println(idx + ".- " + movimiento);
            idx++;
        }
        System.out.println("-----------------------------------------------------");

        int opcionAtaque = -1;
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            opcionAtaque = Integer.parseInt(br.readLine());
        } catch (IOException | NumberFormatException ex) {
            System.out.println("Por favor, ingrese un número válido.");
            return;
        }

        if (opcionAtaque < 1 || opcionAtaque > pokemonActual.getMovimientos().length) {
            System.out.println("La opción de ataque no es válida.");
            return;
        }

        //llamar al metodo instruirMovimientoAlPokemonActual
        entrenadorEnturno.instruirMovimientoAlPokemonActual(oponente, opcionAtaque - 1);
    }

    ///Cambiar pokemon
    private void cambiarPokemon(Entrenador entrenador) {
        System.out.println("¿Deseas cambiar de Pokémon? (S/N)");

        char respuesta = 'N';

        try {
            respuesta = (char) System.in.read();
            System.in.read((new byte[System.in.available()]));
        } catch (IOException ex) {
            ex.printStackTrace();
        }

        if (respuesta == 'S' || respuesta == 's') {

            System.out.println("Pokémon disponibles:");
            int idx = 1;
            for (Pokemon pokemon : entrenador.getPokemonsCapturados()) {
                System.out.println(idx + ".- " + pokemon.getClass().getSimpleName());
                idx++;
            }

            // Elegir  un nuevo pokemon de ka lista 
            System.out.println("Elige un nuevo Pokémon:");

            char auxLectura = '0';

            try {
                auxLectura = (char) System.in.read();
                System.in.read((new byte[System.in.available()]));
            } catch (IOException ex) {
                ex.printStackTrace();
            }

            Pokemon nuevoPokemon = entrenador.getPokemonsCapturados().get(Character.getNumericValue(auxLectura) - 1);
            entrenador.setPokemonActual(nuevoPokemon);

            System.out.println("Has cambiado a " + nuevoPokemon.getClass().getSimpleName() + " en tu equipo.");
            
        }
    }
}
