package org.example;

public class Main {
    public static void main(String[] args) {
        try {
            int a = 10;
            int b = 0;
            int sum = a/b;
        } catch (ArithmeticException e) {
            System.out.println("Ошибка: делить на ноль нельзя");
        }
    }
}