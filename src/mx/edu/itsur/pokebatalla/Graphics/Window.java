
package mx.edu.itsur.pokebatalla.Graphics;
import java.awt.Canvas;
import java.awt.Color;


import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.image.BufferStrategy;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import static javax.swing.JFrame.EXIT_ON_CLOSE;


public class Window extends JFrame implements Runnable {
    private Canvas canvas;
    
    private Thread theread;
    public static final int WIDTH = 1250, HEIGHT =900; 
    private boolean Runing = false ;
    
    
    
    private BufferStrategy bs;
    private Graphics G;
    
    
    private final int FPS = 120;
    //Tiempo de FPS medido en nano segundos, para mejor estabilidad en FPS en el juego
    private double Targettime = 1000000000/FPS;  
    //CAMBIO RESPECTO A UNA CANTIDAD = DELTA; 
    private double delta = 0; 
    private int PromedioFPS = FPS;
    
    public Window()
    {
        setTitle("Pokebattel");
        setSize(WIDTH, HEIGHT);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setResizable(false );
        setLocationRelativeTo(null);
        
        setVisible(true);
        
        canvas = new Canvas ();
        
        canvas.setPreferredSize(new Dimension(WIDTH, HEIGHT));
        canvas.setMaximumSize(new Dimension(WIDTH, HEIGHT));
        canvas.setMinimumSize(new Dimension(WIDTH, HEIGHT));
        canvas.setFocusable(true);
        
        
        add (canvas);
    }
    
    public  static void main (String[] args)
    {
        new Window().Start();
    }
    
    
   
    int  x= 0; 
    
    private void Update ()
    {
        x++;
        
        
    }
    
    private void Draw()
    {
        bs = canvas.getBufferStrategy();
        
        if(bs == null)
        {
            canvas.createBufferStrategy(3);
            return; 
        }
        
        G = bs.getDrawGraphics();
        //---------Empiesa a dibujar ---------------
        
        G.clearRect(0, 0, WIDTH, HEIGHT);
        
        G.setColor(Color.BLACK);
        G.drawString("" + PromedioFPS, 1200, 10);
        G.clearRect(20, 20, 70, 70);
        
        //---------Termina de dibujar---------------
        G.dispose();
        bs.show();
    }
    
    @Override
    public void run() {
        //tiempotranscurruido 
        long now; 
        long lastTime = System.nanoTime();
        
        int frames = 0;
        long time = 0;
        
        
        while(Runing)
        {
            
            now = System.nanoTime();
            //Obtener el tiempo transCorrido
            delta += (now- lastTime)/ Targettime;
            
            time += (now - lastTime);
            lastTime = now;
            
            
            if(delta>=1)
            {
                Update();
                Draw();
                delta--;
                frames++;
                //System.out.println(frames);
            }
            if (time >=1000000000)
            {
               PromedioFPS = frames;
                frames= 0;
                time = 0;
            }
                
                    
        }
        
        Stop();
    }

    
    
    private void Start()
    {
        theread = new Thread(this);
        theread.start();
        
        Runing = true; 
    }
    
    private void Stop()
    {
        try {
            theread.join();
            Runing = false; 
        } catch (InterruptedException ex) {
            Logger.getLogger(Window.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
