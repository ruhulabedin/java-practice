package com.binary.serachtree;
public class Example 
{
    public static void main(String [] args) 
    {
        double values[] = {-2.3, -1.0, 0.25, 4};
        int cnt = 0;
        for (int x=0; x < values.length; x++) 
        {
            if (Math.round(values[x] + .5) == Math.ceil(values[x])) 
            {
                ++cnt;
            }
        }
        System.out.println("same results " + cnt + " time(s)");
    }
}