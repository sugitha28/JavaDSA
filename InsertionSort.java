import java.util.Arrays;
import java.util.Scanner;

public class InsertionSort {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int size=sc.nextInt();
        int[] a= new int[size];
        for (int i = 0; i < a.length; i++) {
            System.out.println("Enter the A["+i+"] Element=");
            a[i]=sc.nextInt();
        }
        int[] b=insertion(a);
        System.out.println(Arrays.toString(b));
    }
    static int[] insertion(int[] a){
        for(int i=0;i<a.length-1;i++){
            for(int j=i+1;j>0;j--){
                if(a[j]<a[j-1]){
                    swap(j,j-1,a);
                }
            }
        }
    return a;
    }
    static void swap(int c,int b ,int[] a){
        int temp;
        temp=a[c];
        a[c]=a[b];
        a[b]=temp;
    }
}
