//program to find and print the primnumber from 2 to 200
public class primeno {
    public static void main(String[] args){
        
        for(int i=2;i<200;i++){
            boolean isp=true;
            for(int j=2;j<i;j++){
                if(i%j==0){
                    isp=false;
                    break;
                 
                }                
            }
            if(isp){
                    System.out.println(i);
            
        }

    }
    
}
