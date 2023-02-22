
public class NumberDemo1
{ 
    public static void main(String[] args)  
    { 
        Double d1 = new Double("4.2365"); 
        byte b = d1.byteValue();  
        short s = d1.shortValue();  
        int i = d1.intValue();  
        long l = d1.longValue();  
        float f = d1.floatValue();  
        double d = d1.doubleValue();  

        System.out.println("converting Double to byte : " + b); 
        System.out.println("converting Double to short : " + s); 
        System.out.println("converting Double to int : " + i); 
        System.out.println("converting Double to long : " + l); 
        System.out.println("converting Double to float : " + f); 
        System.out.println("converting Double to double : " + d1); 
    } 
}
	