package ru.mirea.Practice1;

public class Ball {
    private String typeOfSport;
    private String color;
    public Ball()
    {
        typeOfSport = "does not belong to a particular sport";
        color = "colourful";
    }
    public Ball(String tOS)
    {
        typeOfSport = tOS;
        color = "colourful";
    }
    public Ball(String tOS, String c)
    {
        typeOfSport = tOS;
        color = c;
    }
    public String getTypeOfSport()
    {
        return typeOfSport;
    }
    public String getColor()
    {
        return color;
    }
    public String toString(){
        return this.color+' '+this.typeOfSport+" ball";
    }
}
