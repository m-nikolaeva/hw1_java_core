package ru.gb.decorator;

/**
 * Декор преобразует внешний вид выводимого результата
 */
public class Decor {
    /**
     * Функция для вывода в консоль строки: "Результат решения примера ("сам пример") это "результат")
     * @param num1 - первое целое число примера;
     * @param operator - операция (+, -, *, /);
     * @param num2 - второе целое число примера;
     * @param result - результат вычислений;
     * @return - отформатированная строка.
     */
    public static String formatResult(int num1, String operator, int num2, int result) {
        return String.format("The result of solving the example (%d %s %d) is %d", num1, operator, num2, result);
    }
}
