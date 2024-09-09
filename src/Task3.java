public class Task3 { // объявляем класс
    public static void main(String[] args) { // объявляем метод main (запуск программы)
        // Цикл for для перебора аргументов командной строки
        for (int i = 0; i < args.length; i++) {
            System.out.println("Аргумент " + i + " : " + args[i]); // Вывод аргументов командной строки
        }
    }
}
