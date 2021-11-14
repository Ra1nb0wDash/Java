package ru.mirea.Practice1.First;

public class Book {
    private int numPages;
    private String name;
    public Book (int nP, String n)
    {
        numPages = nP;
        name = n;
    }
    public Book (String n)
    {
        numPages = 99;
        name = n;
    }
    public Book ()
    {
        numPages = 99;
        name = "Just Good book";
    }
    public int getNumPages()
    {
        return numPages;
    }
    public String getName()
    {
        return name;
    }
    public String toString(){
        return "This is "+this.name+". Number of pages - "+this.numPages;
    }
}
