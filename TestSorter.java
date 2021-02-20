import java.io.FileNotFoundException;
public class TestSorter {
    public static void main(String[] args) throws FileNotFoundException  {
       User person = new User();
       person.selectSort("1984.txt");
    }
}
