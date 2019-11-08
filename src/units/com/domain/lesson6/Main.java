package units.com.domain.lesson6;

import units.com.domain.lesson6.units.*;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Укажите тип персонажа");

        String userChoise = in.nextLine();
        BattleUnit battleUnit = null;
        // warrior knight doctor
        if ("warrior".equals(userChoise)) {
            battleUnit = new Warrior("Воин",3,20,15);
        } else if ("knight".equals(userChoise)) {
            battleUnit = new Knight("Рыцарь",4,22,18);
        } else if ("doctor".equals(userChoise)) {
            battleUnit = new Doctor("Доктор",2,40,5);
        }
        battleUnit.run();
        System.out.println("Ваш выбор: " + battleUnit);

        // принципы ООП
        // наследование - расширить функционал родителя
        // инкапсуляция - скрытие деталей и реализации(модификаторы доступа)
        // полиморфизм наследования - работа через общий тип данных, создание обьектов общего типа
        // полиморфизм - перегруженный метод, имеет общие названия
        // абстракция - интерфейсы и абстрактные классы

    }
}
