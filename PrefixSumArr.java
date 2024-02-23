import java.util.Scanner;

public class PrefixSumArr {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter range:");
        int a = obj.nextInt();
        int b = obj.nextInt();
    int arr[] = new int[]{1,2,3,4,5,6,7,8,9};
    for(int i=1;i<arr.length;i++){
        arr[i] = arr[i-1] + arr[i];
        if(b == i) break;
    } 
    int x=0;
    if(a != 0){
     x = arr[b]-arr[a];
    }else
    {
        x=arr[b];
    }
    System.out.println("a:" + a);
    System.out.println("b:" + b);
    System.out.println("x:" + x);
}
}
