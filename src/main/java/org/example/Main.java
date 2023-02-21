package org.example;

import ru.netology.javaqa.javaqamvn.services.CalcService;

public class Main {
    public static void main(String[] args) {

        System.out.println("Hello world!");
        CalcService service = new CalcService();
        int income = 100_000;
        int expenses = 60_000;
        int threshold = 150_000;
        int expected = 2;
        int actual = service.calculate(income, expenses, threshold);

        income = 10_000;
        expenses = 3_000;
        threshold = 20_000;
        expected = 2;
        actual = service.calculate(income, expenses, threshold);

    }
}


