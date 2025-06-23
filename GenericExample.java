 class Printer<T> {
    T thingToPrint;
    public Printer(T thingToPrint){
        this.thingToPrint=thingToPrint;
    }
    public void print(){
        System.out.println(thingToPrint);
    }    
}
 class GenericExample{
    public static void main(String[] args){
        Printer<Integer> printer=new Printer<Integer>(23);
        //in java version 22 we dont need to write integer like specific type again
        Printer<Double> printerd=new Printer<Double>(5.55);
        Printer<String> printerS=new Printer<String>("Test String");
        printer.print();
        printerd.print();
        printerS.print();
    }
}
