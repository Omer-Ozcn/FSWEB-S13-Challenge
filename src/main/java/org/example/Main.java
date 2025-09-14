package org.example;

import org.example.enums.Plan;

public class Main {
    public static void main(String[] args) {
        runDemo();
    }

    public static void runDemo() {
        Healthplan hp1 = new Healthplan(1, "Çalışan Temel Paketi", Plan.BASIC);
        Healthplan hp2 = new Healthplan(2, "Çalışan Standart Paketi", Plan.STANDARD);
        Healthplan hp3 = new Healthplan(3, "Çalışan Premium Paketi", Plan.PREMIUM);

        System.out.println(hp1);
        System.out.println(hp2);
        System.out.println(hp3);

        String[] e1Plans = new String[3];
        Employee e1 = new Employee(
                1001L,
                "Ada Lovelace",
                "ada@example.com",
                "secret123",
                e1Plans
        );

        e1.addHealthPlan(0, hp1.getName());
        e1.addHealthPlan(0, hp2.getName());
        e1.addHealthPlan(1, hp3.getName());
        e1.addHealthPlan(5, "OutOfBounds");

        System.out.println(e1);

        String[] devs = new String[3];
        Company c1 = new Company(
                501L,
                "Example Tech",
                1_250_000.00,  // pozitif
                devs
        );

        c1.addEmployee(0, "Ada Lovelace");
        c1.addEmployee(0, "Grace Hopper");
        c1.addEmployee(1, "Alan Turing");
        c1.addEmployee(3, "OutOfBounds");

        System.out.println(c1);

        c1.setGiro(-500);
        System.out.println("Negatif giro denemesinden sonra: " + c1);

        Employee e2 = new Employee(
                1002L,
                "Grace Hopper",
                "grace@example.com",
                "pwd456",
                new String[]{hp2.getName(), null, null}
        );
        System.out.println(e2);
    }
}
