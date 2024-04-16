import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
@RunWith(JUnit4.class)
public class CSVFileReaderTest {
    @Test
    public void checkFileRead() throws java.io.FileNotFoundException{
        int expected = 25898;
        CSVFileReader fileReader = new CSVFileReader("foreign_names.csv",';');
        Assert.assertEquals(expected,fileReader.getEmployeeList().size());
    }
}