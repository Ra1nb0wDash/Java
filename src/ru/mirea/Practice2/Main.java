package ru.mirea.Practice2;
import ru.mirea.Practice2.Classes.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("Testing Author");
        Author author = new Author("Anton", "OldMail+@yandex.ru", 'm');
        System.out.println(author.getEmail());
        System.out.println(author.getName());
        System.out.println(author.getGender());
        author.setEmail("NewMail+@yandex.ru");
        System.out.println(author.getEmail());
        System.out.println(author.toString());

        System.out.println();

        System.out.println("Testing ball");
        Ball ball = new Ball(4,8);
        System.out.println(ball.getX());
        System.out.println(ball.getY());
        ball.setXY(2,2);
        System.out.println(ball.toString());
        ball.move(-3, -5);
        System.out.println(ball.toString());
        ball.move(12,156);
        System.out.println(ball.toString());
    }
}