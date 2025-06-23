import java.util.ArrayList;
import java.util.Arrays;
public class ArrayVsArrayList {
    public static void main(String[] args){
        // String[] syntax for array string declaration
        String[] friendsArray=new String[4]; //need size and stick with fixed size
        String[] friendsArray2={"John","Chris","Eric","Luk3"}; //other way

        //ArrayList no need to specify the size of array and it dont have fixed size
        //Arraylist hold object not primative like int, string and so on
        //but we have to use Integer instead but working in the same way.
        ArrayList<String> friendArrayList=new ArrayList<String>();
        //other way we can also play with its value but if give value the its not changeble
        ArrayList<String> friendsArrayList2=
        new ArrayList<>(Arrays.asList("John","Chris","Eric","Luk3"));

        //how get values

        System.out.println(friendsArray2[1]);
        System.out.println(friendsArrayList2.get(1));
       //to get length in array and arraylist size() mehtod rather than field
       
        System.out.println(friendsArray2.length);
        System.out.println(friendsArrayList2.size());

        //how to add item to array it is not possible
        //its possible in arrayList and it can grow dynamically
        friendsArrayList2.add("Mitch");
        System.out.println(friendsArrayList2.get(4));

        //how to change element in array and arraylist
        friendsArray2[0]="Carls";
        System.out.println(friendsArray2[0]);

        friendsArrayList2.set(0,"Carls");
        System.out.println(friendsArrayList2.get(0));

        //Remove element from array
        //cant do it 
        //but possible in arrayList through index or values
        friendsArrayList2.remove("Chris");
        friendsArrayList2.remove(2);
        System.out.println(friendsArrayList2.get(1));
        System.out.println(friendsArrayList2.get(2));

        //print arraylist
        System.out.println(friendsArray2); //need loop to display and this will memory address
        System.out.println(friendsArrayList2);

    }
    
}
