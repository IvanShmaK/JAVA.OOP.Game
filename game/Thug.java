package org.game;

import java.util.ArrayList;

/**
 * Это класс Разбойник, наследуется от абстрактного класса Пехота.
 */
public class Thug extends Infantry{
    /**
     * Это конструктор для класса Разбойник. Параметры: максимальное здоровье 20, защита 8, атака 4, инициатива 4
     * @param x это координата по оси х
     * @param y это координата по оси у
     */
    public Thug(int x, int y) {
        super(x, y);
    }

    /**
     * Это метод получения информации об экземпляре класса Разбойник
     * @return возвращает класс с именем, текущее здоровье и координаты на поле
     */
    @Override
    public String getInfo() {
        return String.format("Разбойник %s; здоровье: %.1f/%d; координаты: х=%d, у=%d", name, curHP, maxHP, coord.x, coord.y);
    }

    /**
     * Это метод получения имени юнита
     * @return класс и имя юнита
     */
    @Override
    public String getName() {
        return String.format("Разбойник %s", name);
    }

    /**
     * Это метод выполнения хода
     * @param list это список юнитов-противников
     */
    @Override
    public void step(ArrayList<Unit> list) {
        System.out.printf("Ближайший к Разбойнику %s противник - %s, расстояние до него - %.1f%n", name,
                list.get((int)nearest(list)[1]).getName(), nearest(list)[0]);
    }
}
