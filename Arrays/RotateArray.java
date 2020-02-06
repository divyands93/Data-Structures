import java.util.*;
public class RotateArray {
    static void reverse (int arr[], int start, int end) {
         int temp;
        while(start<end){
            temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
    static void rotateArray(int arr[], int n, int rotateFrom) {
        reverse(arr, 0, rotateFrom-1);
        reverse(arr, rotateFrom, n-1);
        reverse(arr, 0, n-1);
        for(int i=0;i<n;i++){
             System.out.print(arr[i]+" ");
        }
    }
    public static void main(String args[]) {
      int arr[] = new int[] {2, 4, 6, 8, 10, 12, 14, 16, 18, 20};
      int n = arr.length;
      int rotateFrom = 3;
      rotateArray(arr, n, rotateFrom );
    }
}
