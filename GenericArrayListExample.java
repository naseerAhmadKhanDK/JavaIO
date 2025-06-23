import java.util.ArrayList;
import java.util.List;

public class GenericArrayListExample {
    
    public static void main(String[] args){
       List<Integer> intList=new ArrayList<Integer>();
       intList.add(3);
       printList(intList);

       //List<Cat> catList=new ArrayList<>();
       //catList.add(new Cat());
       //printList(catList);

    }
    private static void printList(List<?> myList){
        // ? when exactly dont know what to pass
    System.out.println(myList);
    
    }
    
}

