import java.util.Random;

public class InsertionSort {
    public static void main(String[] args){
        Random rand=new Random();
        int[] number=new int[10];

        for(int i=0;i<number.length;i++){
            number[i]=rand.nextInt(20);
        }
        System.out.println("Before:");
        printArray(number);
        System.out.print("After sorting:");
        SortingAlgo(number);
        printArray(number);
        //try other way
        System.out.print("After sorting: with simple loop Asending order::");
        SortAlgo1AscendingOrder(number);
        printArray(number);

        //try other way
        System.out.print("After sorting: with simple loop Desending order::");
        SortAlgo1DecendingOrder(number);
        printArray(number);

    }
    private static void printArray(int[] number){
        for(int i=0;i<number.length;i++){
            System.out.println(number[i]);
        }
    }
    private static void SortingAlgo(int[] number){
        for(int i=1;i<number.length;i++){
            int temp=number[i];
            int j=i-1;
            while((j>=0)&&(number[j]>temp)){
                
                number[j+1]=number[j];
                j=j-1;
            }
            number[j+1]=temp;
        }
    }
    private static void SortAlgo1AscendingOrder(int[] number){
        for(int i=1;i<number.length;i++){
            int temp=number[i];
            if(temp>number[i]){
                temp=number[i];
            }
            
        }
    }
    private static void SortAlgo1DecendingOrder(int[] number){
     for(int i=1;i<number.length;i++){
            int temp=number[i];
            int j=i-1;
            while((j>=0)&&(number[j]<temp)){
                
                number[j+1]=number[j];
                j=j-1;
            }
            number[j+1]=temp;   
            
        }
    }
    
}
