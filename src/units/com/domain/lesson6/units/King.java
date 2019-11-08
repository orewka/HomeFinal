package units.com.domain.lesson6.units;

public class King extends Unit implements restAble {

    private King(String name, int speed, int health) {
        super(name, speed);
        this.health = health;  // добавлено вручную
    }

    // задание 3 к LESSON9
    public static Unit newKing(String name,int speed, int health) {
        Unit king = new King("",0,0);
        if (!"".equals(name)) {
            king.name = name;
        }
        if (speed > 0) {
            king.speed = speed;
        }
        if (health > 0) {
            king.health = health;
        }
        return king;
    }

    @Override
    public String toString() {
        return "King{" +
                "name='" + name + '\'' +
                ", health=" + health +
                ", speed=" + speed +
                '}';
    }

    @Override
    public void rest() {
        this.health += 7;
        System.out.println("Король отдыхает");
    }
}
