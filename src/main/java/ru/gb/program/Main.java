package ru.gb.program;

import ru.gb.decorator.Decor;
import ru.gb.operations.MathOperations;

/** Основной класс приложения
 * Вызывает функции приложения, выдает результат.
 */
public class Main {
    /**
     * Точка входа в программу.
     * @param args - стандартные аргументы командной строки.
     */
    public static void main(String[] args) {
        int num1 = 9;
        int num2 = 3;

        int result = MathOperations.addition(num1, num2);
        System.out.println(Decor.formatResult(num1, "+", num2, result));
        result = MathOperations.subtraction(num1, num2);
        System.out.println(Decor.formatResult(num1, "-", num2, result));
        result = MathOperations.multiplication(num1, num2);
        System.out.println(Decor.formatResult(num1, "*", num2, result));
        result = MathOperations.division(num1, num2);
        System.out.println(Decor.formatResult(num1, "/", num2, result));
    }
}