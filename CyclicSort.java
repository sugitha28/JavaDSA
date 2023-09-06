import java.util.Arrays;
import java.util.Scanner;

public class CyclicSort {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int size=sc.nextInt();
        int[] a= new int[size];
        for (int i = 0; i < a.length; i++) {
            System.out.println("Enter the A["+i+"] Element=");
            a[i]=sc.nextInt();
        }
        int[] b=cyclic(a);
        System.out.println(Arrays.toString(b));
    }
    static int[] cyclic(int[] a){
        int i=0;
        while(i<a.length){
            int b=a[i];
            if(b!=a[b-1]){
                swap(a,i,b);
            }
            else{
                i++;
            }
        }
        return a;
    }
    static void swap(int[] a,int i,int b){
        int temp;
        temp=a[i];
        a[i]=a[b-1];
        a[b-1]=temp;
    }
}
