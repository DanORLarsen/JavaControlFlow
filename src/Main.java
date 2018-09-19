import java.util.Scanner;
import java.lang.Math;
import java.awt.*;
import java.lang.reflect.Array;
import java.util.concurrent.Future;
import java.util.Arrays;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        int Size = 13;
        boolean isBelowLimit = Size >= 2;
        boolean isAboveLimit = Size <=12;

        boolean test = (isAboveLimit && isBelowLimit);
        System.out.println(test);
System.out.println(isBelowLimit);

System.out.println("Enter age");
Scanner in = new Scanner(System.in);
int age = in.nextInt();


if (age >=0 && age <=5)
{System.out.println("baby");}
        else if (age >=6 && age <= 11)
        {System.out.println("Kid");}
        else if (age >= 12)
        {System.out.println("Adult or Teen");}


        System.out.println("While Loop");
        int y = 3;
        while(y > 0) {System.out.println("Current Y: " + y);
        y = y - 1;}
        System.out.println("Final y: " + y);

        System.out.println("");

        System.out.println("Do while loop");
        int u = 3;
        do {System.out.println("Current U: " + u);
        u = u - 1;}
        while(u > 0);
        System.out.println("Final u:" + u);

        System.out.println("");

        System.out.println("For loop");
        for(int i = 3; i > 0; i--) {System.out.println("Current i: " + i);}

        System.out.println("");


        double power = Math.pow(5, 3);
        System.out.println(power);

        double squareRoot = Math.sqrt(64);
        System.out.println(squareRoot);

        Random rand = new Random();
        int randomNumber = rand.nextInt();
        int randomNumberWithBound = rand.nextInt(10);
        System.out.println(randomNumber);
        System.out.println(randomNumberWithBound);


Coin c = new Coin(Coin.HEADS);
System.out.println("Initial: " + c.getFaceUp());
for(int p = 0; p < 10; p++) {c.flip(); System.out.println("After Flip: " + c.getFaceUp());}

Coin d = new Coin(5);
System.out.println("Initial: " + d.getFaceUp());
for(int l = 0; l < 10; l++) {d.flip(); System.out.println("After flips: " + d.getFaceUp());}

    }

}
