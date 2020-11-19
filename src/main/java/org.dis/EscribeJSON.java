//Fichero para mostrar por consola el JSON generado a partir del CSV y almacenarlo en el fichero best-golf-players.json
package org.dis;

//imports ...

import com.google.gson.Gson;
import com.sun.xml.internal.ws.server.ServerRtException;

import java.io.FileWriter;
import java.io.Writer;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class EscribeJSON {

    public static void main(String[] args) {
        List<POJO> parseaCSV("best-golf-players.csv");
        try {
            // create a map
            Map<String, Object> map = new HashMap<>();

            map.put();


            // create a writer
            Writer writer = new FileWriter("players.json");

            // convert map to JSON File
            new Gson().toJson(map, writer);

            // close the writer
            writer.close();

        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
    
 }
