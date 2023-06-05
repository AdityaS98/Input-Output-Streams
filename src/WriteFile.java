package com.filereadwrite;


import java.io.*;
import java.util.Scanner;
public class WriteFile {
    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        BufferedReader br1 = new BufferedReader(new InputStreamReader(System.in));
        BufferedReader br2 = new BufferedReader(new InputStreamReader(System.in));
        BufferedReader br3 = new BufferedReader(new InputStreamReader(System.in));



        System.out.println("enter person1 information");
        System.out.println("Enter first name");
        String firstName = sc.next();
        System.out.println("Enter last name");
        String lastName = sc.next();
        System.out.println("Enter address");
        String address = sc.next();
        System.out.println("Enter city");
        String city = br.readLine();
        System.out.println("Enter state");
        String state = br.readLine();
        System.out.println("Enter zip");
        int zip = br.read();
        System.out.println("Enter phone number");
        String phoneNumber = sc.next();
        System.out.println("Enter email");
        String email = sc.next();

        Contact1 p1 = new Contact1(firstName,lastName,address,city,state,zip,phoneNumber,email);

        System.out.println("enter person2 information");
        System.out.println("Enter first name");
        String firstName1 = sc.next();
        System.out.println("Enter last name");
        String lastName1 = sc.next();
        System.out.println("Enter address");
        String address1 = sc.next();
        System.out.println("Enter city");
        String city1 = sc.next();
        System.out.println("Enter state");
        String state1 = br2.readLine();
        System.out.println("Enter zip");
        int zip1 = br1.read();
        System.out.println("Enter phone number");
        String phoneNumber1 = sc.next();
        System.out.println("Enter email");
        String email1 = sc.next();

        Contact1 p2 = new Contact1(firstName1,lastName1,address1,city1,state1,zip1,phoneNumber1,email1);

        System.out.println("enter person3 information");

        System.out.println("Enter first name");
        String firstName2 = sc.next();
        System.out.println("Enter last name");
        String lastName2 = sc.next();
        System.out.println("Enter address");
        String address2 = sc.next();
        System.out.println("Enter city");
        String city2 = sc.next();
        System.out.println("Enter state");
        String state2 = sc.next();
        System.out.println("Enter zip");
        int zip2 = br2.read();
        System.out.println("Enter phone number");
        String phoneNumber2 = sc.next();
        System.out.println("Enter email");
        String email2 = sc.next();

        Contact1 p3 = new Contact1(firstName2,lastName2,address2,city2,state2,zip2,phoneNumber2,email2);

        System.out.println("enter person4 information");

        System.out.println("Enter first name");
        String firstName3 = sc.next();
        System.out.println("Enter last name");
        String lastName3 = sc.next();
        System.out.println("Enter address");
        String address3 = sc.next();
        System.out.println("Enter city");
        String city3 = sc.next();
        System.out.println("Enter state");
        String state3 = sc.next();
        System.out.println("Enter zip");
        int zip3 = br2.read();
        System.out.println("Enter phone number");
        String phoneNumber3 = sc.next();
        System.out.println("Enter email");
        String email3 = sc.next();

        Contact1 p4 = new Contact1(firstName3,lastName3,address3,city3,state3,zip3,phoneNumber3,email3);

        try {

            File filepath = new File("C:\\Users\\DELL\\Demotxt.1");

            /*
             * Object output stream will write object in file
             */
            ObjectOutputStream fileWriter = new ObjectOutputStream( new FileOutputStream(filepath));


            fileWriter.writeObject(p1);
            fileWriter.writeObject(p2);
            fileWriter.writeObject(p3);
        }
        catch(IOException e) {
            System.out.println("some error");
            e.printStackTrace();
            throw new RuntimeException(e);
        }
    }

}
