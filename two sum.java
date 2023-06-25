import java.util.*;

public class subarr {
    public static void main(String[] args) {
     int number[] = {2,7,11,15};
     int target = 9;
     for (int i=0;i<number.length;i++){
//         int curr = number[i];
         for (int j =i+1;j<number.length;j++){
             if(number[i]+number[j] == target){
                 System.out.println("sum of index = "+ i + " " +j);
             }

         }
     }
    }
}