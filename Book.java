import java.io.PrintWriter;
import java.util.Scanner;
import java.io.FileNotFoundException;
import java.io.File;

public class Book {
    private String[] book;
    private int bookLength;
    private File sorted;

    public Book()
    {
        book = null;
        bookLength = 0;
        sorted = new File("sorted.txt");
    }

    public void importBook(String s) throws FileNotFoundException
    {
        //readBook(s);
        setBookLength(s);
        book = new String[bookLength];
        makeBookArray(s);
        modifyWords();
    }

    public void readBook(String s) throws FileNotFoundException//for testing purposes
    {
        int count = 0;
        Scanner reader = new Scanner(new File(s));
        while (reader.hasNext())
        {
            System.out.println(count);
            System.out.println(reader.next());
            count ++;
           // bookLength ++;

        }
        reader.close();
    }
    public void makeBookArray(String s) throws FileNotFoundException
    {
        Scanner reader = new Scanner(new File(s));
        int i = 0;
        while (reader.hasNext())
        {
            book[i] = reader.next();
            i ++;
        }
        reader.close();
    }
    public String[] getBook()
    {
        return book;
    }
    public void modifyWords()
    {
        for(int i = 0; i < book.length; i ++)
        {
            book[i] = book[i].toLowerCase();
            book[i] = book[i].replaceAll("\\W", "");
        }
    }

    public void setBookLength(String s) throws FileNotFoundException
    {
        Scanner reader = new Scanner(new File(s));
        while (reader.hasNext())
        {
            reader.next();
            bookLength ++;

        }
        reader.close();
    }

    public int getBookLength()
    {
        return bookLength;
    }


    public void printBookArray()
    {
        for(String s: book)
        {
            System.out.println(s);
        }
    }

    public void lowerCase()
    {
        for(int i = 0; i < book.length; i ++)
        {
            book[i].toLowerCase();
        }
    }

    public void writeSortedBook() throws FileNotFoundException
    {
        PrintWriter pw = new PrintWriter(sorted);
        for(int i = 0; i < book.length; i ++)
        {
            pw.print(book[i] + " ");
            if(i > 1 && i % 12 == 0)
            {
                pw.println(" ");
            }
            if(i >= 1 && (book[i - 1].substring(0,1)).compareTo(book[i].substring(0,1)) != 0)
            {
                pw.println(" ");
            }
        }
        pw.close();
    }

}
