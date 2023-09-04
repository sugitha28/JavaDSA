import java.util.Arrays;
import java.util.Scanner;

public class SelectionSort {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int size=sc.nextInt();
        int[] b= new int[size];
        for (int i = 0; i < b.length; i++) {
            System.out.println("Enter the A["+i+"] Element=");
            b[i]=sc.nextInt();
        }
        int[] c =sorting(b);
        System.out.println(Arrays.toString(c));

    }
    static  int[] sorting(int[] a){
        int maxInd;
        for(int i=0;i<a.length;i++)
        {
            maxInd=selecting(0,a,a.length-i-1);
            swapping(maxInd,a,a.length-i-1);
        }
        return a;
    }

    static void swapping(int ind,int[] a,int end){
        int temp;
        temp=a[ind];
        a[ind]=a[end];
        a[end]=temp;
    }
    static  int selecting(int start,int[] a,int end){
        int max=start;
        for(int i=start;i<=end;i++){
            if(a[max]<a[i]){
                max=i;
            }
        }
        return max;
    }
}
