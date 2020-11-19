package org.example;

import com.google.gson.Gson;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        String json = "";

        try {
            BufferedReader lectorJson = new BufferedReader(new FileReader("file.json"));

            String linea = "";
            while( (linea = lectorJson.readLine()) != null ){
                json += linea;
            }


        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println(json);

        Gson gson = new Gson();
        persona p = gson.fromJson(json, persona.class);

        p.setEdad(35); // Cambiar edad en el objeto persona

        System.out.println(p);
    }
}
