package com.binary.serachtree;
class Test116 
{ 
static final StringBuffer sb1 = new StringBuffer(); 
static final StringBuffer sb2 = new StringBuffer(); 
public static void main(String args[]) 
{ 
    new Thread() 
    {
        public void run() 
        {  
        	 sb1.append("A");
        	synchronized(sb1) 
            { 
            	sb2.append("B"); 
            } 
        } 
    }.start(); 

    new Thread() 
    { 
        public void run() 
        { 
        	sb1.append("C"); 
        	 
            synchronized(sb1) 
            { 
            	sb2.append("D"); 
            } 
        } 
    }.start(); /* Line 28 */

    System.out.println (sb1 + " " + sb2); 
    } 
}