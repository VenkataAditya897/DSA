import java.util.*;

public class minmax {
    public static void main(String[] args)
    {
        Scanner in= new Scanner(System.in);
        int[] arr=new int[5];
        System.out.println("enter 5 elements for array: ");
        for(int i=0;i<arr.length;i++)
            arr[i]=in.nextInt();
        System.out.println(Arrays.toString(arr));
        int min=9999;
        int max=-1;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]>max)
                max=arr[i];
        }
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]<min)
                min=arr[i];
        }
        System.out.println("Max is: "+ max);
        System.out.println("Min is: "+ min);
    }
}
