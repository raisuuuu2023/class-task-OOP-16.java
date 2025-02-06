import java.util.Scanner;
public class practiceprblm03 {
    public static int greatest(int[] array,int size)
    {
        int g=array[0];
        for(int i=0;i<size;i++)
        {
            if(g<array[i])
                g=array[i];
        }
        return g;
    }
    public static boolean isprime(int num)
    {
        if(num<=1)
            return false;
        for(int i=2;i<=Math.sqrt(num);i++)
        {
            if(num%i==0)
                return false;
        }
        return true;
    }
    public static int[] reversearray(int arr[],int size)
    {
        int n= arr.length;
        int[] reversed=new int[n];
        for(int i=0;i<n;i++)
        {
            reversed[i]=arr[n-1-i];
        }
        return reversed;
    }
    public static void main(String[] args)
    {
        Scanner s=new Scanner(System.in);
        int size=s.nextInt();
        int[] array=new int[size];
        for(int i=0;i<size;i++)
        {
            array[i]=s.nextInt();
        }
        int g=greatest(array,size);
        System.out.println(g);
        int num=s.nextInt();
        if(isprime(num))
            System.out.println(num + " is a prime number");
        else
            System.out.println(num + " is not a prime number");
        int[] reversedseries=reversearray(array,size);
        for(int i=0;i<size;i++)
        {
            System.out.print(reversedseries[i]+" ");
        }
    }
}
