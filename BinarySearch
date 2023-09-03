import java.util.Scanner;
public class BinarySearch {
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
        binary(b,target);
    }

    static void binary(int[] a,int target){
        if(a[0]>a[a.length-1]){
            System.out.println(DESsearch(a,target));
        }
        else{
            System.out.println(ASCsearch(a,target));
        }
    }
    static int DESsearch(int[] a,int target){
        int start=0;
        int end=a.length-1;
        while(start<=end){
            int mid=start+(end-start)/2;
            if(target<a[mid]){
                start=mid+1;
            }
            else if(target>a[mid]){
                end=mid-1;
            }
            else{
                return mid;
            }
        }
        return -1;
    }
    static int ASCsearch(int[] a,int target){
        int start=0;
        int end=a.length-1;
        while(start<=end){
            int mid=start+(end-start)/2;//what if start plus end exceeds the total integer
            if(target<a[mid]){
                end=mid-1;
            }
            else if(target>a[mid]){
                start=mid+1;
            }
            else {
                return mid;
            }
        }
        return -1;
    }
}
