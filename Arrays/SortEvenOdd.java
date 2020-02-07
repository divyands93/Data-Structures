import java.util.*;
public class SortEvenOdd {
    static void SortEvenOdd(int arr[], int low, int high) {
        int temp=0;
        while(low<high) {
            while(arr[low]%2==0 && low<high) {
                low++;
            }
            while(arr[high]%2==1 && low<high) {
                high--;
            }
            if(low<high){
                temp = arr[low];
                arr[low] = arr[high];
                arr[high] = temp;
            }
        }
    }
    static void print(int arr[]) {
        for(int i=0;i<arr.length;i++)
                System.out.print(arr[i]+" ");
    }
    public static void main(String[] args){
      int arr[] = {12, 34, 45, 9, 8, 90, 3};
      SortEvenOdd(arr, 0, arr.length-1);
      print(arr);
    }
}
