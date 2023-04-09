import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.io.File;

import javax.imageio.ImageIO;

public class pixelArt2 {
	// Definimos el tamaÃ±o de la imagen en ancho y alto
			private static int width = 520;
		    private static int height = 1040;
		    
		    // Definimos el tamaÃƒÂ±o del pixel
		    private static int PIXEL_SIZE = 40;
		    private static Graphics2D g;
		    
		    // Definimos los colores a usar
		    static Color white	= Color.white;
		    static Color black	= Color.BLACK;
		    static Color gris = new Color(181, 181, 181);
		    
		    static BufferedImage image = new BufferedImage(width, height, BufferedImage.TYPE_INT_RGB);
		    
		    
		    public static void paint() {
		    	drawBackground(PIXEL_SIZE, Color.white);     
		        
		    	putPixel(3,1, black);
		    	putPixel(9,1, black);
		        drawHorizontalLine(3, 4, 2, black);
		        drawHorizontalLine(8, 9, 2, black);
		        drawHorizontalLine(3, 9, 3, black);
		        drawHorizontalLine(2, 10, 4, black);
		        drawHorizontalLine(2, 10, 5, black);
		        drawHorizontalLine(3, 9, 6, black);
		        drawHorizontalLine(4, 8, 7, black);
		        drawHorizontalLine(3, 9, 8, black);
		        drawHorizontalLine(3, 9, 9, black);
		        drawHorizontalLine(2, 10, 10, black);
		        drawHorizontalLine(2, 10, 11, black);
		        drawHorizontalLine(1, 11, 12, black);
		        drawHorizontalLine(1, 11, 13, black);
		        drawHorizontalLine(2, 10, 14, black);
		        drawHorizontalLine(3, 9, 15, black);
		        drawHorizontalLine(4, 8, 16, black);
		        fillRect(6, 17, 2, 3, black);
		        fillRect(5, 20, 2, 2, black);
		        drawVerticalLine(22,23,5,black);
		        drawVerticalLine(23,24,6,black);
		        putPixel(7,24, black);
		        
		        
		        drawSquareGrid(PIXEL_SIZE, gris);
		        
		        // Guardamos la imagen en formato JPG
		        try {       
		            ImageIO.write(image, "jpg", new File("pixel_art2.jpg"));
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



