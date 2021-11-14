package ru.mirea.Practice1;

public class Main {
        public static void main(String[] args)
        {
            Dog bobbic = new Dog("Doberman",12);
            Dog morglen = new Dog("Husky");
            Dog anton = new Dog();
            System.out.println(bobbic.toString());
            System.out.println(morglen.toString());
            System.out.println(anton.toString());

            System.out.println();

            Ball b1 = new Ball("Football", "Black");
            Ball b2 = new Ball("Tennis");
            Ball b3 = new Ball();
            System.out.println(b1.toString());
            System.out.println(b2.getTypeOfSport());
            System.out.println(b3.getColor());

            System.out.println();

            Book bk1 = new Book(1000, "The Witcher");
            Book bk2 = new Book("C++ for babies");
            Book bk3 = new Book();
            System.out.println(bk1.toString());
            System.out.println(bk2.getName());
            System.out.println(bk3.getNumPages());
        }
}
