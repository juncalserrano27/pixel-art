import java.awt.Color;
	import java.awt.Graphics2D;
	import java.awt.image.BufferedImage;
	import java.io.File;
	import javax.imageio.ImageIO;

public class pixelArt1 {
	// Definimos el tamaÃ±o de la imagen en ancho y alto
			private static int width = 920;
		    private static int height = 920;
		    
		    // Definimos el tamaÃƒÂ±o del pixel
		    private static int PIXEL_SIZE = 40;
		    private static Graphics2D g;
		    
		    // Definimos los colores a usar
		    static Color white	= Color.white;
		    static Color green	= new Color(92, 223, 99);
		    static Color blue   = new Color(0,171,214); 
		    static Color yellow = new Color(246, 251, 61);
		    static Color brown	= new Color(102, 43, 3);
		    static Color softBrown 	= new Color(202, 96, 23 );
		    static Color Pink1 = new Color(255, 172, 172);
		    static Color Pink2 = new Color(255, 110, 110);
		    static Color strongPink = new Color(251, 61, 61); 
		    
		    static BufferedImage image = new BufferedImage(width, height, BufferedImage.TYPE_INT_RGB);
		    
		    
		    public static void paint() {
		    	drawBackground(PIXEL_SIZE, Color.white);     
		        drawHorizontalLine(11, 15, 1, brown);
		        drawHorizontalLine(8, 18, 2, brown);
		        drawHorizontalLine(6, 19, 3, brown);
		        drawHorizontalLine(5, 20, 4, brown);
		        drawHorizontalLine(4, 21, 5, brown);
		        drawHorizontalLine(3, 21, 6, brown);
		        drawHorizontalLine(2, 22, 7, brown);
		        drawHorizontalLine(2, 22, 8, brown);
		        drawHorizontalLine(1, 22, 9, brown);
		        drawHorizontalLine(1, 22, 10, brown);
		        drawHorizontalLine(0, 22, 11, brown);
		        drawHorizontalLine(0, 21, 12, brown);
		        drawHorizontalLine(0, 21, 13, brown);
		        drawHorizontalLine(0, 20, 14, brown);
		        drawHorizontalLine(0, 20, 15, brown);
		        drawHorizontalLine(1, 19, 16, brown);
		        drawHorizontalLine(1, 18, 17, brown);
		        drawHorizontalLine(2, 17, 18, brown);
		        drawHorizontalLine(3, 16, 19, brown);
		        drawHorizontalLine(4, 14, 20, brown);
		        drawHorizontalLine(7, 11, 21, brown);
		        
		        drawHorizontalLine(11, 15, 2, Pink1);
		        fillRect(8, 3, 11, 2, Pink1);
		        fillRect(6, 4, 13, 2, Pink1);
		        fillRect(5, 5, 14, 2, Pink1);
		        fillRect(2, 9, 4, 5, Pink1);
		        fillRect(3, 7, 4, 5, Pink1);
		        putPixel(6,13,Pink1);
		        fillRect(3, 14, 9, 2, Pink1);
		        drawHorizontalLine(5, 9, 16, Pink1);
		        fillRect(7, 7, 12, 6, Pink1);
		        fillRect(10, 13, 7, 3, Pink1);
		        
		        putPixel(6,12,Pink2);
		        drawVerticalLine(10,11,7,Pink2);
		        putPixel(8,9,Pink2);
		        putPixel(9,8,Pink2);
		        drawHorizontalLine(10, 11, 7, Pink2);
		        putPixel(12,6,Pink2);
		        drawVerticalLine(11,15,1,Pink2);
		        drawVerticalLine(14,17,2,Pink2);
		        fillRect(3, 16, 2, 3, Pink2);
		        drawHorizontalLine(5, 10, 17, Pink2);
		        drawHorizontalLine(5, 7, 18, Pink2);
		        drawHorizontalLine(9, 12, 16, Pink2);
		        drawHorizontalLine(12, 14, 15, Pink2);
		        drawHorizontalLine(14, 15, 14, Pink2);
		        drawHorizontalLine(15, 16, 13, Pink2);
		        drawHorizontalLine(16, 17, 12, Pink2);
		        drawVerticalLine(10,15,17,Pink2);
		        drawVerticalLine(8,10,18,Pink2);
		        drawVerticalLine(4,8,19,Pink2);
		        
		        drawHorizontalLine(4, 7, 19, softBrown);
		        fillRect(7, 19, 5, 2, softBrown);
		        fillRect(8, 18, 7, 2, softBrown);
		        fillRect(11, 17, 6, 2, softBrown);
		        fillRect(13, 16, 5, 2, softBrown);
		        fillRect(15, 15, 4, 2, softBrown);
		        fillRect(16, 14, 4, 2, softBrown);
		        drawHorizontalLine(17, 20, 13, softBrown);
		        fillRect(18, 11, 3, 2, softBrown);
		        fillRect(19, 9, 3, 3, softBrown);
		        fillRect(20, 7, 2, 2, softBrown);
		        drawVerticalLine(5,6,20,softBrown);
		        drawHorizontalLine(7, 9, 12, softBrown);
		        fillRect(8, 10, 4, 2, softBrown);
		        drawHorizontalLine(9, 12, 9, softBrown);
		        drawHorizontalLine(10, 12, 8, softBrown);
		        putPixel(12,7,softBrown);
		        
		        drawHorizontalLine(10, 11, 12, brown);
		        drawVerticalLine(10,11,12,brown);
		        drawVerticalLine(7,9,13,brown);
		        
		        drawVerticalLine(3,4,13,blue);
		        drawVerticalLine(8,9,6,blue);
		        putPixel(13,13,blue);
		        putPixel(14,12,blue);
		        
		        drawVerticalLine(9,10,15,yellow);
		        drawHorizontalLine(5, 6, 15, yellow);
		        
		        drawVerticalLine(12,13,3,green);
		        drawHorizontalLine(15, 16, 6, green);
		        
		        drawHorizontalLine(8, 9, 6, strongPink);
		        putPixel(9,15,strongPink);
		        putPixel(10,16,strongPink);
		        
		        drawSquareGrid(PIXEL_SIZE, Color.black);
		        
		        // Guardamos la imagen en formato JPG
		        try {       
		            ImageIO.write(image, "jpg", new File("pixel_art.jpg"));
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



