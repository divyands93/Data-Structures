import java.util.*;
public class Largest_Sum_Contiguous {
    static void largest_Sum_Contiguous(int arr[]) {
        int max_so_far=Integer.MIN_VALUE;
        int max_ending_here = 0, start=0, end=0, s=0;
       for(int i=0;i<arr.length;i++) {
            max_ending_here = max_ending_here+arr[i];
            if(max_ending_here < 0) {
                max_ending_here =0;
                s=i+1;
            }
            else if(max_ending_here > max_so_far) {
                max_so_far = max_ending_here;
                end =i;
                start = s;
            }
        }
        System.out.println("Largest Sum Contiguous Subarray starts from index "+start+" ends at "+end+" max sum is "+ max_so_far);
    }
    public static void main(String[] args){
      int arr[] = {-2, -3, 4, -1, -2, 1, 5, -3}; 
      largest_Sum_Contiguous(arr);
    }
}
