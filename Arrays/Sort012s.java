import java.util.*;
public class Sort012 {
    static void Sort012(int arr[], int low, int high) {
        int mid = 0; int temp=0;
        while(mid<=high) {
            switch(arr[mid]) {
                case 0 : temp = arr[mid];
                         arr[mid] = arr[low];
                         arr[low] = temp;
                         mid++;
                         low++;
                         break;
                case 1 : mid++;
                         break;
                case 2 : temp = arr[mid];
                         arr[mid] = arr[high];
                         arr[high] = temp;
                         high--;
                         break;
            }
        }
    }
    static void print(int arr[]) {
        for(int i=0;i<arr.length;i++)
                System.out.print(arr[i]+" ");
    }
    public static void main(String[] args){
      int arr[] = {0, 1, 1, 0, 1, 2, 1, 2, 0, 0, 0, 1};
      Sort012(arr, 0, arr.length-1);
      print(arr);
    }
}
