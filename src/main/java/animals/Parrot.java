package animals;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Parrot implements IBird,IAnimal {
    private final String name ="Parrot";
    private List<String> eat=new ArrayList<>(Arrays.asList("insects","crops","plants","meat"));
    private final String sound="talk";
    private final List<String> drinks=new ArrayList<>(Arrays.asList("common drinks"));

    @Override
    public boolean fly() {
        System.out.println(
                String.format("%ss flies!"
                        ,getName()
                ));
        return true;
    }

    @Override
    public boolean cry() {
        System.out.println(
                String.format("%s's crying is told %sing!"
                ,getName()
                ,getSound()
                )
        );
        return true;
    }

    @Override
    public boolean makeSound() {
        return cry();
    }

    @Override
    public boolean eat() {
        System.out.println(
                String.format("%ss eat %s!"
                        ,getName()
                        ,getEat()
                )
        );
        return true;
    }

    @Override
    public boolean drink() {
        System.out.println(
                String.format("%ss drinks %s!"
                        ,getName()
                        ,getDrinks()
                )
        );
        return true;
    }

    @Override
    public boolean move() {
        return fly();
    }

    @Override
    public FeedingType getEatingType() {

        return null;
    }

    @Override
    public boolean hasWings() {
        System.out.println(
                String.format("%ss has wings!"
                        ,getName()
                )
        );
        return true;
    }

    /* ----------------- Getters & Setters---------------------------------*/
    public List<String> getEat() {
        return eat;
    }

    public void setEat(List<String> eat) {
        this.eat = eat;
    }

    public String getSound() {
        return sound;
    }

    public List<String> getDrinks() {
        return drinks;
    }

    @Override
    public String getName() {
        return name;
    }

}
