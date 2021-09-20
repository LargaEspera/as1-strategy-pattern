package com.company;

public class Main {

    public static void main(String[] args) {

        Employee designer = new Designer();
        Employee junior = new JuniorProgrammer();
        Employee middle = new MiddleProgrammer();
        Employee senior = new SeniorProgrammer();

        System.out.println("Designer:");
        designer.performWork();
        System.out.println("Junior before:");
        junior.performWork();
        System.out.println("Middle:");
        middle.performWork();
        System.out.println("Senior:");
        senior.performWork();

        System.out.println("");
        System.out.println("Junior after:");
        junior.setWork(new JavaScript());
        junior.performWork();
    }
}
