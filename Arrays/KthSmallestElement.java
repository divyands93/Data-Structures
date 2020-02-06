public class KthSmallestElement {
   static int partition(int a[], int low, int high){
       int i= low-1;int temp;
       int pivot = a[high];
      for(int j=low;j<high;j++){
          if(a[j]<pivot) {
              
              i++;
              temp = a[i];
              a[i]=a[j];
              a[j]=temp;
          }
      }
      temp=a[i+1];
      a[i+1]=a[high];
      a[high]= temp;
      return i+1;
   }


    static void kthsmallest(int arr[], int n, int k) {
        int start = 0;
        int end = n-1;
        while(end>=0 && start<n){
             int pivot = partition(arr, start, end);
             if(pivot+1 == k){
                 System.out.print(arr[pivot]+" ");
                 break;
             }
             if(pivot > k){
                 end = pivot-1;
             } else  {
                 start = pivot+1;
             }
        }
    }
    //uses quick select alogirthm 
    public static void main(String args[]) {
      int arr[] = new int[] {7, 10, 4, 3, 20, 15};
      int n = arr.length;
      int k = 3;
      kthsmallest(arr, n, k );
    }
}
