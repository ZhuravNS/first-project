public class Practikum {

    public static void main(String[] args) {
        double[] expenses = {1772.5, 367.0, 120.6, 2150.2, 874.0, 1.0, 1459.4};
        double maxExpense = findMaxExpense(expenses);  Вызовите метод и присвойте maxExpense значение его результата
        System.out.println(Самая большая трата недели  + maxExpense);
    }

    private static double findMaxExpense(double[] expenses) {  Метод поиска максимального числа

        double maxExpense = 0;   то с чего начинаем поиск максимального числа
        for (int i = 0; i  expenses.length; i++) {
            if (expenses[i]  maxExpense) {
                maxExpense = expenses[i];   приравниваем  каждое следующее большее число промежуточной переменной
            }

        }
        return maxExpense;  возвращаем найденое максимальное число
    }

}