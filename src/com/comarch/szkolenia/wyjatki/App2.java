package com.comarch.szkolenia.wyjatki;

public class App2 {
    public static void main(String[] args) throws IncorrectAgeException {
        int age = 200;
        validateAge(age);
        try {
            validateAge(age);
        } catch (IncorrectAgeException e) {
            System.out.println("niepoprawny wiek !!");
            e.printStackTrace();
            System.out.println(e.getMessage());
        }
        System.out.println("Koniec programu !!");

        try {
            validateName();
            validateSurname();
        } catch (Exception e) {
            System.out.println("cos jest nie tak !!");
        }
    }

    public static void validateAge(int age) throws IncorrectAgeException {
        if(age <= 0 || age >= 150) {
            throw new IncorrectAgeException("Age value = " + age);
        }
    }

    public static void validateName() {
        throw new NullPointerException();
    }

    public static void validateSurname() {
        throw new NullPointerException();
    }
}
