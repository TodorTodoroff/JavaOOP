package main.java.UnitTesting.p01_Database.rpg_lab;

public interface Target {


    int getHealth();

    void takeAttack(int attackPoints);

    int giveExperience();

    boolean isDead();
}
