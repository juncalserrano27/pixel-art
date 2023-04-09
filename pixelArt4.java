import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.io.File;

import javax.imageio.ImageIO;

public class pixelArt4 {
	// Definimos el tamaÃ±o de la imagen en ancho y alto
			private static int width = 520;
		    private static int height = 520;
		    
		    // Definimos el tamaÃƒÂ±o del pixel
		    private static int PIXEL_SIZE = 40;
		    private static Graphics2D g;
		    
		    // Definimos los colores a usar
		    static Color gris = new Color(181, 181, 181);
		    static Color black	= Color.BLACK;
		    
		    
		    static BufferedImage image = new BufferedImage(width, height, BufferedImage.TYPE_INT_RGB);
		    
		    
		    public static void paint() {
		    	drawBackground(PIXEL_SIZE, Color.white);     
		        
		        drawHorizontalLine(5, 7, 1, black);
		        fillRect(4, 2, 5, 2, black);
		        drawHorizontalLine(5, 7, 4, black);
		        drawHorizontalLine(2, 3, 4, black);
		        drawHorizontalLine(9, 10, 4, black);
		        fillRect(1, 5, 4, 3, black);
		        putPixel(6,5, black);
		        fillRect(8, 5, 4, 3, black);
		        drawHorizontalLine(5, 7, 6, black);
		        drawHorizontalLine(2, 3, 8, black);
		        drawHorizontalLine(9, 10, 8, black);
		        drawVerticalLine(7,9,6,black);
		        drawHorizontalLine(5, 7, 10, black);
		        drawHorizontalLine(4, 5, 11, black);
		        drawHorizontalLine(7, 8, 11, black);
		       
		        
		        drawSquareGrid(PIXEL_SIZE, gris);
		        
		        // Guardamos la imagen en formato JPG
		        try {       
		            ImageIO.write(image, "jpg", new File("pixel_art4.jpg"));
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



