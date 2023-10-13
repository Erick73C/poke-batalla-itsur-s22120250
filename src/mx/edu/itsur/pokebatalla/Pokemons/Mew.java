
package mx.edu.itsur.pokebatalla.Pokemons;

import java.util.ArrayList;

/**
 *
 * @author erick s22120250
 */
public class Mew  extends Pokemon {
    
    public Mew ()
    {
        this.tipo = "psiquico";
        this.ataque = 100; 
        this.defensa = 100; 
        this.hp = 100; 
        this.nivel = 50; 
        this.precision = 5; 
        this.habilidades = new ArrayList<>();
        this.habilidades.add("Cabezazo zen");
        this.habilidades.add("Cuchilla solar");
        
    }
    
    public Mew (String nombre)
    {
        this();
        this.nombre = nombre; 
        
    }
    
    public void atacar(Pokemon oponente, String habilidad)
    {
        if (habilidad.equals("Cabezazo zen"))
                {
                    System.out.println(this.nombre + "Cabezazo zen" + " y ataco a: " + oponente);
                }
        else if(habilidad.equals("Cuchilla solar"))
        {
            System.out.println(this.nombre + "Cuchilla solar" + " y ataco a: " + oponente);
        }
    }
    
}
