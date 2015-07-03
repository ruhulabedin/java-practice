package com.binary.serachtree;
public class NFE 
{
    public static void main(String [] args) 
    {
    String s = "42";
        try 
        {
            s = s.concat(".5");  /* Line 8 */
            double d = Double.parseDouble(s);
            s = Double.toString(d);
            int x = (int) Math.ceil(Double.valueOf(s).doubleValue());
            System.out.println(x);
            double y = x;
            System.out.println(y);
            int z =(int) y;
        }
        catch (NumberFormatException e) 
        {
            System.out.println("bad number");
        }
    }
}