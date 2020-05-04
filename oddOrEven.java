import java.util.Random;
import java.util.Scanner;

public class oddOrEven {
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        Random number=new Random();
        int random=number.nextInt(7);
        System.out.println("lets a play a game called odds and evens");
        System.out.println("what is your name:");
        String name=input.next();
        System.out.println("hi "+name+" which do you choose from (O)odds or (E)evens");
        String choose=input.next();
        if (choose.equalsIgnoreCase("o")){
            System.out.println(name+" picked "+choose+"dds! so the computer will be evens");

            }
        else {
            System.out.println(name+" picked "+choose+"vens! so the computer will be odds");


        }
        System.out.println("how many fingers do you put out:");
        int fingers=input.nextInt();
        System.out.println("the computer plays "+random+" fingers");
        int game=fingers+random;
        System.out.println(game);
        if (game%2==0){
            System.out.println("its even");
            if (choose.equalsIgnoreCase("e")){
                System.out.println(name+" won the game");
            }

            else {
                    System.out.println("computer won the game");
                }

        }
        else {
            if (choose.equalsIgnoreCase("o")){
                System.out.println(name+" won the game");


            }
            else {
                System.out.println("computer won the game");
            }
        }


    }
}
