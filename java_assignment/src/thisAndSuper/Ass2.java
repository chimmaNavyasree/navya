package thisAndSuper;

class Animal{  
String color="white";  
}  
class Dog extends Animal{   
void printColor(){   
System.out.println(super.color);//prints color of Animal class  
}  
}  
class Ass2{  
public static void main(String args[]){  
Dog d=new Dog();  
d.printColor();  
}}  