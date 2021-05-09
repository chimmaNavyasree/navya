package abstaraction;

abstract class type{  
abstract void draw();  
}  
class box extends Shape{  
void draw()
{System.out.println("drawing circle");}  
}   
 public class Ass4{  
public static void main(String args[]){  
Shape s=new Circle1(); 
s.draw();  
}  
}  