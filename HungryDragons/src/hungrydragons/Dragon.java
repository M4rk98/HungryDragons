package hungrydragons;

import java.util.ArrayList;

/**
 *
 * @author markgangel
 */
public class Dragon implements Animal {
    
    // kcal, a sárkányt ez alatt tekintjük éhesnek
    private int hungerTime;
    
    // kcal, a sárkány ennyi energiával rendelkezik jelenleg.
    private int energy;
    
    // kcal
    private int foodValue;
    
    public Dragon(int hungerTime, int foodValue) {
        
        this.hungerTime = hungerTime;
        this.foodValue = foodValue;   

    }
    
    // Az állat tápértéke hozzáadódik a sárkányéhoz
    public void eat(Animal animal)
    {
        this.energy += animal.getFoodValue();
    }
    
    // A listában az összes állat tápértéke hozzáadódik a sárkányéhoz
    public void eat(ArrayList<Animal> animals)
    {
        for (int i = 0; i < animals.size(); i++) {
            this.energy += animals.get(i).getFoodValue();
        }
    }
    
    // Éhes-e a sárkány (az energiája kisebb-e, mint a határérték)?
    public boolean is_hungry()
    {
        boolean is_hungry = false;
        
        if(this.energy < this.hungerTime)
        {
            is_hungry = true;
        }
        
        return is_hungry;
    }
    
    /*
    A sárkány elmegy kincset lopni, királylányt rabolni.
    Egy fix értékkel csökkenti a sárkány energiáját.  
    */
    public void day_later()
    {
        if(this.energy != 0)
        {
            this.energy -= 500;    
        }
    }

    @Override
    public String toString() {
        return "Dragon{" + "hungerTime=" + hungerTime + ", energy=" + energy + ", kcal= " + foodValue + "}";
    }

    @Override
    public int getFoodValue() {
        return this.foodValue;
    }
    
}
