package exceptionhandling;

public class Ass9 {    
    public static void main(String args[]) {
        try 
        {
            Class.forName("GeeksForGeeks");
        }
        catch (ClassNotFoundException ex)
        {
            ex.printStackTrace();
        }
    }
}