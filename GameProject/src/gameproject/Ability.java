/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gameproject;

/**
 *
 * @author Lecturer
 */
public class Ability {
    private final String name;
    private final int damage;
    private int numUsesRemaining;
    private final int numUsesMax;
    private final String description;

    public Ability(String name, int damage, int numUsesMax, String description) {
        this.name = name;
        this.damage = damage;
        this.numUsesMax = numUsesMax;
        this.numUsesRemaining = numUsesMax;
        this.description = description;
    }
    
    private final String abilitiesNames (String name) {
        Scanner abilityInfo = new Scanner(FileReader());
    }
   
    public void activate(Pokemon opponent) {
        opponent.takeDamage(damage);
        numUsesRemaining --;
        
    }
    
}
