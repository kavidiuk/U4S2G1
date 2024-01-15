package it.epicode.be;

import java.util.Random;

public class primoEs {
    public static void main(String[]args){
        primoes();
    }
    public static void primoes() {
        try {
            int[] randNum;
            for (int i = 0; i < 10; i++) {
                int rand_int = (int) Math.floor(Math.random() * (5) + 1);
                System.out.println(rand_int);
            }
        }catch (Exception e){
            System.out.println("Errore");
        }
    }
}
