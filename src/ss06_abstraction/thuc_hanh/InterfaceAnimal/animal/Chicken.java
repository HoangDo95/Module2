package ss06_abstraction.thuc_hanh.InterfaceAnimal.animal;

import ss06_abstraction.thuc_hanh.InterfaceAnimal.edible.Edible;

public class Chicken extends Animal implements Edible {
    @Override
    public String makeSound() {
        return "Chicken: cluck-cluck!";
    }

    @Override
    public String howToEat() {
        return "chien mam";
    }
}
