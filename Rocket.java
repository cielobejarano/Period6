
/**
 * A class that does use methods to build a rocket
 *
 * @author Cielo Bejarano 
 * @version 10/16/18
 */
public class Rocket
{
    public static void main (String [] args) 
     {
       drawRocket(); 
     }
    public static void drawCone()
    {
        System.out.println("   /\\");
        System.out.println("  /  \\");
        System.out.println(" /    \\");
    }
    public static void drawV()
    {
        System.out.println(" \\    /");
        System.out.println("  \\  /");
        System.out.println("   \\/");

    }
    public static void drawSquare()
    {
        System.out.println("+------+");
        System.out.println("|      |");
        System.out.println("|      |");
        System.out.println("+------+");

    }
    public static void drawDiamond()
    {
        drawCone();
        drawV();
    }
    public static void drawX()
    {
        drawV();
        drawCone();
    }
    public static void drawRocket()
    {
        drawCone();
        drawSquare();
        System.out.println("|SPACE |");
        System.out.println("|  X   |");
        drawSquare();
        drawCone();
    }
   
}
