package units.com.domain.lesson6.units;

public interface restAble {
    void rest();

    default void escapeBattleField() {
        System.out.println("Юнит сбежал с поля боя");
    }
}
