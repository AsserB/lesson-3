package org.example;

public class Calc {

    public int summ(int a, int b){
        int result;
        result = a + b;
        System.out.println("Сложение " + a + " и " + b + " = " + result);
        return result;
    }

    public int sub(int a, int b){
        int result;
        result = a - b;
        System.out.println("Вычитание " + a + " и " + b + " = " + result);
        return result;
    }
}
