/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gameproject;

/**
 *
 * @author Lecturer
 */
public class Player {
    Pokemon pokemon;
    Pokemon currentPokemon;

    public Player(Pokemon pokemon) {
        this.pokemon = pokemon;
        currentPokemon = pokemon;
    }
    
    
    public void switchPokemon(Pokemon newPokemon) {
        currentPokemon = newPokemon;
    }
}
