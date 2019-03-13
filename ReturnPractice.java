
/**
 * Practice using return methods.
 * 
 * Practice Tasks
 * 
 *  1. Create method that creates and returns an array of ten random integers 
 *     between 1 and 100.
 *  2. Create an array by calling the method in #1 and assigning the return
 *     value to a new array.
 *  3. Create and call a method to print the array.
 *  4. Create and call a method that will return the sum of the array.  Print the result.
 *  5. Create and call a method that will average the values in the array.  Print the result.
 *  6. Create a method that returns true if a value that is sent to it is even and false otherwise.
 *  7. Create a method that returns the number of even values in an array.  Use a call to the previous method in this method.
 *  8. Create and call a method that will return a new array of just the even numbers in array that is sent to it.  Use a call to the previous method in this method.
 *  9. Print out the array of even numbers.
 *  
 *  BONUS:
 *  A. Overload the randomArray method in the following ways:
 *      i.    If no arguments are sent, create the array of ten random integers  between 1-100 as above.
 *      ii.   If one int is sent as an argument, create and array of that many random integers between 1-100.
 *      iii.  If three ints are sent, create an array of the first int number of random numbers
 *            between the second and third values.
 *            
 *
 * @author Cielo Bejarano
 * @version 10/19/18
 */
public class ReturnPractice
{
    public static void main (String [] args)
     {
      int [] nums = rand(); 
      printArray(nums);
      sumArray(nums);
      
     }
    
    public static int [] rand()
    {
      int [] rand = new int[10];
      for (int i = 0; i < rand.length; i++) 
      {
       rand[i]= (int)(Math.random() * 100 + 1);
      }
      return rand;
    }
    
    public static void printArray(int [] nums)
    {
      for (int val:nums)
      {
          System.out.print(val + " "); 
      }
    }
     
    public static int sumArray(int [] nums)
    {
      int sum = 0; 
      for (int i = 0; i < nums.length; i++) 
      {
        sum += nums[i]; 
      }
      return sum; 
       
    }
    
}