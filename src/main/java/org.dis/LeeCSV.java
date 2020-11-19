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
import java.util.List;

// Otros imports ...

public class LeerCSV {

    public List<POJO> parseaCSV(String path) {
        ArrayList<POJO> players = CsvToBean.parse();

        try(
                Reader reader = Files.newBufferedReader(Paths.get("best-golf-player.csv"));
                CSVReader csvReader = new CSVReader(reader);
                ){

            String[] nextData;
            while((nextData = csvReader.readNext()) != null){

                players.add()
            }

        } catch (IOException | CsvValidationException e) {
            e.printStackTrace();
        }


        return players;
    }
}
