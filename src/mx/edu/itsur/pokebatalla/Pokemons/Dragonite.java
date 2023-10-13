
package mx.edu.itsur.pokebatalla.Pokemons;

import java.util.ArrayList;

/**
 *
 * @author erick
 */

public class Dragonite extends  Pokemon{
            public Dragonite   ()
            {
                this.tipo = "Dragon";
                this.hp = 91; 
                this.ataque = 134; 
                this.defensa = 95;
                this.precision = 3;
                this.nivel = 1; 
                this.habilidades = new ArrayList<>();
                this.habilidades.add ("Garra dragón");
                this.habilidades.add("Golpe aéreo");
            }
            
            public Dragonite (String nombre)
            {
                this();
                this.nombre = nombre; 
            }
            
            public void atacar (Pokemon oponente, String habilidad)
            {
                
                if (habilidad.equals("Golpe aéreo"))
                {
                    System.out.println(this.nombre + "Golpe aéreo" + " y ataco a: " + oponente);
                }
                else if (habilidad.equals("Garra dragón"))
                {
                    System.out.println(this.nombre + "Uso Garra dragón" + " y ataco a: " + oponente);
                }
            }
}
