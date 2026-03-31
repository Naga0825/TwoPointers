import java.util.Scanner;
import java.util.Arrays;
class Array{
    public static void main(String[] args){
        int arr[] = {1,2,0,1,0,2,1,1,1,2,2};
        int i =0;
        int j =arr.length-1;
        int k=0;
        while(k<j){
            if(arr[k]==1)
            k++;
            else if(arr[k]==0){
                int temp = arr[k];
                arr[k]=arr[i];
                arr[i]=temp;
                i++;
                k++;
            }
            else {
                int temp = arr[k];
                arr[k]=arr[j];
                arr[j]=temp;
                j--;
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
