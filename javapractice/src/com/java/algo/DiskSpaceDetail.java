package com.java.algo;

import java.io.File;

public class DiskSpaceDetail
{
    public static void main(String[] args)
    {	
    	File file = new File("D:");
    	long totalSpace = file.getTotalSpace(); //total disk space in bytes.
    	long usableSpace = file.getUsableSpace(); ///unallocated / free disk space in bytes.
    	long freeSpace = file.getFreeSpace(); //unallocated / free disk space in bytes.
 
    	System.out.println(" === Partition Detail ===");
 
    	System.out.println(" === bytes ===");
    	System.out.println("Total size : " + totalSpace + " bytes");
    	System.out.println("Space free : " + usableSpace + " bytes");
    	System.out.println("Space free : " + freeSpace + " bytes");
 
    	System.out.println(" === mega bytes ===");
    	System.out.println("Total size : " + totalSpace /1024 /1024 /1024+ " GB");
    	System.out.println("Space free : " + usableSpace /1024 /1024 /1024+ " GB");
    	System.out.println("Space free : " + freeSpace /1024 /1024 /1024+ " GB");
    }
}