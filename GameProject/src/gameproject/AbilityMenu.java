/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gameproject;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Lecturer
 */
public class AbilityMenu {
    public void displayMenu(Pokemon currentPokemon, Pokemon targetPokemon) {
        System.out.println("Select your ability:");
        Scanner sc = new Scanner(System.in);
        Ability[] abilities = currentPokemon.getAbilities();
        int optionNum = 1;
        for (Ability ability : abilities) {
            System.out.println(optionNum +": " + ability.getName());
            System.out.println(ability.getDescription());
            System.out.println(ability.getNumUsesRemaining() + " uses remaining");
            optionNum++;
        }
        System.out.println("Enter " + optionNum + " to go back.");
        
        String input = sc.nextLine();
        switch (input) {
            case "1":
                if (abilities[0].hasRemainingUses()) {
                    abilities[0].activate(targetPokemon);
                }
        }
    }
     
     
}
