package mx.edu.itsur.pokebatalla.model.Pokemons;

import java.io.Serializable;

/**
 *
 * @author Erick Omar Perez Gonzalez s22120250
 */
public abstract class Pokemon implements Serializable{

    //Atributos
    protected String tipo;
    protected String nombre;
    protected int nivel;
    protected int  hp;
    protected int ataque;
    protected int defensa;
    protected double precision;
    protected int xp;

    Pokemon() {

    }

    public int getNivel() {
        return nivel;
    }

    public int gethp() {
        return hp;
    }

    public int getAtaque() {
        return ataque;
    }

    public int getDefensa() {
        return defensa;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void recibirDanio(int danio) {
        /*
        *IMPLEMENTAR PROXIMAMENTEs
        double Bonificacion = 1.5;
        //Efectividad
        double efectividad[] = {0.0, 0.25, 0.50, 1.00, 2.00, 4.00};
        Random efectividadd = new Random();
        int valoresAleatoriosIndice = efectividadd.nextInt(efectividad.length);
        double valorAleatorio = efectividad[valoresAleatoriosIndice];
        //Variacion
        int variacion[] = {85, 86, 87, 88, 89, 90, 91, 92, 93, 94, 95, 96, 97, 98, 99, 100};
        Random variacionn = new Random();
        int variacionAleatoria = variacionn.nextInt(variacion.length);

        //
        double E = valorAleatorio;
        double V = variacionAleatoria;
        double B = 1.5;
        double D = getDefensa();
        int N = getNivel();
        int P = m.getpotencia(defensa);
        int A = getAtaque();
        
        
        this.hp =  0.01 * B * E *V * (  ((((0.2*N) +1 ) *A* P) / 25*D) + 2   );
*/
        this.hp = this.hp - danio;

        if (this.hp <= 0) {
            System.out.println(this.getClass().getSimpleName() + " YA NO PUEDE CONTINUAR");
        }
    }

    //Metodos abstractos
    public abstract void atacar(Pokemon oponente, int ordinalMovimiento);

    public abstract Enum[] getMovimientos();

    @Override
    public String toString() {
        if (hp < 0) {
            return this.getClass().getSimpleName() + "{tipo:" + tipo + " hp:" + "0" + "}";
        } else {

            return this.getClass().getSimpleName() + "{tipo:" + tipo + " hp:" + hp + "}";
        }
    }

}
