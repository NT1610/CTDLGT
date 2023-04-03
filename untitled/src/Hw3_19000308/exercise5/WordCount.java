package Hw3_19000308.exercise5;

public class WordCount {
    private String word;
    private int count;

    public WordCount(String w)
    {
        word = w;
        count = 1;
    }

    public WordCount(String w , int c)
    {
        word = w;
        count = c;
    }


    public int getCount()
    {
        return count;
    }
    public String getWord()
    {
        return word;
    }

    public void upCount()
    {
        count++;
    }

    public String toString()
    {
        String str ="["+word+"; "+count+"]";
        return str;
    }

    public WordCount clone()
    {
        return new WordCount(word, count);
    }

    public boolean equals(Object o)
    {
        if(o == null)
            return false;
        if( o == this)
            return true;
        if(o instanceof WordCount)
        {
            WordCount o1 = (WordCount) o;
            if(o1.word.compareTo(word) == 0)
                return true;
            else
                return false;
        }

        return false;
    }

}

