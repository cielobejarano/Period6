
/**
 * An introduction to return methods. 
 *
 * @author Cielo Bejarano
 * @version (10/17/18
 */
public class ReturnMethods
{
    public static void main (String [] args) 
    {
        sayHello(); 
        int x = add(2, 4); 
        System.out.println(x);
        int [] nums = {3, 2, 4, 5}; 
    }
    public static void sayHello()
    {
     System.out.println("Hello");    
    }
    public static int add(int a, int b)
    {
        return a + b;
    }
    }