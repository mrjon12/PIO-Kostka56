package javaapplication2.player;

import java.util.Random;

public class PlayerComp extends Player{
    
    public PlayerComp(){
        
    }
    public PlayerComp(String name){
        super(name); // przekazanie parametru do nad klasy czyli do Player. Zlecenie dla Klasy Player
    }
    
    public int guess()
    {
        Random los = new Random();
        int gracz = los.nextInt(6)+1;
        return gracz;
    }
}
