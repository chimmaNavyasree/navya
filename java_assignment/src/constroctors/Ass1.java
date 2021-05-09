package constroctors;
class Student5{  
    int id;  
    String name;   
    //creating one arg constructor  
    Student5(int i){  
    id = i;  
    }  
    //creating two arg constructor  
    Student5(int i,String n){  
    id = i;  
    name = n;  
    }  
    void display(){System.out.println(id+" "+name);}  
}
public class Ass1 {

	public static void main(String[] args) {
		 Student5 s1 = new Student5(111);  
		    Student5 s2 = new Student5(222,"Aryan");  
		    s1.display();  
		    s2.display();  

	}

}
