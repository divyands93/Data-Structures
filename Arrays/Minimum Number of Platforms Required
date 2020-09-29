import java.util.*; 
import java.lang.*; 
import java.io.*; 
public class MinPlatforms { 
    static int findPlatform(int[] arr, int[] dep, int n){
        int max_platforms = 1, needed_platforms = 1;
        int i = 1, j = 0;
        while(i<n && j<n) {
            if(dep[j] >= arr[i]) {
                max_platforms++;
                if(needed_platforms < max_platforms) {
                     needed_platforms = max_platforms;
                }
                i++;
            } else {
                max_platforms--;
                j++;
            }
        }
          return needed_platforms;
    }
    
    public static void main(String[] args) throws java.lang.Exception {
        int arr[] = {900, 940, 950, 1100, 1500, 1800}; 
        int dep[] = {910, 1200, 1120, 1130, 1900, 2000}; 
        int n = arr.length; 
        System.out.println("Minimum Number of Platforms Required = "
                        + findPlatform(arr, dep, n)); 
    }
    
}
