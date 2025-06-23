public class GenericMethodExample {
    public static void main(String[] args){
        shout("Johan",45);
        shout(44,"Stringtest");
        shout(4.33,"My test Name");
       // shout(new Cat());

    }
    private static <T,V> void shout(T thisToShout,V otherthingsToShout){
        System.out.println(thisToShout+"!!!!");
        System.out.println(otherthingsToShout+"####");
    }
    
}
