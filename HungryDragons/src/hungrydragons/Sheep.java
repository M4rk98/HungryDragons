package hungrydragons;

/**
 *
 * @author markgangel
 */
public class Sheep implements Animal {
    
    private int FoodValue;

    public Sheep(int FoodValue) {
        this.FoodValue = FoodValue;
    }
    
    @Override
    public int getFoodValue() {
        return this.FoodValue;
    }

    @Override
    public String toString() {
        return "Sheep(" + FoodValue + ')';
    }
    
    
}
