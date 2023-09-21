public class Operator
{
    public static void main(String args[])
    {
        String a = "abcd";
        int n = 123,count = 0;
        do
        {                
            System.out.print(count);
            if(count%3==0)
            {
                System.out.print(" ");
                System.out.println(a+n);
            }
            count++;
        }while(count<10);
    }
}