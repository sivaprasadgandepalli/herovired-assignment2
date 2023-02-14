/**
 * question1
 */
import java.util.*;
public class question1 {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the length of the array:");
        int len=sc.nextInt();
        int arr[]=new int[len];
        System.out.println("enter the elements of the array:");
        for(int i=0;i<len;i++)
        {
            arr[i]=sc.nextInt();
        }
        int pf[]=new int[len];
        pf[0]=arr[0];
        for(int i=1;i<len;i++)pf[i]=pf[i-1]+arr[i];
        System.out.println(Arrays.toString(pf));
    }
}