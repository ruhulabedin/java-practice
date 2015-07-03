package com.java.search;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class frequency_of_char
{
    public static void main(String args[])throws IOException
    {
        BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
        int ci,i,j,k,l;l=0;
        String str,str1;
        char c,ch;
        System.out.println("Enter your String");
        str=in.readLine();
        i=str.length();
        for(c='A';c<='z';c++)
        {
            k=0;
            for(j=0;j<i;j++)
            {
                ch=str.charAt(j);
                if(ch==c)
                    k++;
            }
            if(k>0)
            System.out.println("The character "+c+" has occured for "+k+" times");
        }
    }
}