/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package starwarsinterfacepractice;

/**
 *
 * @author konradgnat
 */
public class Hero implements Character {
    public String weapon = "the force";
    
    public void attack() {
        System.out.println("The hero attacks the enemy");
    }
    public void heal() {
        System.out.println("The hero heals you");

    }
    
    public String getWeapon() {
        return weapon;
    }
}
