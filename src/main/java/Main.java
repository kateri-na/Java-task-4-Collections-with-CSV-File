import java.io.FileNotFoundException;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        CSVFileReader fileReader = new CSVFileReader("foreign_names.csv",';');
        fileReader.viewReadInformation();
    }
}
