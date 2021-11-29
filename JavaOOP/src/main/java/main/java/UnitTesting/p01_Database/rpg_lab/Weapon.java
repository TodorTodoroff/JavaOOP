package main.java.UnitTesting.p01_Database.rpg_lab;

public interface Weapon {

    int getAttackPoints();

    int getDurabilityPoints();

    void attack(Target target);
}
