public class GenericExampleClass {
  public  static void main(String[] args){

        Shout("FirstName", "LastName");
         Shout("Alex", "23");
         
         
        
    }
    private static <T,V> T Shout(T thingsToShout, V otherthingsToShout){
        System.out.println(thingsToShout+"!!!!");
        System.out.println(otherthingsToShout+"!!!!!!!###");
        return thingsToShout;
    }
    class Printer<T,V> {
   T thingToPrint;
   V OtherThingsToPrint;

   public Printer(T var1,V var2) {
      this.thingToPrint = var1;
      this.OtherThingsToPrint=var2;
   }

   public void print() {
      System.out.println(thingToPrint);
      System.out.println(OtherThingsToPrint);
   }
}
    
}
