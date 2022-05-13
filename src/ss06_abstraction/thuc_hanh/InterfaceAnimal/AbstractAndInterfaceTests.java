package ss06_abstraction.thuc_hanh.InterfaceAnimal;

import ss06_abstraction.thuc_hanh.InterfaceAnimal.animal.Animal;
import ss06_abstraction.thuc_hanh.InterfaceAnimal.animal.Chicken;
import ss06_abstraction.thuc_hanh.InterfaceAnimal.animal.Tiger;
import ss06_abstraction.thuc_hanh.InterfaceAnimal.edible.Edible;
import ss06_abstraction.thuc_hanh.InterfaceAnimal.fruit.Fruit;
import ss06_abstraction.thuc_hanh.InterfaceAnimal.fruit.Apple;
import ss06_abstraction.thuc_hanh.InterfaceAnimal.fruit.Orange;

public class AbstractAndInterfaceTests {
    public static void main(String[] args) {
        Animal[] animals = new Animal[2];
        animals[0] = new Tiger();
        animals[1] = new Chicken();
        for (Animal animal : animals) {
            System.out.println(animal.makeSound());

            if (animal instanceof Chicken) {
                Edible edible = (Chicken) animal;
                System.out.println(edible.howToEat());
            }
            if(animal instanceof Tiger){
                Edible edible1 = (Tiger) animal;
                System.out.println(edible1.howToEat());
            }
        }
        Fruit[] fruits = new Fruit[2];
        fruits[0] = new Orange();
        fruits[1] = new Apple();
        for (Fruit fruit : fruits) {
            System.out.println(fruit.howToEat());
        }
    }
}