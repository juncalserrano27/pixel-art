import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.io.File;

import javax.imageio.ImageIO;

public class pixelArt7 {
	// Definimos el tamaÃ±o de la imagen en ancho y alto
			private static int width = 680;
		    private static int height = 680;
		    
		    // Definimos el tamaÃƒÂ±o del pixel
		    private static int PIXEL_SIZE = 40;
		    private static Graphics2D g;
		    
		    // Definimos los colores a usar
		    static Color red	= new Color(192, 24, 24); 
		    static Color black	= Color.BLACK;
		    static Color pink	= new Color(203, 84, 102);
		    
		    
		    static BufferedImage image = new BufferedImage(width, height, BufferedImage.TYPE_INT_RGB);
		    
		    
		    public static void paint() {
		    	drawBackground(PIXEL_SIZE, Color.white);     
		        
		        drawHorizontalLine(3, 6, 1, pink);
		        drawHorizontalLine(10, 13, 1, pink);
		        drawHorizontalLine(2, 7, 2, pink);
		        drawHorizontalLine(9, 14, 2, pink);
		        fillRect(1, 3, 15, 6, pink);
		        drawHorizontalLine(2, 14, 9, pink);
		        drawHorizontalLine(3, 13, 10, pink);
		        drawHorizontalLine(4, 12, 11, pink);
		        drawHorizontalLine(5, 11, 12, pink);
		        drawHorizontalLine(6, 10, 13, pink);
		        drawHorizontalLine(7, 9, 14, pink);
		        putPixel(8,15, pink);
		        
		        drawHorizontalLine(4, 6, 3, red);
		        drawHorizontalLine(10, 12, 3, red);
		        drawHorizontalLine(3, 7, 4, red);
		        drawHorizontalLine(9, 13, 4, red);
		        drawHorizontalLine(3, 13, 5, red);
		        fillRect(3, 6, 3, 2, red);
		        putPixel(8,6, red);
		        fillRect(11, 6, 3, 2, red);
		        drawHorizontalLine(4, 6, 8, red);
		        drawHorizontalLine(10, 12, 8, red);
		        drawHorizontalLine(5, 7, 9, red);
		        drawHorizontalLine(9, 11, 9, red);
		        drawHorizontalLine(6, 10, 10, red);
		        drawHorizontalLine(7, 9, 11, red);
		        putPixel(8,12, red);
		        
		       
		        
		        
		        drawSquareGrid(PIXEL_SIZE, black);
		        
		        // Guardamos la imagen en formato JPG
		        try {       
		            ImageIO.write(image, "jpg", new File("pixel_art7.jpg"));
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



