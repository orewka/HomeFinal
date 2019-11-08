package units.com.domain.lesson6.units;

public class Warrior extends BattleUnit {
    public Warrior(String name, int speed, int health, int attackScore) {
        super(name, speed, health, attackScore);
    }

    @Override
    public void attack(Unit enemy) {
        enemy.health -= this.attackScore;
        System.out.println("Воин атаковал " + enemy.getName());
    }

    @Override
    public void rest() {
        this.health += 3;
        System.out.println("Воин отдыхает");
    }
}


