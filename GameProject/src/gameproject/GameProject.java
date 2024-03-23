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
        Ability2[] pokemon1Abilities = new Ability2[4];
        Ability2[] pokemon2Abilities = new Ability2[4];
        
        pokemon1Abilities[0] = new Ability2("Punch", 10, 20, "Not just a normal punch!");
        pokemon1Abilities[1] = new Ability2("Kick", 10, 20, "Not just a normal kick!");
        pokemon1Abilities[2] = new Ability2("Blast", 15, 15, "Amazing blast");
        pokemon1Abilities[3] = new Ability2("Blaze", 20, 10, "Burn the enemy");
//        pokemon1Abilities[4] = new Ability2("Cloud Nine", 7, 35, "Eliminate opponent's effect");
        pokemon2Abilities[0] = new Ability2("Hustle", 15, 15, "Pickpocket enemy");
        pokemon2Abilities[1] = new Ability2("Hyper Cutter", 25, 8, "Cut you enemy in 2");
        pokemon2Abilities[2] = new Ability2("Pure Power", 65, 1, "A hit in its parts!");
        pokemon2Abilities[3] = new Ability2("Shadow Attack", 20, 15, "Low blow in the ribs.");
        
        Pokemon pikachu = new Pokemon("Pikachu", 100, pokemon1Abilities);
        Pokemon charmander = new Pokemon("Charmander", 100, pokemon2Abilities);
        System.out.println("Char health before: " + charmander.getRemainingHealth());
        pikachu.getAbilities()[3].activate(charmander);
        System.out.println("Char health after: " + charmander.getRemainingHealth());
    }
    
}
