
/**
 * An introduction to using parameters with methods
 *
 * @author Cielo Bejarano
 * @version 10/16/18
 */
public class Parameters
{
    public static void main (String [] args) 
    {
        sayHello(); 
        sayHello(" David"); 
        sayHello(" Shane"); 
        luckyNumber(" Cielo", 157);
        
        int [] arr = {1, 4, 82, 21, 64}; 
        printArray(arr); 
        
        int [] otherNums = {2, 5, 6}; 
        printArray(otherNums); 
        
        String [] names = {"Abe", "Jill", "Bob", "Ellie"};
        //printArray(names); 
        
    }
    /*
    public static void printArray(String [] arr)
    {
        for (String 
    }
    */
    public static void sayHello(String name)
    {
      System.out.println("Hello," + name + "!");    
    }
    public static void luckyNumber(String name, int highVal)
    {
      int rando = (int)(Math.random() * highVal +1); 
      System.out.println("Hi," + name + "!");    
      System.out.println("Your lucky number between 1 and " + highVal + ": " + rando);
    }     
    public static void printArray(int [] nums)
    {
      for (int val:nums)
      {
          System.out.print(val + " "); 
      }
      System.out.println(); 
    }
    public static void sayHello()
    {
     sayHello(" World");    
    }
}