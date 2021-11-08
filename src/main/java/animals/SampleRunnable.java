package animals;

public class SampleRunnable {
    public static void main(String[] args) {
        IBird parrot=new Parrot();
        parrot.eat();
        parrot.cry();
        parrot.drink();
        parrot.fly();
        parrot.getEatingType();
        parrot.hasWings();
        System.out.println("---------------------");
        IAnimal parrotAnimal=new Parrot();
        parrotAnimal.move();
        parrotAnimal.eat();
        parrotAnimal.makeSound();
        parrotAnimal.drink();



    }
}
