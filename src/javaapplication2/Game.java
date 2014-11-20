package javaapplication2;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import javaapplication2.player.Player;

public class Game {
    
    private List<Player> players = new ArrayList<>();
    
    private Player player;
    
    public void addPlayer(Player player)
    {
        if(player != null){
             for (Player p: players){
               if(p.getName()==player.getName())
               {
                   player.setName(player.getName()+"1");
               }

            }
            this.player = player; 
            players.add(player);
            
            
           
         

        } else {
            throw new IllegalArgumentException("Gracz nie może być pusty");
        }
    }

    public void start()
    {
        boolean test = true;
        while(test == true)
        {
            Random los = new Random();
            int kostka = los.nextInt(6)+1;
            System.out.println("kostka: " + kostka);
            
            for (Player p: players){
                System.out.println(p.getName());
                int guess = p.guess();
                
                if(kostka == guess)
                {
                    test = false;
                    System.out.println("Brawo udało się graczowi " +p.getName() + " wybral " +guess);
                }
                else
                    System.out.println("Niestety nie udało się " + guess); 
                
            }      
        }
    }
}


