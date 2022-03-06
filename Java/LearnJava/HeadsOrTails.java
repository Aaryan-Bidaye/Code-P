package Java.LearnJava;

import java.util.Random;

public class HeadsOrTails {
    public static void main(String [] args) {
        Random rand = new Random ();
        int int_random = rand.nextInt(2);

        if(int_random == 1){
            System.out.println("Heads");
        }
        if(int_random == 0){
            System.out.println("Tails");
        }
    }
        
}

