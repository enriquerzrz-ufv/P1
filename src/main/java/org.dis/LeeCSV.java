// lectura del fichero csv mediante el objeto plano y su carga en una lista de objetos de este tipo
package org.dis;

import com.opencsv.CSVReader;
import com.opencsv.bean.CsvToBean;
import com.opencsv.bean.CsvToBeanBuilder;
import com.opencsv.exceptions.CsvValidationException;

import java.io.IOException;
import java.io.Reader;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

// Otros imports ...

public class LeerCSV {

    public static void leer_csv(String path) {
        List<POJO> players = CsvToBean.parse();
        POJO p = new POJO();

        try(
                Reader reader = Files.newBufferedReader(Paths.get(path);
                CSVReader csvReader = new CSVReader(reader);
                ){

            String[] nextData;

            while ((nextData = csvReader.readNext()) != null) {

                p.setPosicion(nextData[0]);
                p.setNombre(nextData[1]);
                p.setApellido(nextData[2]);
                p.setPais(nextData[3]);
                p.setEdad(nextData[4]);

                players.add(p);
            }

        } catch (IOException | CsvValidationException e) {
            e.printStackTrace();
        }

    }
}
