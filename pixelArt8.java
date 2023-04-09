import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.io.File;

import javax.imageio.ImageIO;

public class pixelArt8 {
	// Definimos el tamaÃ±o de la imagen en ancho y alto
			private static int width = 360;
		    private static int height = 360;
		    
		    // Definimos el tamaÃƒÂ±o del pixel
		    private static int PIXEL_SIZE = 40;
		    private static Graphics2D g;
		    
		    // Definimos los colores a usar
		    static Color yellow	= new Color(252, 247, 71); 
		    static Color black	= Color.BLACK;
		    static Color pink	= new Color(250, 178, 200);
		    static Color gris = new Color(181, 181, 181);
		    static Color orange = new Color(252, 167, 71);
		    
		    
		    static BufferedImage image = new BufferedImage(width, height, BufferedImage.TYPE_INT_RGB);
		    
		    
		    public static void paint() {
		    	drawBackground(PIXEL_SIZE, Color.white);     
		        
		        drawHorizontalLine(3, 5, 1, yellow);
		        drawHorizontalLine(2, 6, 2, yellow);
		        drawHorizontalLine(2, 6, 3, yellow);
		        fillRect(1, 4, 7, 2, yellow);
		        drawHorizontalLine(2, 6, 6, yellow);
		        putPixel(3,7, orange);
		        putPixel(5,7, orange);
		        putPixel(4,4, orange);
		        drawHorizontalLine(2, 3, 4, pink);
		        drawHorizontalLine(5, 6, 4, pink);
		        putPixel(5,3, black);
		        putPixel(3,3, black);
		    
		        
		      
		        drawSquareGrid(PIXEL_SIZE, gris);
		        
		        // Guardamos la imagen en formato JPG
		        try {       
		            ImageIO.write(image, "jpg", new File("pixel_art8.jpg"));
		            System.out.println("EXITO !!!");
		        } catch (Exception e) {
		            e.printStackTrace();
		        }
		    }
		    
		    private static void drawVerticalLine(int a, int b, int x, Color c){
		   	    g.setColor(c);
		    	for(int i=a;i<=b;i++){
		    		 putPixel(x, i, c);
		        }
		    }
		    
		    private static void drawHorizontalLine(int a, int b, int y, Color c){
		    	g.setColor(c);
		        for(int i=a;i<=b;i++){
		        	 putPixel(i, y, c);
		        }
		    }
		    
		    private static void putPixel(int x, int y, Color c){       
			   g.setColor(c);
			   g.fillRect(x * PIXEL_SIZE, y * PIXEL_SIZE, PIXEL_SIZE, PIXEL_SIZE);    
		    }
		    
		    private static void fillRect(int x, int y, int width, int height, Color c){
		    	g.setColor(c);
		    	g.fillRect(x * PIXEL_SIZE, y * PIXEL_SIZE, width*PIXEL_SIZE, height*PIXEL_SIZE);
		    }
		    
		    private static void drawSquareGrid(int size, Color c) {
		    	g.setColor(c);
		        for (int i = 0; i < size; i++) {
		            for (int j = 0; j < size; j++) { 
		                g.drawRect(i * PIXEL_SIZE, j * PIXEL_SIZE, PIXEL_SIZE, PIXEL_SIZE);
		            }
		        }
		    }
		    private static void drawBackground(int size, Color c) {
		    	g.setColor(c);
		    	for (int i = 0; i < size; i++) {
		            for (int j = 0; j < size; j++) {
		                g.fillRect(i * PIXEL_SIZE, j * PIXEL_SIZE, PIXEL_SIZE, PIXEL_SIZE);                
		            }
		        }
		    }    
		    
		    public static void main(String[] args) {
		        g = image.createGraphics();        
		        paint();
		    }
		}



