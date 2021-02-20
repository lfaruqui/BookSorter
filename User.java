import java.io.FileNotFoundException;
import java.util.Scanner;

public class User {
    private Sorter sort = new Sorter();
    private Book text = new Book();
    private long initial;
    private long end;

    public void selectSort(String s) throws FileNotFoundException
    {
        text.importBook(s);
        int input = 0;
        while(input != -1)
        {

            input = getInput();
            runSort(input);
            text.makeBookArray(s);
            text.modifyWords();

        }
    }

    public void runSort(int i) throws FileNotFoundException
    {
        Scanner in = new Scanner(System.in);
        String input = null;
        if(i == 1)
        {
            initial = System.currentTimeMillis();
            sort.insertionSort(text.getBook());
            end = System.currentTimeMillis();

        }
        else if(i == 2)
        {
            initial = System.currentTimeMillis();
            sort.mergeSort(text.getBook());
            end = System.currentTimeMillis();
        }
        else if(i == 3)
        {
            initial = System.currentTimeMillis();
            sort.selectionSort(text.getBook());
            end = System.currentTimeMillis();
        }
        else if(i == 4)
        {
            initial = System.currentTimeMillis();
            sort.bubbleSort(text.getBook());
            end = System.currentTimeMillis();

        }
        else if(i == 5)
        {
            System.out.println("Choose a lowercase string value to search for");
            input = in.next();
            initial = System.currentTimeMillis();
            if(sort.linearSearch(text.getBook(),input))
          {
              end = System.currentTimeMillis();
              System.out.println("The word "+ input +" was found! These are the positions");
              sort.searchPosition(text.getBook(),input);
          }
          else
              {
                  end = System.currentTimeMillis();
                  System.out.println("The word "+ input +" was not found!");
              }

        }
        else if(i == 6)
        {
            System.out.println("Choose a lowercase string value to search for");
            input = in.next();
            initial = System.currentTimeMillis();
            if(sort.binarySearch(text.getBook(), 0 , text.getBook().length,input))
           {
               end = System.currentTimeMillis();
               System.out.println("The word "+ input +" was found! These are the positions");
               sort.searchPosition(text.getBook(),input);
           }
           else
               {
                   end = System.currentTimeMillis();
                   System.out.println("The word "+ input +" was not found!");
               }
        }
        System.out.println("This took " + (end - initial) + " ms.");
    }

    public int getInput()
    {
        int choice = 0;
        Scanner in = new Scanner(System.in);
        System.out.println("Choose a sort:(Input the corresponding number)");
        System.out.println("1: InsertionSort");
        System.out.println("2: MergeSort");
        System.out.println("3: SelectionSort ");
        System.out.println("4: BubbleSort");
        System.out.println("5: LinearSearch");
        System.out.println("6: BinarySearch");
        System.out.println("Input -1 to exit.");
        choice = in.nextInt();
        return choice;
    }

    public int[] categorizeWordCount()
    {
        int[] distribution = new int[26];
        for(int i = 0; i < text.getBook().length; i ++)
        {
            if((text.getBook()[i].substring(0,1).equals("a")))
            {
                distribution[0] = distribution[0] + 1;
            }
            else if((text.getBook()[i].substring(0,1).equals("b")))
            {
                distribution[1] = distribution[1] + 1;
            }

            else if((text.getBook()[i].substring(0,1).equals("c")))
            {
                distribution[2] = distribution[2] + 1;
            }

            else if((text.getBook()[i].substring(0,1).equals("d")))
            {
                distribution[3] = distribution[3] + 1;
            }

            else if((text.getBook()[i].substring(0,1).equals("e")))
            {
                distribution[4] = distribution[4] + 1;
            }

            else if((text.getBook()[i].substring(0,1).equals("f")))
            {
                distribution[5] = distribution[5] + 1;
            }

            else if((text.getBook()[i].substring(0,1).equals("g")))
            {
                distribution[6] = distribution[6] + 1;
            }

            else if((text.getBook()[i].substring(0,1).equals("h")))
            {
                distribution[7] = distribution[7] + 1;
            }

            else if((text.getBook()[i].substring(0,1).equals("i")))
            {
                distribution[8] = distribution[8] + 1;
            }

            else if((text.getBook()[i].substring(0,1).equals("j")))
            {
                distribution[9] = distribution[9] + 1;
            }

            else if((text.getBook()[i].substring(0,1).equals("k")))
            {
                distribution[10] = distribution[10] + 1;
            }

            else if((text.getBook()[i].substring(0,1).equals("l")))
            {
                distribution[11] = distribution[11] + 1;
            }

            else if((text.getBook()[i].substring(0,1).equals("m")))
            {
                distribution[12] = distribution[12] + 1;
            }

            else if((text.getBook()[i].substring(0,1).equals("n")))
            {
                distribution[13] = distribution[13] + 1;
            }

            else if((text.getBook()[i].substring(0,1).equals("o")))
            {
                distribution[14] = distribution[14] + 1;
            }

            else if((text.getBook()[i].substring(0,1).equals("p")))
            {
                distribution[15] = distribution[15] + 1;
            }

            else if((text.getBook()[i].substring(0,1).equals("q")))
            {
                distribution[16] = distribution[16] + 1;
            }

            else if((text.getBook()[i].substring(0,1).equals("r")))
            {
                distribution[17] = distribution[17] + 1;
            }

            else if((text.getBook()[i].substring(0,1).equals("s")))
            {
                distribution[18] = distribution[18] + 1;
            }

            else if((text.getBook()[i].substring(0,1).equals("t")))
            {
                distribution[19] = distribution[19] + 1;
            }

            else if((text.getBook()[i].substring(0,1).equals("u")))
            {
                distribution[20] = distribution[20] + 1;
            }

            else if((text.getBook()[i].substring(0,1).equals("v")))
            {
                distribution[21] = distribution[21] + 1;
            }

            else if((text.getBook()[i].substring(0,1).equals("w")))
            {
                distribution[22] = distribution[22] + 1;
            }

            else if((text.getBook()[i].substring(0,1).equals("x")))
            {
                distribution[23] = distribution[23] + 1;
            }

            else if((text.getBook()[i].substring(0,1).equals("y")))
            {
                distribution[24] = distribution[24] + 1;
            }

            else if((text.getBook()[i].substring(0,1).equals("z")))
            {
                distribution[25] = distribution[25] + 1;
            }



        }
        return distribution;
    }

    public void printDistribution(int[] arr)
    {
        for(int i = 0; i < 26; i ++)
        {
            System.out.println((char)(i+97) +": "+ arr[i]);
        }
    }

}
