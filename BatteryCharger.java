/**
 * Starter Code for FRQ: 2009 Q3
 *
 * @author David Herring
 * @version 11/7/18
 */
public class BatteryCharger
{
    //These are the values from the sample rate table provided in the question
    public int [] rateTable = {50, 60, 160, 60, 80, 100, 100, 120, 150, 150, 150, 200, 40, 240, 220, 220, 200, 200, 180, 180, 140, 100, 80, 60};
    
    public static void main(String [] args)
    {
        BatteryCharger b = new BatteryCharger();
        
        //These calls mimic those in part A and should return/print the following values: 40, 110, 550, 3710
        System.out.println(b.getChargingCost(12, 1));
        System.out.println(b.getChargingCost(0, 2));
        System.out.println(b.getChargingCost(22, 7));
        System.out.println(b.getChargingCost(22, 30));
        
        //These calls mimic those in part B and should return/print the following values: 12, 0 or 23, 22, 22
        System.out.println(b.getChargeStartTime(1));
        System.out.println(b.getChargeStartTime(2));
        System.out.println(b.getChargeStartTime(7));
        System.out.println(b.getChargeStartTime(30));
    }
    
    private int getChargingCost(int startHour, int chargeTime)
    {
        int cost = 0;
        for (int x = 0; x < chargeTime; x++)
        {
            cost += rateTable[(startHour + x) % 24];
        }
        return cost; 
    }
    
    private int getChargeStartTime(int chargeTime)
    {
       int startTime = 0;
       for (int i = 1; i < 24; i++)
       {
           if (getChargingCost(i, chargeTime) < getChargingCost(startTime, chargeTime))
           {
               startTime = i;
           }
       }
       return startTime; 
    }
}

