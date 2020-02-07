import java.util.*;
public class Repeating_and_Missing {
    static void repeating_and_Missing(int arr[]) {
       
       for(int i=0;i<arr.length;i++) {
           int num = Math.abs(arr[i])-1;
            if(arr[num]> 0){
             arr[num] = -arr[num];
         } else{
             System.out.println("Repeating number is "+Math.abs(arr[i])); 
         }
       }
        for(int i=0;i<arr.length;i++) {
            if(arr[i]>0){
                System.out.println("Missing number is "+(i+1)); 
            }
        }
    }
    public static void main(String[] args){
      int arr[] = { 7, 3, 4, 5, 5, 6, 2 };
      repeating_and_Missing(arr);
  
    }
}
