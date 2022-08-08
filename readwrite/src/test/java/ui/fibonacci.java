public class fibonacci
{
    public static void main(String[] args) 
    {
        {
        int a = 0;
        int b = 1;
        int c = 1;
        int count =10;
        for (int i = 1; i <= count; i++) {
            System.out.print(a + ", ");
            a = b;
            b = c;
            c = a + b;
        }   
    }
}
}
