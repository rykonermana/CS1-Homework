import java.io.*;
class Depersist{
    public static void main(String args[])throws Exception{
        ObjectInputStream in= new ObjectInputStream(new FileInputStream("ObjectKeeper.txt"));
        
        Check c =(Check)in.readObject();
        in.close();
    }
}