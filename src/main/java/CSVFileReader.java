import com.opencsv.CSVParserBuilder;
import com.opencsv.CSVReader;
import com.opencsv.CSVReaderBuilder;
import com.opencsv.exceptions.CsvValidationException;

import java.io.*;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.LinkedList;
import java.util.Locale;

public class CSVFileReader {
    private LinkedList<Employee> employeeList;

    public CSVFileReader(String csvFilePath, char separator) throws FileNotFoundException {
        int departmentID = 0;
        DateFormat dateFormat = new SimpleDateFormat("dd.MM.yyyy", Locale.ENGLISH);
        employeeList = new LinkedList<>();
        //loading the file from the resources folder
        try (InputStream in = CSVFileReader.class.getClassLoader().getResourceAsStream(csvFilePath);
             CSVReader reader = in == null ? null :
                     new CSVReaderBuilder(new InputStreamReader(in)).withCSVParser
                             (new CSVParserBuilder().withSeparator(separator).build()).withSkipLines(1).build()) {
            if (reader == null) {
                throw new FileNotFoundException(csvFilePath);
            }
            String[] nextLine;
            while ((nextLine = reader.readNext()) != null) {
                Employee employee = new Employee(
                        Integer.parseInt(nextLine[0]),
                        String.valueOf(nextLine[1]),
                        String.valueOf(nextLine[2]),
                        new Department(++departmentID, String.valueOf(nextLine[4])),
                        Integer.parseInt(nextLine[5]),
                        dateFormat.parse(nextLine[3])
                );
                employeeList.add(employee);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (CsvValidationException e) {
            throw new RuntimeException(e);
        } catch (ParseException e) {
            throw new RuntimeException(e);
        }
    }
    public void viewReadInformation(){
        for (Employee employee: employeeList) {
            System.out.println(employee.toString());
        }
    }
}
