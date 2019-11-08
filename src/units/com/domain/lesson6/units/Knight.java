package units.com.domain.lesson6.units;

public class Knight extends BattleUnit {

    public Knight(String name, int speed, int health, int attackScore) {
        super(name, speed, health, attackScore);
    }

    @Override
    public void attack(Unit enemy) {
        enemy.health -= this.attackScore;
        System.out.println("Рыцарь атаковал" + enemy.getName());
    }

    @Override
    public void rest() {
        this.health += 5;
        System.out.println("Рыцарь отдыхает");
    }
}

