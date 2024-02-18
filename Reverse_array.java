import java.util.*;
public class Reverse_array {
    public static void main(String[] args)
    {
        Scanner in=new Scanner(System.in);
        int[] arr=new int[5];
        System.out.println("Enter 5 array elements: ");
        for(int i=0;i<5;i++)
            arr[i]=in.nextInt();
        System.out.println(Arrays.toString(arr));
        reverse(arr);
    }
    public static void reverse(int arr[])
    {
        int start=0;
        int end=arr.length-1;
        while(start<end)
        {
            int temp=arr[start];
            arr[start]=arr[end];
            arr[end]=temp;
            start++;
            end--;
        }
        System.out.println(Arrays.toString(arr));

    }
}
