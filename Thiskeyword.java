class thiskeyword
{
    int n1=0,n2=0;
    thiskeyword()
    {

    }
    thiskeyword(int num1,int num2)
    {
        this.n1=num1;
        this.n2=num2;
    }
    public static void main (String a[])
    {
        thiskeyword pr7=new thiskeyword(200,500);
        pr7.printvalues();
    }
    private void printvalues()
    {
        System.out.println("Value of n 1 :"+n1+ "n 2 :"+n2);
    }
}
