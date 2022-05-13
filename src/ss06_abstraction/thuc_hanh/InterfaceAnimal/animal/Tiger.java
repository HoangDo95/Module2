package ss06_abstraction.thuc_hanh.InterfaceAnimal.animal;

import ss06_abstraction.thuc_hanh.InterfaceAnimal.animal.Animal;
import ss06_abstraction.thuc_hanh.InterfaceAnimal.edible.Edible;

public class Tiger extends Animal implements Edible {
        @Override
        public String makeSound() {
            return "ho keu meo meo";
        }

    @Override
    public String howToEat() {
        return "nai cao";
    }
}

