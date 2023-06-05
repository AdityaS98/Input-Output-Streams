package com.filereadwrite;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class ReadJSON {
    @SuppressWarnings("unchecked")
    public static void main(String[] args) {

        /*
         * JSON parser object to parse read file
         */
        JSONParser jsonParser = new JSONParser();

        try (FileReader reader = new FileReader(""))
        {
            /*
             * To Read JSON file
             */
            Object obj = jsonParser.parse(reader);

            JSONArray addressBook =(JSONArray) obj;
            System.out.println(addressBook);

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }
}
}
