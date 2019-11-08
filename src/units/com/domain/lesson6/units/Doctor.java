package units.com.domain.lesson6.units;

public class Doctor extends BattleUnit {
    public Doctor(String name, int speed, int health, int attackScore) {
        super(name, speed, health, attackScore);
    }

    @Override
    public void attack(Unit friend) {
        friend.health += this.attackScore;
        System.out.println("Доктор увеличил очки здоровья воину " + friend.getName());
    }

    @Override
    public void rest() {
        this.health += 10;
        System.out.println("Доктор отдыхает");
    }
}
