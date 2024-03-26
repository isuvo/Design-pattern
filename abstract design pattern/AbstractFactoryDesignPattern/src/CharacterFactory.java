
//Abstract interface for chanracter
interface Character {
    void display();
}

//Concrete class for player 
class Player implements Character {
    public void display() {
        System.out.println("Player character created.");
    }
}

//Concrete class for enemy 
class Enemy implements Character {
    public void display() {
        System.out.println("Enemy character created.");
    }
}

//Abstract interface weapon
interface Weapon {
    void draw();
}

// Concrete class for weapn
class Sword implements Weapon {
    public void draw() {
        System.out.println("Drawing a sword.");
    }
}

class Gun implements Weapon {
    public void draw() {
        System.out.println("Drawing a gun.");
    }
}

// Abstract Factory interface
interface CharacterFactory {
    Character createCharacter();
    Weapon createWeapon();
}

// Concrete Factory class
class PlayerFactory implements CharacterFactory {
    public Character createCharacter() {
        return new Player();
    }

    public Weapon createWeapon() {
        return new Sword();
    }
}

class EnemyFactory implements CharacterFactory {
    public Character createCharacter() {
        return new Enemy();
    }

    public Weapon createWeapon() {
        return new Gun();
    }
}
