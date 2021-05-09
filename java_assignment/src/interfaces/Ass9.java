package interfaces;

interface Sayable{  
    default void say() {  
        saySomething();  
    }  
    // Private method inside interface  
    private void saySomething() {  
        System.out.println("Hello... I'm private method");  
    }  
}  
public class Ass9 implements Sayable {  
    public static void main(String[] args) {  
        Sayable s = new Ass9();  
        s.say();  
    }  
}  
