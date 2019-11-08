package units.com.domain.lesson6.units;

// Unit это базовый класс или родительский, BattleUnit это дочерник класс
// abstract позволяет указать
abstract public class BattleUnit extends Unit implements AttackAble {

    protected int attackScore;

    // ЗАДАНИЕ 4 к LESSON9
    public static BattleUnit newBattleUnit(String unitName) {
        BattleUnit unit = null;
        if (unitName.equals("Warrior")) {
            unit = new Warrior("Воин",5,20,10);
            unit.name = "Воин" + Math.random() * 100;
        }
        if (unitName.equals("Knight")) {
            unit = new Knight("Рыцарь",7,25,15);
            unit.name = "Рыцарь" + Math.random() * 100;
        }
        if (unitName.equals("Doctor")) {
            unit = new Doctor("Доктор",3,15,10);
            unit.name = "Доктор" + Math.random() * 100;
        }
        return unit;
    }

    public BattleUnit(String name, int speed, int health, int attackScore) {
        super(name, speed); // вызов конструктора родителя
        this.health = health;   // добавлено вручную
        this.attackScore = attackScore; // добавлено вручную
    }

    public int getAttackScore() {
        return attackScore;
    }

    public void setAttackScore(int attackScore) {
        if (attackScore > 0) {
            this.attackScore = attackScore;
        }
    }

    @Override
    public String toString() {
        return "BattleUnit{" +
                "attackScore=" + attackScore +
                ", name='" + name + '\'' +
                ", health=" + health +
                ", speed=" + speed +
                '}';
    }

    @Override
    public void escapeBattleField() { // нужно переопределить метод так как существует две его реализации
        System.out.println("Юнит " + this.name + " сбежал с поля боя");
    }
}
