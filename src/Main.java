public class Main {
    public static void main(String args[]) {
        System.out.println(f(1));
        System.out.println(f(2));
        System.out.println(f(3));
        System.out.println(f(4));


    }
    public static int f(int n)
    {
        if (n == 0)
        {
            return 1;
        }
        else
        {

            return -5*(f(n-1)) + 2;
        }
    }
}


