package com.binary.serachtree;
public class ObjComp 
{
    public static void main(String [] args ) 
    {
        int result = 0;
        ObjComp oc = new ObjComp();
        Object o = oc;

        if (o == oc)  
            result = 1;
        if (o != oc)  
            result = result + 10;
        if (o.equals(oc) )  
            result = result + 100;
        if (oc.equals(o) )  
            result = result + 1000;

        System.out.println("result = " + result);
    }
}