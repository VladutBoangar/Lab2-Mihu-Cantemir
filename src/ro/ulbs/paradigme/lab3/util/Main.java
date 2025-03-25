package ro.ulbs.paradigme.lab3.util;

public class Main {
    public static void main(String[] args) {
        PasswordMaker passwordMaker = PasswordMaker.getInstance();
        System.out.println("Generated Password: " + passwordMaker.getPassword());
        System.out.println("getInstance() called " + PasswordMaker.getAccessCounter() + " times");
    }
}