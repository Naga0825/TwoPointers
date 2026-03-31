import java.util.*;
class Array{
    public static void main(String[] args){
        int arr[] = {0,0,1,1,1,1,2,2,2,2};
        if(arr.length<2)
        System.out.println(2);
        int k =2;
        for(int i=2;i<arr.length;i++){
            if(arr[i]!=arr[k-2]){
            arr[k]=arr[i];
            k++;
            }
        }
        System.out.println(Arrays.toString(Arrays.copyOfRange(arr,0,k)));
    }
}
