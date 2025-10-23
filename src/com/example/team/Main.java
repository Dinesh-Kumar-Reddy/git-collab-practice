package com.example.team;

public class Main {
    public static void main(String[] args) {
        System.out.println("=== Welcome to Git Collaboration Practice ===");

        Calculator calc = new Calculator();
        System.out.println("Sum of 10 and 20 = " + calc.add(10, 20));

        MessagePrinter printer = new MessagePrinter();
        printer.printWelcomeMessage();

        TeamMember dinesh = new TeamMember("Dinesh", "Java Developer");
        TeamMember viresh = new TeamMember("Viresh", "Tester");

        dinesh.displayInfo();
        viresh.displayInfo();
    }
}
