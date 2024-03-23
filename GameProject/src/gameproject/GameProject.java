/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package gameproject;

/**
 *
 * @author Lecturer
 */
public class GameProject {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Ability[] pokemon1Abilities = new Ability[4];
        Ability[] pokemon2Abilities = new Ability[4];
        
        pokemon1Abilities[0] = new Ability("Punch", 10, 20, "Not just a normal punch!");
        pokemon1Abilities[1] = new Ability("Kick", 10, 20, "Not just a normal kick!");
        pokemon1Abilities[2] = new Ability("Blast", 15, 15, "Amazing blast");
        pokemon1Abilities[3] = new Ability("Blaze", 20, 10, "Burn the enemy");
        pokemon1Abilities[4] = new Ability("Cloud Nine", 7, 35, "Eliminate opponent's effect");
        pokemon1Abilities[5] = new Ability("Hustle", 15, 15, "Pickpocket enemy");
        pokemon1Abilities[6] = new Ability("Hyper Cutter", 25, 8, "Cut you enemy in 2");
        pokemon1Abilities[7] = new Ability("Pure Power", 65, 1, "A hit in its parts!");
        pokemon1Abilities[8] = new Ability("Shadow Attack", 20, 15, "Low blow in the ribs.");
    }
    
}
