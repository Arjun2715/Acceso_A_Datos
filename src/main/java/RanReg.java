import java.awt.*;
import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.opencsv.CSVWriter;

public class RanReg {
    public static void main(String[]args){

        File file = new File("D:\\Nueva carpeta\\AAD_jVera\\Actividad1\\archivo1.csv");
        try{
                FileWriter output = new FileWriter(file);
                CSVWriter csvfile = new CSVWriter(output);
            PrintWriter pw = new PrintWriter(String.valueOf(csvfile));
            List<String[]> data = new ArrayList<>();


            for (int i = 0; i < 10000; i++) {
                data.add(new String[]{String.valueOf(Math.round(Math.random()*10000)*10)});
                pw.write("hola");

            }
            csvfile.writeAll(data);
            csvfile.close();

        }catch (Exception e){
            e.getStackTrace();
        }
    }


}
