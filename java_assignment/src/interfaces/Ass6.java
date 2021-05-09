package interfaces;

interface Draw{  
void draw();  
}
class Rect implements Draw{  
public void draw(){System.out.println("drawing rectangle");}  
}  
class Ass6{  
public static void main(String args[]){  
Draw d=new Rect();  
d.draw();  
}
}  