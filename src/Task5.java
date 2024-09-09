/* Написать программу, которая с помощью метода класса, вычисляет
факториал числа (использовать управляющую конструкцию цикла), проверить
работу метода. */

import java.util.Scanner; // Импортируем класс Scanner для ввода данных
public class Task5 { // объявляем класс

    // Метод класса для вычисления факториала числа
    public static int factorial (int number) {
        int result = 1;
        for (int i = 1; i <= number; i++) {
            result *= i;
        }
        return result;
    }

    // Метод main
    public static void main(String[] args) {
        // Создаем объект класса Scanner, связываем со стандартным потоком ввода (клавиатура - System.in)
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите число для вычисления его факториала: ");
        int number = sc.nextInt(); // с помощью метода nextInt() считываем целое число с потока ввода - размер массива
        // Проверка условия на неотрицательность числа
        if (number < 0) System.out.println("Факториал отрицательного числа не определён");
        else System.out.println("Факториал числа " + number + " равен " + factorial(number));
    }
}
