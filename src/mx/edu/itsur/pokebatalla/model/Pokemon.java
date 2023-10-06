package mx.edu.itsur.pokebatalla.model;
import java.util.List;
import java.util.Random;

/**
 *
 * @author erick s22120250
 */
public class Pokemon {

    //Atributos
    protected String tipo;
    protected String nombre;
    protected int nivel;
    protected int hp;
    protected int ataque;
    protected int defensa;
    protected double precision;
    protected List<String> habilidades;
    
    // Variables de formula de ataque de pokemon
    double Bonificacion = 1.5;
    
    
    double efectividad [] ={0.0, 0.25, 0.50, 1.00, 2.00, 4.00};
    Random efectividadd = new Random ();
    int valoresAleatoriosIndice = efectividadd.nextInt(efectividad.length);
    //Imprimir el valorAleatorio para que de un numero que esta en las posibilidades y implementarlo en la forma 
    double valorAleatorio =  efectividad [valoresAleatoriosIndice];
    
    int variacion [] = {85,86,87,88,89,90,91,92,93,94,95,96,97,98,99,100};

    //------------------------------------------------------------------------------
    Pokemon() {
    }

    //Setters
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    //Métodos
    public void atacar(Pokemon oponente) {
        
        System.out.println("Mi pokemon:" + this.nombre);
        System.out.println("esta atacando a: " + oponente);
        
        if (this.ataque > oponente.defensa) {
            //Calcular el daño
            
            
            //Modificar el da;ño con la formula de la wikidex
            int damage = this.ataque - oponente.defensa;
            
            
            
            
            //Restar el daño del HP del oponente
            oponente.hp = oponente.hp - damage;
            if(oponente.hp < 0)
            {
                System.out.println(oponente +" no puede continuar");
                //Agregar logica para que seleccione otro pokemon 
            }
            else if (oponente.hp >=0)
            {
            System.out.println("Y le causo un daño de: " + damage);    
            }
            
        }else{
           //TODO: ...Y si no que pasa?
        }
        System.out.println("El pokemon oponente quedo asi:" + oponente);

        
        
        //System.out.println("Pokemon Atacando a un: " + enemigo.getClass().getName());
        //TODO: Aqui va la logica para causar daño al enemigo.

    }

    @Override
    public String toString() {
           if(hp<0)
           {
        return this.getClass().getName() + "{tipo:" + tipo + " hp:" + "0" + "}";
           }
           else {
               
           
           return this.getClass().getName() + "{tipo:" + tipo + " hp:" + hp  + "}";
           }
    }

}
//multiplicar por .5