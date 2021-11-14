package ru.mirea.Practice1;

public class Dog {
    private String dogBreed;
    private int weight;
    public Dog(String n)
    {
        dogBreed = n;
        weight = 5;
    }
    public Dog(String n, int a)
    {
        dogBreed = n;
        weight = a;

    }
    public Dog()
    {
        dogBreed = "Mongrel";
        weight = 5;
    }
    public void setDogBreed(String dogBreed)
    {
        this.dogBreed = dogBreed;
    }
    public void setWeight(int weight)
    {
        this.weight = weight;
    }
    public String getDogBreed()
    {
        return dogBreed;
    }
    public int getWeight ()
    {
        return weight;
    }
    public String toString(){
        return "Breed is "+this.dogBreed+", weight "+this.weight;
    }
}
