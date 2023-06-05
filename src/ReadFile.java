package com.filereadwrite;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class ReadFile {
    public static void main(String[] args) throws ClassNotFoundException {

        try {
            /*
             * To create file with path
             */
            File filepath = new File("C:\\Users\\DELL\\Demotxt.1");
            ObjectInputStream readfile = new ObjectInputStream(new FileInputStream(filepath));
            Contact1 p1 = (Contact1) readfile.readObject();
            Contact1 p2 = (Contact1) readfile.readObject();
            Contact1 p3 = (Contact1) readfile.readObject();
            Contact1 p4 = (Contact1) readfile.readObject();

            System.out.println(p1);
            System.out.println(p2);
            System.out.println(p3);
            System.out.println(p4);
        } catch (IOException e) {
            System.out.println("some error while reading file");
            e.printStackTrace();
            throw new RuntimeException(e);
        }

    }
}

