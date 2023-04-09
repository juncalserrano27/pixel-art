import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.io.File;

import javax.imageio.ImageIO;

public class pixelArt10 {
	// Definimos el tamaÃ±o de la imagen en ancho y alto
			private static int width = 280;
		    private static int height = 480;
		    
		    // Definimos el tamaÃƒÂ±o del pixel
		    private static int PIXEL_SIZE = 40;
		    private static Graphics2D g;
		    
		    // Definimos los colores a usar
		    static Color green	= new Color(49, 119, 40); 
		    static Color red	= new Color(192, 24, 24);
		    static Color black	= Color.black;
		    
		    
		    
		    static BufferedImage image = new BufferedImage(width, height, BufferedImage.TYPE_INT_RGB);
		    
		    
		    public static void paint() {
		    	drawBackground(PIXEL_SIZE, Color.white);     
		        
		    	putPixel(1,1, red);
		        putPixel(3,1, red);
		        putPixel(5,1, red);
		        fillRect(1, 2, 5, 3, red);
		        drawHorizontalLine(2, 4, 5, red);
		        drawVerticalLine(6,10,3,green);
		        drawVerticalLine(7,8,1,green);
		        drawVerticalLine(7,8,5,green);
		        drawHorizontalLine(2, 4, 9, green);
		    
		        
		      
		        drawSquareGrid(PIXEL_SIZE, black);
		        
		        // Guardamos la imagen en formato JPG
		        try {       
		            ImageIO.write(image, "jpg", new File("pixel_art10.jpg"));
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



