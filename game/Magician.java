package org.game;

/**
 * Это класс Маг, наследуется от абстрактного класса Волшебник. Он может атаковать вражеских юнитов магией, либо воскрешать падших с минимальным количеством здоровья
 */
public class Magician extends Wizard{
    /**
     * Это конструктор для класса Маг. Параметры: максимальное здоровье 10, защита 3, атака 8, инициатива 3, максимальное количество маны 150
     */
    public Magician() {
        super(8, 3, new int[]{1, 5}, 150, 150);
    }

    /**
     * Это метод получения информации об экземпляре класса Маг
     * @return возвращает класс с именем, текущее здоровье, текущее количество маны
     */
    @Override
    public String getInfo() {
        return String.format("Маг %s, здоровье: %.1f/%d, мана: %d/%d", name, curHP, maxHP, curMana, maxMana);
    }

    public void castMagic () {} //метод атаки вражеских юнитов магией

    public void revival () {}  //метод воскрешения умерших дружественных юнитов с минимальным количеством здоровья
}