package interfaces;

interface next{  
void print();  
}  
class Ass3 implements next{  
public void print(){System.out.println("Hello");}  
  
public static void main(String args[]){  
	Ass3 obj = new Ass3();  
    obj.print();  
 }  
} 