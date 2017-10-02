/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hungrydragons;

/**
 *
 * @author markgangel
 */
public class Goat implements Animal {
    
    private int FoodValue;

    public Goat(int FoodValue) {
        this.FoodValue = FoodValue;
    }
    
    @Override
    public int getFoodValue() {
        return this.FoodValue;
    }

    @Override
    public String toString() {
        return "Goat(" + FoodValue + ')';
    }
    
    
}
