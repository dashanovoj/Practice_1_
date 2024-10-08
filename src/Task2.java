/* Написать программу, в результате которой массив чисел вводится
пользователем с клавиатуры считается сумма элементов целочисленного
массива с помощью циклов do while, while, также необходимо найти
максимальный и минимальный элемент в массиве, результат выводится на экран. */

import java.util.Scanner; // Импортируем класс Scanner для ввода данных
public class Task2 { // объявляем класс
    public static void main(String[] args) { // объявляем метод main (запуск программы)

        // Создаем объект класса Scanner, связываем со стандартным потоком ввода (клавиатура - System.in)
        Scanner sc = new Scanner(System.in);

        System.out.println("Введите размер массива: "); // Стандартный поток вывода (дисплей)
        int size = sc.nextInt(); // с помощью метода nextInt() считываем целое число с потока ввода - размер массива
        int [] arr = new int[size]; // создаем целочисленный массив размером size
        int sum_1 = 0, sum_2 = 0; // создаём переменные для нахождения суммы элементов массива

        // Ввод элементов массива через клавиатуру
        System.out.println("Введите элементы массива: ");
        for(int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }

        // Через цикл do while нахождение суммы, минимального и максимального элементов массива
        System.out.println("Через цикл DO WHILE");
        int i = 0;
        int min_el_1 = arr[0], max_el_1 = arr[0]; // перед проходом по массиву мин. и макс. значения равны его первому элементу
        do {
            sum_1 += arr[i]; // к сумме добавляем значение элемента массива
            if (arr[i] < min_el_1) min_el_1 = arr[i]; // проверка условия на минимальный элемент
            if (arr[i] > max_el_1) max_el_1 = arr[i]; // проверка условия на максимальный элемент
            i++;
        } while (i < size);
        // Вывод полученных значений
        System.out.println("Сумма элементов массива: " + sum_1);
        System.out.println("Минимальный элемент массива: " + min_el_1);
        System.out.println("Максимальный элемент массива: " + max_el_1);

        // Через while нахождение суммы, минимального и максимального элементов массива
        System.out.println("Через цикл WHILE");
        int j = 0;
        int min_el_2 = arr[0], max_el_2 = arr[0]; // перед проходом по массиву мин. и макс. значения равны его первому элементу
        while (j < size) {
            sum_2 += arr[j]; // к сумме добавляем значение элемента массива
            if (arr[j] < min_el_2) min_el_2 = arr[j]; // проверка условия на минимальный элемент
            if (arr[j] > max_el_2) max_el_2 = arr[j]; // проверка условия на максимальный элемент
            j++;
        }
        // Вывод полученных значений
        System.out.println("Сумма элементов массива: " + sum_2);
        System.out.println("Минимальный элемент массива: " + min_el_2);
        System.out.println("Максимальный элемент массива: " + max_el_2);
    }
}
