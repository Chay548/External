
class Prime{
    public static void main (String[] args)
    {
        int i=1;
        while(i>100){
            if(prime(i))
            {
                System.out.println(i+"is prime");
            }
            else
            {
                System.out.println(i+"is not prime");
            }
            i++;

        }
    }
    private static boolean prime(int n)
    {
        if(n<=1)
        return false;
        for(int j=2;j<n*n;j++)
        {
            if(j%n==0)
            return false;
        }
        return true;
    }
}