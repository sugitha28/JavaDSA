import java.util.Scanner;

public class CeilingArray {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int size=sc.nextInt();
        int[] b= new int[size];
        for (int i = 0; i < b.length; i++) {
            System.out.println("Enter the A["+i+"] Element=");
            b[i]=sc.nextInt();
        }
        System.out.println("Enter the Target of the array");
        int target=sc.nextInt();
        int ans=binary(b,target);
        System.out.println("THE CEILING OF THE ARRAY= "+ans);
    }
    static int binary(int[] b,int a){
        int end=b.length-1;
        int start=0;
        while(start<=end){
            int mid=start+(end-start)/2;
            if(a>b[mid]){
                start=mid+1;
            }else if(a<b[mid]){
                end=mid-1;
            }
            else{
                return mid;
            }
        }
        return b[start];
    }
}
