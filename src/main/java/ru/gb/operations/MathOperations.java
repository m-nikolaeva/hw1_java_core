package ru.gb.operations;

public class MathOperations {

    /**
     * Функция сложения двух целых чисел
     *
     * @param num1 первое слагаемое
     * @param num2 второе слагаемое
     * @return сумма num1 и num2.
     */
    public static int addition(int num1, int num2) {
        return num1 + num2;
    }

    /**
     * Функция вычитания двух целых чисел
     *
     * @param num1 уменьшаемое
     * @param num2 вычитаемое
     * @return разность num1 и num2.
     */
    public static int subtraction(int num1, int num2) {
        return num1 - num2;
    }

    /**
     * Функция умножения двух целых чисел
     *
     * @param num1 первый множитель
     * @param num2 второй множитель
     * @return произведение num1 и num2.
     */
    public static int multiplication(int num1, int num2) {
        return num1 * num2;
    }

    /**
     * Функция деления двух целых чисел
     *
     * @param num1 делимое
     * @param num2 делитель
     * @return частное num1 и num2.
     *
     */
    public static int division(int num1, int num2) {
        if (num2 == 0) {
            throw new ArithmeticException("Division by zero is not allowed.");
        }
        return num1 / num2;
    }
}
