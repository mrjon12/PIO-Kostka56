/*
 * To change this template, choose Tools | Templates
 * !!!!!!!!!!!!!!!!!!!!github.com/ioResources!!!!!!!!!!!!!!!!!!!!!!
 */
package javaapplication2;

import javaapplication2.player.PlayerHuman;
import javaapplication2.player.PlayerComp;
import javaapplication2.player.Player;
import java.util.Random;

/**
 *
 * @author Student
 */
public class JavaApplication2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Game game = new Game();
        
        Player player = new PlayerComp("Komputer");
        Player player1 = new PlayerComp("Komputer");
         Player player2 = new PlayerComp("Komputer");
        game.addPlayer(player);
        game.addPlayer(player1);
        game.addPlayer(player2);
        game.addPlayer(new PlayerHuman("ja"));
        
        game.start();
        
        

    }
}
