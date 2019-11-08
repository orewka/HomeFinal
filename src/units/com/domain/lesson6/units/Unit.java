package units.com.domain.lesson6.units;

abstract public class Unit implements restAble {
    protected String name; // protected мы можем обратиться к свойству внутри данного класса и у его наследников
    protected int health; // когда тип свойства не указан, это называется private, доступ внутри пакета
    protected int speed; // protected дочерним классом и внутри пакета, private дочерним классам в не зависимости от пакета

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name != null && !"".equals(name)) {
            this.name = name;
        }
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        if (health > 0) {
            this.health = health;
        }
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        if (speed > 0) {
            this.speed = speed;
        }
    }

    public Unit(String name, int speed) {
        this.name = name;
        this.speed = speed;
    }

    public boolean isAlive () {
        return health > 0;
    }

    public void run() {
        System.out.println("Юнит перемещается со скоростью " + speed);
    }


}
