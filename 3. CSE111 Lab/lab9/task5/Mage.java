package lab9.task5;

public class Mage extends Character {

    public Mage(String name, int level) {

        super(name, level);
    }

    public void specialMove() {
        
        System.out.println(name + " casts a powerful fireball!");
    }
}

