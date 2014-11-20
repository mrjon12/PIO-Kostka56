package javaapplication2.player;

import java.util.Scanner;

public class PlayerHuman extends Player{
    
    public PlayerHuman(){
        
    }
    public PlayerHuman(String name){
        super(name); // przekazanie parametru do nad klasy Player 
    }
    
    public int guess()
    {
        Scanner input = new Scanner(System.in);
        int gracz =input.nextInt();
        return gracz;
    }
    
}
