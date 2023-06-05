package com.filereadwrite;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
public class WriteJSON {
    public static <JSONObject> void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        BufferedReader br1 = new BufferedReader(new InputStreamReader(System.in));
        BufferedReader br2 = new BufferedReader(new InputStreamReader(System.in));
        // Taking Input
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
        String phoneNumber = br2.readLine();
        System.out.println("Enter email");
        String email = sc.next();

        JSONObject person = new JSONObject();

        person.put("First Name",firstName);
        person.put("Last Name",lastName);
        person.put("Adderess",address);
        person.put("City",city);
        person.put("State",state);
        person.put("Zip",zip);
        person.put("Phone Number",phoneNumber);
        person.put("Email",email);


        JSONArray addressBook = new JSONArray();
        addressBook.add(person);


        try (FileWriter file = new FileWriter("C:\\Users\\DELL\\Demotxt.1.jason")) {

            file.write(addressBook.toJSONString());
            System.out.println("Jason file created successfully");
            file.flush();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
