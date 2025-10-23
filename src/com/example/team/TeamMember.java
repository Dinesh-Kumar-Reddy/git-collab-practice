package com.example.team;

public class TeamMember {
    private String name;
    private String role;

    public TeamMember(String name, String role) {
        this.name = name;
        this.role = role;
    }

    public void displayInfo() {
        System.out.println("Member Name: " + name + ", Role: " + role);
    }
}
