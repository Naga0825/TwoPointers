import java.util.Scanner;
import java.util.Arrays;
class Array{
    public static int[] twoSum(int[] arr,int target){
        int i =0;
        int j=arr.length-1;
        while(i<j){
            if(arr[i]+arr[j]==target)
            return new int[] {i+1,j+1};
            else if(target>arr[i]+arr[j])
            i++;
            else
            j--;
        }
    return null;
    }
     public static void main(String[] args) {  
        int[] arr ={2,7,11,15};
        int target = 18;
        int res[] =twoSum(arr,target);
        System.out.println(Arrays.toString(res));
    }
}
