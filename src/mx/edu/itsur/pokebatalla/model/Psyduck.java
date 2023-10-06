package mx.edu.itsur.pokebatalla.model;

import java.util.ArrayList;

/**
 *
 * @author erick s22120250
 */

public class Psyduck extends Pokemon  {    
    
    public Psyduck()
    {
        this.tipo = "Agua";
        this.ataque = 52;
        this.defensa = 48; 
        this.hp = 50; 
        this.precision = 5; 
        this.nivel =  1;
        this.habilidades = new ArrayList<>();
        this.habilidades.add("Arañazo");
        this.habilidades.add("Zona extraña");
     }
    
    public Psyduck  (String nombre)
    {
        this();
        this.nombre = nombre; 
    }
    
     public void atacar(Pokemon oponente, String habilidad){
       
        if(habilidad.equals("Arañazo")){
            
            System.out.println(this.nombre + " Uso Arañazo" + " Y ataco a: " + oponente );
        }else if(habilidad.equals("Zona extraña")){
            
            System.out.println(this.nombre +"Uso Zona extraña" + " Y ataco a: " + oponente);            
        }
        
    }
}