public class AbstractFactoryPattern {
    public static void main(String[] args) throws Exception {
        //System.out.println("Hello, World!");

          // Creating a player and a sword
          CharacterFactory playerFactory = new PlayerFactory();
          Character player = playerFactory.createCharacter();
          Weapon playerWeapon = playerFactory.createWeapon();
          player.display();
          playerWeapon.draw();
  
          // Creating an enemy and a gun
          CharacterFactory enemyFactory = new EnemyFactory();
          Character enemy = enemyFactory.createCharacter();
          Weapon enemyWeapon = enemyFactory.createWeapon();
          enemy.display();
          enemyWeapon.draw();
    }
}
