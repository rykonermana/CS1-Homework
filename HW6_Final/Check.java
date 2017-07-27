//import statements
// I understand everything in this class and how to use each part, mostly at least
public class Check{
    //instance variables
    double amount;
    String receiver;
    int checkNumber;
    String reason;
    
    //constructor
    public Check(double amount, String receiver, int checkNumber, String reason){
        this.amount =  amount;
        this.receiver = receiver;
        this.checkNumber = checkNumber;
        this.reason = reason;
    }
    
    //prints a single check
    public void printCheck(){
        System.out.println("Dan Reuter           " + checkNumber);
        System.out.println("To " + receiver + "for the amount of " + amount);
        System.out.println("For the reason of " + reason);
    }
    
    //setters
    public void setAmount(double newAmount){
        amount = newAmount;
    }
    public void setReceiver(String newReceiver){
        receiver = newReceiver;
    }
    public void setCheckNumber(int newCheckNumber){
        checkNumber = newCheckNumber;
    }
    public void setReason(String newReason){
        reason = newReason;
    }
    //getters
    public void getAmount(){
        System.out.println("Amount is " + amount);
    }
    public void getReceiver(){
        System.out.println("Receiver is " + receiver);
    }
    public void getCheckNumber(){
        System.out.println("Check Number is " + checkNumber);
    }
    public void getReason(){
        System.out.println("Reason is " + reason);
    }
}