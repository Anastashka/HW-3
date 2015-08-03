package GuessTheNumber;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Random;
import java.util.Scanner;
import java.util.SortedMap;

public class Number {
    private int number;
    private int nubmerGuess;

    public Number(int number, int nubmerGuess){
        this.number = number;
        this.nubmerGuess = nubmerGuess;
    }

    public int getNumber(){
        return number;
    }
    public void setNubmerGuess(int nubmerGuess){
        this.nubmerGuess = nubmerGuess;
    }

    public int guess(int nubmerGuess){
        if(nubmerGuess < number){

            System.out.println("Number is too small!! Try again");
            return 1;
        }
        if (nubmerGuess > number){
            System.out.println("Number is too large!! Try again");
            return 2;
        }
        if (number == nubmerGuess){
            System.out.println("Congratulations! You win!");
            return 3;
        }
        return 0;


    }

    public static void main(String[] args) throws IOException {
        Random random = new Random();
        int numberRand = random.nextInt(100-1) + 1;
        int nubmerGuess;

        Scanner sc = new Scanner(System.in);

        System.out.println("Guess the number!! Enter the number: ");
        nubmerGuess = sc.nextInt();

        Number a = new Number(numberRand, nubmerGuess);

        int check;
        do{
            check = a.guess(nubmerGuess);
            System.out.println("Enter the number: ");
            nubmerGuess =  sc.nextInt();

        }while(check!=3);
    }
}
