
public class Lambdas {
    public static void main(String[] args){
       // Cat myCat=new Cat();
        //printThing(myCat);
      //  myCat.print();
      //lamda make it easir
      //
      
      printThing(
         (t)->System.out.println("Meow Meow Mewo"));

         //other way
        // Printable lPrintable=(s)->"Meo"+ s;
        // printThing(lPrintable);
      

    }
    static void printThing(Printable things){
        things.print("Test parameter with lemda");
    }
    
}
 interface Printable {

    void print(String s);

    
}
 class Cat implements Printable {
    public String name;
    public int age;
    public Cat(){}
    public void print(String a){
        System.out.println("Meow Meow Mewo"+a);
    }    
}