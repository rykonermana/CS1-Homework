import java.util.*;
/**
 * Write a description of class Checkbook here.
 *
 * @author Dan Reuter
 * @version 2017.06.05
 */

public class Checkbook
{
    // instance variables - replace the example below with your own
    private static ArrayList<Check> checkList;
    public static double totalBalance;
    /**
     * Constructor for objects of class Checkbook
     */
    public Checkbook()
    {
        checkList = new ArrayList<Check>();
        totalBalance = 0;
    }
    
    public void addCheck(Check newCheck){
        checkList.add(newCheck);
        totalBalance = totalBalance + newCheck.amount;
    }
    
    public static void printList(){
        for(Check check : checkList) {
           check.printCheck(); 
        }
    }
    public static double getBalance(){
        return Checkbook.totalBalance;
    }
}
