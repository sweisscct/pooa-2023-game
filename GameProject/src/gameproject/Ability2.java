/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gameproject;

/**
 *
 * @author Lecturer
 */
public class Ability2 {
    private final String name;
    private final int damage;
    private int numUsesRemaining;
    private final int numUsesMax;
    private final String description;

    public String getName() {
        return name;
    }

    public int getDamage() {
        return damage;
    }

    public int getNumUsesRemaining() {
        return numUsesRemaining;
    }

    public int getNumUsesMax() {
        return numUsesMax;
    }

    public String getDescription() {
        return description;
    }
    
    

    public Ability2(String name, int damage, int numUsesMax, String description) {
        this.name = name;
        this.damage = damage;
        this.numUsesMax = numUsesMax;
        this.numUsesRemaining = numUsesMax;
        this.description = description;
    }
    
//    private final String abilitiesNames (String name) {
//        Scanner abilityInfo = new Scanner(FileReader());
//    }
   
    public void activate(Pokemon opponent) {
        opponent.takeDamage(damage);
        numUsesRemaining --;
        
    }
    
    public boolean hasRemainingUses() {
        return numUsesRemaining > 0;
    }
    
}
