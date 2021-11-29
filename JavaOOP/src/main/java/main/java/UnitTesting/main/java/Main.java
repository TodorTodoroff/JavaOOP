package main.java.UnitTesting.main.java;

import main.java.UnitTesting.main.java.p01_Database.Database;

import javax.naming.OperationNotSupportedException;

public class Main {
    public static void main(String[] args) {

        try {
            Database db = new Database(1, 2, 3, 4);
        } catch (OperationNotSupportedException e) {
            e.printStackTrace();
        }


    }
}
