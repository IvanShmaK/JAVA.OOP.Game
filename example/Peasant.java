package org.example;

/**
 * Это класс Крестьянин, наследуется от абстрактного класса Юнит. Он подносит стрелы для стрелков. Может атаковать вражеского юнита, если тот окажется рядом.
 */
public class Peasant extends Unit{
    /**
     * Это конструктор для класса Крестьянин
     * @param name это имя крестьянина
     */
    public Peasant(String name) {
        super(name, 1, 1, 1, 1, 1, new int[]{1});
    }

    public void bringArrow () {} //метод доставки стрелы одному из стрелков один раз за ход
}