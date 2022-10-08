import com.opencsv.CSVWriter;
import java.io.File;
import java.io.FileWriter;
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
                //data.add(new String[]{date(),(String.valueOf(random())),bool()}); //for today's date only
                data.add(new String[]{String.valueOf(createRandomDate(1900,2022)),(String.valueOf(random())),bool()});//for a random date
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
//date value(today's date)---------------------------------------------------------------------------------------
    /*public static String date(){
        DateTimeFormatter d = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate now  = LocalDate.now();
    return d.format(now);
    }*/
    //random date
    public static int createRandomIntBetween(int start, int end) {
        return start + (int) Math.round(Math.random() * (end - start));
    }
    public static LocalDate createRandomDate(int startYear, int endYear) {
        int day = createRandomIntBetween(1, 28);
        int month = createRandomIntBetween(1, 12);
        int year = createRandomIntBetween(startYear, endYear);
        return LocalDate.of(year, month, day);
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
