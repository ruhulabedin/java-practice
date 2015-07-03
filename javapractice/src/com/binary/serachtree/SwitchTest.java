package com.binary.serachtree;
public class SwitchTest 
{  
    public static void main(String[] args) 
    {
        System.out.println("value =" + switchIt(4)); 
    } 
    public static int switchIt(int x) 
    {
        int j = 1;  
        switch (x) 
        { 
            case 1: j++; 
            case 2: j++;  
            case 3: j++; 
            case 4: j++;
            System.out.println(j=j+1);
            case 5: j++; 
            System.out.println(j=j+1);
            default: j++; 
            System.out.println(j=j+1);
            } 
        return j + x;  
    } 
}