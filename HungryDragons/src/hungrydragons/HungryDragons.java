package hungrydragons;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author markgangel
 */
public class HungryDragons {

    private Dragon Viserion;
    private ArrayList<Animal> animals = new ArrayList<>();
    
    public HungryDragons() {
        
        // Az éhes sárkány létrehozása
        this.Viserion = new Dragon(1000, 1000);
        
        // Az állatok akiket megehet alapból
        Animal Bigsheep = new Sheep(700);
        Animal crazyGoat = new Goat(100);
        Animal scaryDragon = new Dragon(1000, 900);
        
        // Az ehető állatok listába szedése
        this.animals.add(Bigsheep);
        this.animals.add(crazyGoat);
        this.animals.add(scaryDragon);
        
    }
    
    public static void main(String[] args) {

        HungryDragons App = new HungryDragons();
        int user_command;
        
        System.out.println("Welcome to HungryDragons App! Lets feed Viserion!");

        //System.out.println(App.Viserion);
        do {
            
        // menu
        System.out.println("Available animals: " + App.animals);
        System.out.println("");
        
        if(App.Viserion.is_hungry())
        {
            System.out.println("Viserion is very hungry!");
        } else {
            System.out.println("Viserion is not hungry yet!");
        }
        
        System.out.println(""
                + "1. New animal \n"
                + "2. Feed \n"
                + "3. Feed (with all animals) \n"
                + "4. Skip a day \n"
                + "5. Quit \n");
        
        System.out.print("Which one do you want to do? ");
            //System.out.println(App.Viserion);
        // menu end
        
        // user által választott case(szám)
        user_command = App.getUserCommand();
            
        switch(user_command)
        {
            case 1:
                
                System.out.println("What kind of animal you want to add?");
                System.out.println("1. Sheep \n2. Goat \n3. Dragon");
                int animal_type = App.getUserCommand();
                
                System.out.println("With how much cal?");
                int animal_cal = App.getUserCommand();
                                
                Animal animal = new Sheep(animal_cal);
                
                if(animal_type == 2)
                {
                    animal = new Goat(animal_cal);
                }
                
                if(animal_type == 3)
                {
                    animal = new Dragon(1000, animal_cal);

                }
                
                App.animals.add(animal);
                
                break;
            case 2:
                System.out.println("Which animal do you want to give her?");
                for (int i = 0; i < App.animals.size(); i++) {
                    System.out.println(i + ". " + App.animals.get(i));
                }
                
                int animal_t = App.getUserCommand();
                App.Viserion.eat(App.animals.get(animal_t));
                
                //System.out.println(App.Viserion);
                
                break;
            case 3:
                
                App.Viserion.eat(App.animals);
                System.out.println("");
                System.out.println("Viserion just ate those poor animals.");
                System.out.println("");
                System.out.println(App.Viserion);
                
                break;
            case 4:
                App.Viserion.day_later();
                break;
            case 5:
                System.out.println("Thank you for using the App!");
                break;
                
        }
       
        } while(user_command != 5);
    }
    
    
    public int getUserCommand()
    {        
        int user_command = 0;
        Scanner sc = new Scanner(System.in);
        
        try {
            user_command = sc.nextInt();
        } catch (InputMismatchException e)
        {
            System.out.println("Bad argument! Lets try this again!");
            throw new IllegalArgumentException();
        }
        
        return user_command;
    }
    
}
