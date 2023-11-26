package mx.edu.itsur.pokebatalla.model.Pokemons;

import java.io.IOException;
import java.io.Serializable;
import mx.edu.itsur.pokebatalla.model.Battles.Batalla;
import mx.edu.itsur.pokebatalla.model.Battles.Entrenador;
import mx.edu.itsur.pokebatalla.model.ControlArchivos.FileManager;

/**
 *
 *  * @author Erick Omar Perez Gonzalez s22120250
 */
public class Main /*extends JFrame implements Runnable */ implements Serializable {

    public static void main(String[] args) {

        Batalla x = FileManager.leerPartida();

        if (x == null) {
            Pikachu a = new Pikachu("pepe");
            Dragonite b = new Dragonite("luis");
            Psyduck c = new Psyduck("Pato estresado");
            Charmander e = new Charmander("Dragon rojo");

            Entrenador en1 = new Entrenador("Sergio");
            en1.capturarPokemon(a);
            en1.capturarPokemon(e);

            Entrenador en2 = new Entrenador("Evelyn");
            en2.capturarPokemon(b);
            en2.capturarPokemon(c);

            x = new Batalla(en1, en2);
        }
        x.desarrollarBatalla();

        if (x.hayGanador()) {
            System.out.println("¿Desea iniciar una nueva partida? (S/N)");

            char respuesta = 'N';
            try {
                respuesta = (char) System.in.read();
                System.in.read((new byte[System.in.available()]));
            } catch (IOException ex) {
                System.out.println("Error al leer la respuesta. Intenta de nuevo.");
                ex.printStackTrace();
            }

            if (respuesta == 'S' || respuesta == 's') {
                // Borra el archivo de la partida guardada
                FileManager.borrarPartida();
                //Pokemons 
                Mew d = new Mew("Mew");
                Jigglypuff e = new Jigglypuff("Jely");
                Pikachu n = new Pikachu("PITP");
                Bullbasaur l = new Bullbasaur("Frog");
                
                Entrenador nuevoEntrenador1 = new Entrenador("Erick");
                nuevoEntrenador1.capturarPokemon(d);
                nuevoEntrenador1.capturarPokemon(e);
                
                Entrenador nuevoEntrenador2 = new Entrenador("Dennise");
                nuevoEntrenador2.capturarPokemon(l);
                nuevoEntrenador2.capturarPokemon(n);
                

                Batalla nuevaBatalla = new Batalla(nuevoEntrenador1, nuevoEntrenador2);
                nuevaBatalla.desarrollarBatalla();
            }
        }
    }
}
