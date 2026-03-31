import java.util.Scanner;
class MinimumSizeSubarray{
    public static void main(String[] args){
        int arr[] = {2,3,1,2,4,3};
        int i=0;
        int sum=0;
        int target = 7  ;
        int min_length=Integer.MAX_VALUE;
        for(int j=0;j<arr.length;j++){
           sum+=arr[j]; 
           while(sum>=target){
             min_length=Math.min(min_length,j-i+1); 
            sum-=arr[i];
            i++;
           }
        }
       if( min_length==Integer.MAX_VALUE)
      System.out.println(0);
      else
       System.out.println(min_length);
    }
}
