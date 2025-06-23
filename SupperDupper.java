

public class SupperDupper {
    public static void main(String[] args){
    Cat myCat=new Cat(3,"Geogra","purana One");
    myCat.makeNoise();
    System.out.println(myCat.age+" "+myCat.name+" "+myCat.catFoodpreference);
    //if we want it from parant animal class
   // myCat.super.makeNoise();
    }
}
 class  Animal {
    int age;
    String name;
    public Animal(){

    }
    public Animal(int age,String name){
        this.age=age;
        this.name=name;
    }
    public void makeNoise(){
        System.out.println("Hello, I am an animal");
    }
    public void eat(){
        System.out.println("Munch munch");
    }
    protected void doSomthingPrivat(){
        System.out.println("Hey this method is private");
    }
   

    
}
 class Cat extends Animal{
    String catFoodpreference;
    //to get all properties of the animal with cat
    public Cat(int age,String name,String catFood){
       super(age,name);
        //super();
        //if not pass the parameter java will do it for us. with no agr consturctor
        //this.age=age;
       // this.name=name;
       //this way code duplication we try to achive through super class constructor
        this.catFoodpreference=catFood;
    }
   @Override
    public void makeNoise(){
        //for using the animal class makeNoise method used super
        //we can call from any non static method
        //we use it when we specifically need the parant class method content
        super.makeNoise();
        System.out.println("Meow meow meow");
        eat();
        //in private method variable it will not but in protected it will work
        //super.doSomthingPrivat();  // will not work
        super.doSomthingPrivat();

    }
    public void jum(){
        
    }

    
}
