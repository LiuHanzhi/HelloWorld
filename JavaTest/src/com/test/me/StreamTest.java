package com.test.me;

import java.io.File;
import java.io.FileOutputStream;
import java.io.OutputStream;
import java.io.RandomAccessFile;

public class StreamTest {

  public static void main(String[] args) throws Exception {

    OutputStream os;
    RandomAccessFile raf;
    int size = 10000;
    File file = new File("test.log");

    long a=System.currentTimeMillis();
    os = new FileOutputStream(file);
    for(int i=0;i<size;i++){
      os.write(("1").getBytes());
    }
    os.close();     
    long b=System.currentTimeMillis();
    System.out.println("writing direct "+(b-a));

    raf = new RandomAccessFile(file,"rws");
    for(int i=0;i<size;i++){            
      raf.write(("1").getBytes());
    }
    raf.close();

    long c=System.currentTimeMillis();
    System.out.println("random access write "+(c-b));

    raf = new RandomAccessFile(file,"rw");
    for(int i=0;i<size;i++){            
      raf.write(("1").getBytes());
    }
    raf.close();

    long d=System.currentTimeMillis();
    System.out.println("random access optimized write "+(d-c));
  }
}