package com.binary.serachtree;
interface Foo141 
{ 
    int k = 0; /* Line 3 */
} 
public class Test141 implements Foo141 
{
    public static void main(String args[]) 
    {
        int i; 
        Test141 test141 = new Test141(); 
        i = test141.k; /* Line 11 */
        i = Test141.k; 
        i = Foo141.k; 
    } 
}