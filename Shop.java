import java.util.Scanner; 
/**
 * A fun camping store that uses methods. 
 *
 * @author Cielo Bejarano 
 * @version 10/26/18
 */
public class Shop
{
   //Class Variables 
   public static final double SB_PRICE = 59.95;  
   public static final double TENT_PRICE = 145.50;
   public static final double CS_PRICE = 39.25;
   
   public static final double SALES_TAX = 0.087;
   
   public static double subtotal = 0;
   public static int numItems = 0;
   public static int numSB = 0;
   public static int numTent = 0;
   public static int numCS = 0;
  
   
   public static Scanner kb = new Scanner(System.in);  
   public static Scanner kbString = new Scanner(System.in);
   
   public static void main(String [] args) 
   {
       mainMenu();
   }
   
   
   public static void mainMenu()
   {
     boolean continueOrder = true; 
     while (continueOrder)
     {
       System.out.println("What would you like to do?"); 
       System.out.println("1 - Buy an item");
       System.out.println("2 - Show items in cart");
       System.out.println("3 - Remove item(s) from cart");
       System.out.println("4 - Checkout"); 
       int choice = kb.nextInt(); 
       
       switch (choice)
       {
        case 1:
          buy(); 
          break;
        case 2:
          printSubtotal();
          System.out.println(); 
          break; 
        case 3: 
          removeItems(); 
          break; 
        case 4:
          checkout(); 
          continueOrder = false; 
          break; 
        default:
          System.out.println("Invalid input");
          break; 
       } 
     }
   }
   
   
   public static int [] buy()
   {
       System.out.println("What would you like to purchase?");
       System.out.println("1 - Sleeping Bag, $" + SB_PRICE); 
       System.out.println("2 - Tent, $" + TENT_PRICE); 
       System.out.println("3 - Camping Stove, $" + CS_PRICE); 
       int itemChoice = kb.nextInt(); 
       
       System.out.println("How many would you like to purchase:"); 
       int itemQuantity = kb.nextInt(); 
      
       switch (itemChoice) 
       {
        case 1: 
           subtotal += SB_PRICE * itemQuantity;
           numItems += itemQuantity;
           numSB += itemQuantity;
           break; 
        case 2: 
           subtotal += TENT_PRICE * itemQuantity;
           numItems += itemQuantity; 
           numTent += itemQuantity; 
           break;   
        case 3: 
           subtotal += CS_PRICE * itemQuantity;
           numItems += itemQuantity; 
           numCS += itemQuantity;  
           break; 
        default: 
           System.out.println("Sorry, that was an invalid choice."); 
           break; 
       }
       int [] breakdown = {numSB, numTent, numCS, numItems}; 
       return breakdown;
   }
  
   
   public static void printSubtotal()
   {
     System.out.println();   
     System.out.println("You currently have " + numItems + " item(s) in your cart."); 
      
      if (numSB > 0) 
      {
       System.out.println( numSB + " Sleeping Bag(s): $" + SB_PRICE * numSB); 
      }
      if (numTent > 0)
      {
          System.out.println( numTent + " Tent(s): $" + TENT_PRICE * numTent); 
      }
       if (numCS > 0)
      {
          System.out.println( numCS + " Cooking Stove(s): $" + CS_PRICE * numCS); 
      }
      System.out.println("Your subtotal is $" + subtotal); 
   }
   
    public static void removeItems()
   {
       System.out.println(); 
       printSubtotal(); 
       String itemName = ""; 
       System.out.println("What item would you like to remove?"); 
       System.out.println("1 - Sleeping Bag, $" + SB_PRICE); 
       System.out.println("2 - Tent, $" + TENT_PRICE); 
       System.out.println("3 - Camping Stove, $" + CS_PRICE);
       int removalChoice = kb.nextInt();
       System.out.println(); 
       System.out.println("How many would you like to remove?"); 
       int removalQty = kb.nextInt(); 
       switch (removalChoice)
       {
         case 1:
           if (removalQty <= numSB)
           {
           numSB -= removalQty; 
           subtotal -= SB_PRICE * removalQty;
           numItems -= removalQty;
           itemName = "Sleeping Bag(s)";
           System.out.println("We have removed " + removalQty + " " +  itemName); 
        }
        else
            { 
            System.out.println("Invalid Input");
        }
           break; 
          
         case 2: 
           if (removalQty <= numTent)
           {
           numTent -= removalQty; 
           subtotal -= TENT_PRICE * removalQty;
           numItems -= removalQty;
           itemName = "Tent(s)"; 
           System.out.println("We have removed " + removalQty + " " +  itemName); 
        }
        else
            { 
            System.out.println("Invalid Input");
        }
           break; 
           
         case 3:
           if (removalQty <= numCS)
           {
           numCS -= removalQty; 
           subtotal -= CS_PRICE * removalQty;
           numItems -= removalQty;
           itemName = "Cooking Stove(s)";
           System.out.println("We have removed " + removalQty + " " +  itemName); 
        }
        else
            { 
            System.out.println("Invalid Input");
        }
           break; 
           
         default:
           System.out.println("Invalid Input");
           break; 
        }
   }
    
   public static void checkout()
   {
       printSubtotal(); 
       applyDiscount(); 
       
       double totalSalesTax = subtotal * SALES_TAX; 
       double total = subtotal + totalSalesTax; 
       
       System.out.println("Sales tax on your purchase is $" + totalSalesTax); 
       System.out.println("Your total is $" + total + ".");
   }
   
   
   public static void applyDiscount()
   {
       boolean continueDiscount = true; 
       while (continueDiscount)
        {
           System.out.println("Do you have a discount code?"); 
           System.out.println("1 - Yes"); 
           System.out.println("2 - No"); 
           int choice = kb.nextInt(); 
           switch (choice) 
           {
               case 1:
                  continueDiscount = !checkCode(); 
                  break; 
               case 2:
                  continueDiscount = false; 
                  break; 
               case 3: 
                  System.out.println("Invalid Choice"); 
                  break; 
               
           }
       }    
   }
   
   
   public static boolean checkCode()
   {
     System.out.println("Enter your code:");   
     String code = kbString.nextLine(); 
    
     switch (code) 
     {
         case "CAMPZ": 
            calculateDiscount(10); 
            return true; 
         case "OUTDOORS":
             calculateDiscount(20);
             return true; 
         default: 
             System.out.println("Invalid Code"); 
             return false; 
        }
   }
   
   
   public static void calculateDiscount(int discount) 
   {
       double savings = subtotal * discount / 100; 
       subtotal -= savings; 
       System.out.println("Your discount is " + discount + "%"); 
       System.out.println("You saved $" + savings + "."); 
   }
}