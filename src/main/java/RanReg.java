import com.opencsv.CSVWriter;
import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVPrinter;

import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

public class RanReg {

    public static void main(String[] args) {
        writeCSV();
    }
    public static void writeCSV() {
        File file = new File("D:\\Acceso_A_Datos\\archivo1.csv");
        try {
            FileWriter output = new FileWriter(file);
            CSVWriter csvfile = new CSVWriter(output);
            List<String[]> data = new ArrayList<>();
            data.add(new String[]{"Fecha","Random Int","Boolean"});
            for (int j = 1; j < 10001; j++) {
                data.add(new String[]{date(),(String.valueOf(random())),bool()});
            }
            csvfile.writeAll(data);
            csvfile.close();
        } catch (Exception e) {
            e.getStackTrace();
        }
    }
//random Integer value ----------------------------------------------------------------------------
    public static int random() {
        int r = (int) (Math.random() * 10000);
        return r;
    }
//date value---------------------------------------------------------------------------------------
    public static String date(){
        DateTimeFormatter d = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate now  = LocalDate.now();
    return d.format(now);
    }
//boolean value ------------------------------------------------------------------------------------
    public static String bool(){
        int r  = (int) (Math.random()*2);
        if(r==0){
            return "True";
        }else {
            return "False";
        }
    }

}
