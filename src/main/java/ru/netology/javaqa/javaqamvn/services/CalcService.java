package ru.netology.javaqa.javaqamvn.services;

public class CalcService {
    public int calculate(int income, int expenses, int threshold) {
        int restMonth = 0; // счётчик месяцев отдыха
        int savings = 0; // количество сбережений на счету
        for (int month = 0; month < 12; month++) {
            if (savings > threshold) {
                restMonth++;
                savings = (savings - expenses) / 3;
            } else {
                savings = savings + income - expenses;
            }
        }
        return restMonth;
    }
}

