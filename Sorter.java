public class Sorter {
    public void insertionSort(String[] s)
    {
        String temp = null;
        for(int i = 1; i < s.length; i++)
        {
            temp = s[i];
            int count = i - 1;
            while(count >= 0 && s[count].compareTo(temp) > 0)
            {
                s[count  +  1] = s[count];
                count --;
            }
            s[count + 1] = temp;
        }
    }
    public void selectionSort(String[] s)
    {
        String temp = null;
        for(int i = 0; i < s.length ; i++)
        {
            int min = i;

            for(int j = i ; j < s.length; j ++)
            {
                if((s[j].compareTo(s[min])) < 0)
                {
                    min = j;

                }

            }
            if(s[i].compareTo(s[min]) != 0)
            {
                temp = s[i];
                s[i] = s[min];
                s[min] = temp;
            }

        }
    }
    public void mergeSort(String[] s)
    {
        if(s.length <= 1)
        {
            return;
        }
        String[] first = new String[s.length/2];
        String[] second = new String[s.length - first.length];
        for(int i = 0; i < first.length; i ++)
        {
            first[i] = s[i];
        }
        for(int i = 0; i < second.length; i ++)
        {
            second[i] = s[first.length - 1];
        }
        mergeSort(first);
        mergeSort(second);
        merge(first, second, s);

    }

    public void merge(String[] first, String[] second , String[] s)
    {
        int iFirst = 0;
        int iSecond = 0;
        int n = 0;

        while(iFirst < first.length && iSecond < second.length)
        {
            if(first[iFirst].compareTo(second[iSecond]) < 0)
            {
                s[n] = first[iFirst];
                iFirst ++;
            }
            else
                {
                    s[n] = second[iSecond];
                    iSecond ++;
                }
            n ++;
        }

        while(iFirst < first.length)
        {
            s[n] = first[iFirst];
            iFirst ++;
            n ++;
        }
        while (iSecond < second.length)
        {
            s[n] = second[iSecond];
            iSecond ++;
            n ++;
        }

    }
    public void bubbleSort(String[] s)
    {
        Boolean swap = true;
        String temp = null;
        while(swap)
        {
            swap = false;
            for(int j = 0 ; j < s.length - 1; j ++)
            {
                if((s[j].compareTo(s[j + 1])) > 0)
                {
                    temp = s[j];
                    s[j] = s[j + 1];
                    s[j + 1] = temp;
                    swap = true;
                }

            }

        }
    }
    public boolean binarySearch(String[] s, int lowIndex, int highIndex, String value)
    {
        int midpoint = lowIndex + (highIndex - lowIndex) / 2;
        if(!linearSearch(s, value))
        {
            return false;
        }
        if(s[midpoint].compareTo(value) == 0)
        {
            return true;
        }
        else if(s[midpoint].compareTo(value) > 0)
        {
            return binarySearch(s, midpoint + 1, highIndex, value);
        }
        else if(s[midpoint].compareTo(value) < 0)
        {
            return binarySearch(s, lowIndex, midpoint - 1, value);
        }
        return false;
    }

    public boolean linearSearch(String[] s, String key)
    {
        boolean check = false;
        for(int i = 0; i < s.length; i ++)
        {
            if(s[i].compareTo(key) == 0)
            {
                check = true;
            }
            if(check)
            {
                i = s.length;
            }
        }
        return check;
    }
    public void searchPosition(String[] s, String key)
    {
        for(int i = 0; i < s.length; i ++)
        {
            if(s[i].compareTo(key) == 0)
            {
                System.out.print("[" + i + "]");
            }

        }
    }
}
