import java.util.Scanner;
public class problem04 {
    public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
        String input=sc.nextLine();
        String reversed=reverse(input);
        System.out.println("reversed string is:"+reversed);
        if(ispallindrome(input))
            System.out.println("The string is pallindrome");
        else
            System.out.println("The string is not pallindrome");
        char ch=sc.next().charAt(0);
        int count=characteroccurance(input,ch);
        System.out.println("character occurs "+count+" times");
    }
    public static String reverse(String str)
    {
        StringBuilder sb=new StringBuilder(str);
        return sb.reverse().toString();
    }
    public static boolean ispallindrome(String str)
    {
        String reversed=reverse(str);
        return str.equalsIgnoreCase(reversed);
    }
    public static int characteroccurance(String str,char ch)
    {
        int count=0;
        for(char c:str.toCharArray())
        {
            if(c==ch)
                count++;
        }
        return count;
    }
}
