package lab8.task3;

public class Dog  extends Animal {
    public String animalBreedMain;

    public Dog(String name, int age, String color, String animalBreedMain) {

        super(name, age, color);
        this.animalBreedMain = animalBreedMain;
    }

    public String info() {

        return super.info() + "Breed: " + animalBreedMain;
    }

    public void makeSound() {
        
        System.out.println(color + " color " + name + " is barking");
    }
}
