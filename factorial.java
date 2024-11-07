class factorial{
    public static void fact(int n) {
        int fa=1;
        for(int i=1;i<n;i++)
        {
           System.out.println( fa=n*(n-i));

        }
        System.out.println("factorial="+fa);
    }
    public static void main(String[] args) {
        fact(5);
    }
}