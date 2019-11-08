package units.com.domain.lesson6.units;

// по умолчанию методы в interface являются public
// на основе interface нельзя создать обьект
// начиная с 8 версии возможно создавать методы с реализацией с пометкой default
// начиная с 9 версии доступен модификатор private
// в интерфейсах мы описываем методы без реализации
// которые должны быть реализованы в классах, расширяющих данный интерфейс

public interface AttackAble {
    void attack(Unit enemy);

    default void escapeBattleField() {
        System.out.println("Юнит сбежал с поля боя");
    }

}
