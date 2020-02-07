import java.util.*;
public class LargestSubArray {
    static int findSubArray(int arr[]) {
       int sum =0, maxlen=0;
       HashMap<Integer, Integer> hm = new HashMap<Integer,Integer>();
       
       for(int i=0;i<arr.length;i++) {
           sum = sum + (arr[i]==0?-1:1);
           if(hm.containsKey(sum)) {
                maxlen = Math.max(maxlen, i-hm.get(sum));
           } else {
                hm.put(sum, i);
           }
           
       }
       return maxlen;
    }
    public static void main(String[] args){
      int arr[] = {1, 0, 0, 1, 0, 1, 1};
      int maxlen = findSubArray(arr);
        System.out.print(maxlen);
    }
}
