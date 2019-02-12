package com.serial;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class Diplodocus implements Serializable {
	 
    private final  String s1 = "test";
    private final transient String s2;
    private final transient String s3 = new String("hello");
    private final transient String s4 = s1 + s1 + 1;
    private final transient int i1 = 7;
    private final transient int i2 = 7 * 3;
    private final transient int i3 = Integer.MIN_VALUE;
    private final transient int[] a1 = {1,2,3};
 
    public Diplodocus() {
        s2 = "s2";
    }
 
    public static void main(String[] args) {
 
        File f = new File("diplo");
        try {
            FileOutputStream fos = new FileOutputStream(f);
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(new Diplodocus());
            oos.flush();
            oos.close();
 
            FileInputStream fis = new FileInputStream(f);
            ObjectInputStream ois = new ObjectInputStream(fis);
            Diplodocus diplo = (Diplodocus) ois.readObject();
            ois.close();
            System.out.println("s1 = "+diplo.s1);
            System.out.println("s2 = "+diplo.s2);
            System.out.println("s3 = "+diplo.s3);
            System.out.println("s4 = "+diplo.s4);
            System.out.println("i1 = "+diplo.i1);
            System.out.println("i2 = "+diplo.i2);
            System.out.println("i3 = "+diplo.i3);
            System.out.println("a1 = "+diplo.a1);
 
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}