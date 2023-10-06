
package mx.edu.itsur.pokebatalla;

import mx.edu.itsur.pokebatalla.model.Dragonite;
import mx.edu.itsur.pokebatalla.model.Psyduck;
import mx.edu.itsur.pokebatalla.model.Mew;
//import mx.edu.itsur.pokebatalla.model.Bullbasaur;
import mx.edu.itsur.pokebatalla.model.Pikachu;
import mx.edu.itsur.pokebatalla.model.Charmander;

/**
 *
 * @author erick
 */
public class Main {

    public static void main(String[] args) {// TODO code application logic here
        System.out.println("Hello PokeBatalla!");
        
        Pikachu pikachuSalvaje = new Pikachu();
        Charmander charmanderSalvaje = new Charmander() ;
        
        pikachuSalvaje.setNombre("pedro");        
        Pikachu miPikachu = pikachuSalvaje;
        
        Psyduck patoamarillo = new  Psyduck ("Pato estresado");
        Psyduck patoamarillo1 = patoamarillo;
        
        Mew mew  = new Mew ("Mew");
        Dragonite gragon = new  Dragonite ("dragonite");
        
  
        

        //Separadores de batalla para no confundirse 
        System.out.println("---------------------------------------------------");
        miPikachu.atacar(charmanderSalvaje);
        System.out.println("---------------------------------------------------");
        patoamarillo1.atacar(patoamarillo, "Arañazo");
        System.out.println("---------------------------------------------------");
        miPikachu.atacar(charmanderSalvaje, "ATACKTRUENO");
        
        System.out.println("----------------------------------");
        mew.atacar(pikachuSalvaje);
        System.out.println("----------------------------------");
        patoamarillo.atacar(mew);
        System.out.println("----------------------------------");
        gragon.atacar(patoamarillo);
        System.out.println("----------------------------------");
        
    }
    
}
