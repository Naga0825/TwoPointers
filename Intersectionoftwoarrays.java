import java.util.*;
class array{
    public static void main(String[] args){
        int[] a={1,2,3,4,5};
        int[] b={1,3,4,6,7,8}; 
        int[] c=new int[a.length+b.length];
        int i=0;
        int j=0;
        int k=0;
        while(i<a.length&&j<b.length){
            if(a[i]==b[j]){
                c[k]=a[i];
                k++;
                i++;
                j++;
            }
            else if(a[i]<b[j]){
                i++;
            }
            else{
                j++;
            }
        }
        System.out.println(Arrays.toString(Arrays.copyOfRange(c,0,k)));
    }
}
