import java.util.*;
public class BubbleSort {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int size=sc.nextInt();
        int[] b= new int[size];
        for (int i = 0; i < b.length; i++) {
            System.out.println("Enter the A["+i+"] Element=");
            b[i]=sc.nextInt();
        }
        int[] c=sort(b,size);
        System.out.println(Arrays.toString(c));
    }
    static int[] sort(int[] a,int n){
        int temp;
        boolean sort=false;
        for(int i=0;i<a.length;i++){
            for(int j=1;j< a.length-i;j++){
                if(a[j]<a[j-1]){
                    temp=a[j];
                    a[j]=a[j-1];
                    a[j-1]=temp;
                    sort=true;
                }
            }
            if(!sort){
                break;
            }
        }
        return a;
    }
}
