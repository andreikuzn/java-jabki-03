public class Main {
    public static void main(String[] args) {

        /**
         * Условный оператор if-else
         */
        boolean isRain = true;

        System.out.println("Надеть куртку");
        System.out.println("Надеть обувь");
        System.out.println("Взять сумку");

        if (isRain) {
            System.out.println("Взять зонт");
        }

        Long a = 1000L;
        Long b = 1000L;

        System.out.println(a.equals(b));

        String animal = "dog1";
        if (animal.equals("cat")) {
            System.out.println("Мяу");
        } else if (animal.equals("dog")) {
            System.out.println("Гав");
        } else {
            System.out.println("Хрю");
        }
        int floor = 1;
        double price = 3000;

        if (floor == 1 && price < 3000) {
            System.out.println("Подходит для аренды!");
        }

        // Тенарный оператор
        System.out.println(a > 0 ? "a положительное число" : "а неполжительное число");

        /**
         * Условный оператор switch
         */

        switch (animal) {
            case "cat":
                System.out.println("Мяу");
                break;
            case "dog":
                System.out.println("Гав");
                break;
            case "fish":
                System.out.println("Буль");
                break;
            case "bear":
                System.out.println("rrrr");
                break;
            default:
                System.out.println("Привет!");
        }

        /**
         * Циклы
         */

        for (int i = 0; i < 10; i++) {
            System.out.println(i);
        }

        int x = 0;
        while (x < 10) {
            System.out.println(x);
            x++;
        }

        for (int i = 0; i < 10; i++) {
            if (i == 5) {
                // Выход из цикла
                break;
            }
            System.out.println(i);
        }

        for (int i = 1; i < 10; i++) {

            // проверка на четность
            if (i % 2 != 0) {
                // пропуск итерации
                continue;
            }
            System.out.println(i);
        }

        /* дз3
        if-else
        1. Дано число. Напишите программу, которая определяет, является ли оно четным или нечетным */

        int number = 5;
        if (number % 2 == 0) {
            System.out.printf("Число %s является четным.", number);
        } else {
            System.out.printf("Число %s является нечетным.", number);
        }

        System.out.println();

        // 2. Даны два числа. Выведите «Первое больше», «Второе больше» или «Равны»

        double firstNumber = 3.0;
        double secondNumber = 5.0;
        if (firstNumber > secondNumber) {
            System.out.println("Первое больше");
        } else if (firstNumber < secondNumber) {
            System.out.println("Второе больше");
        } else {
            System.out.println("Равны");
        }

        System.out.println();

        // 3 Дано число. Выведите «Положительное», «Отрицательное» или «Равно нулю»

        double digit = 1.0;
        if (digit > 0) {
            System.out.println("Положительное");
        } else if (digit < 0) {
            System.out.println("Отрицательное");
        } else {
            System.out.println("Равно нулю");
        }

        System.out.println();

        // 4 Дано число (возраст). Если возраст >= 18, выведите «Доступ разрешен», иначе — «Доступ запрещен

        int age = 18;
        if (age >= 18) {
            System.out.println("Доступ разрешен");
        } else {
            System.out.println("Доступ запрещен");
        }

        System.out.println();

        /* 5 Придумать задачу самим:
        Оценка успеваемости студента
        Напишите программу, которая принимает на вход оценку студента (целое число от 0 до 100)
        и определяет его уровень успеваемости по следующим правилам:
        Если оценка больше 100 или меньше 0, вывести:
        "Ошибка: оценка вне допустимого диапазона".
        Если оценка от 90 до 100 включительно, вывести:"Отлично".
        Если оценка от 70 до 89 включительно, вывести:"Хорошо".
        Если оценка от 50 до 69 включительно, вывести:"Удовлетворительно".
        Если оценка от 45 до 49 включительно, программа должна спросить:
        "Вы сдавали дополнительное задание? (true/false)"
        Если приходит true, вывести "Удовлетворительно".
        Если приходит false, вывести "Неудовлетворительно".
        Если оценка меньше 45, вывести:"Неудовлетворительно".*/

        int score = 50;
        if (score < 0 || score > 100) {
            System.out.println("Ошибка: оценка вне допустимого диапазона");
        } else if (score >= 90) {
            System.out.println("Отлично");
        } else if (score >= 70) {
            System.out.println("Хорошо");
        } else if (score >= 50) {
            System.out.println("Удовлетворительно");
        } else if (score >= 45 && score <= 49) {
            boolean extraWork = true;
            if (extraWork) {
                System.out.println("Удовлетворительно");
            } else {
                System.out.println("Неудовлетворительно");
            }
        } else {
            System.out.println("Неудовлетворительно");
        }

        System.out.println();

        /* Тернарный оператор
        1 Дано число. Используя тернарный оператор, определите, положительное, отрицательное или нулевое */

        int num = -2;
        System.out.println((num > 0) ? "Положительное" : (num < 0) ? "Отрицательное" : "Равно нулю");

        System.out.println();

        /* 2 Дано число. С помощью тернарного оператора проверьте, делится ли оно на 3 и 5 одновременно.
        Выведите «Кратно» или «Не кратно» */

        int n = 15;
        System.out.println((n % 3 == 0 && n % 5 == 0) ? "Кратно" : "Не кратно");

        System.out.println();

        // 3 Для заданного числа верните строку «Четное» или «Нечетное», используя тернарный оператор.

        int m = 7;
        System.out.println((m % 2 == 0) ? "Четное" : "Нечетное");

        System.out.println();

        /* switch
        1 Дано число от 1 до 7. Выведите название дня недели. Если число вне диапазона, выведите «Ошибка» */

        int day = 5;
        switch (day) {
            case 1 -> System.out.println("Понедельник");
            case 2 -> System.out.println("Вторник");
            case 3 -> System.out.println("Среда");
            case 4 -> System.out.println("Четверг");
            case 5 -> System.out.println("Пятница");
            case 6 -> System.out.println("Суббота");
            case 7 -> System.out.println("Воскресенье");
            default -> System.out.println("Ошибка");
        }

        System.out.println();

        // 2 Дано число от 1 до 5. Выведите описание оценки (оцените свою работу)

        int grade = 0;
        switch (grade) {
            case 1 -> System.out.println("Очень плохо");
            case 2 -> System.out.println("Плохо");
            case 3 -> System.out.println("Удовлетворительно");
            case 4 -> System.out.println("Хорошо");
            case 5 -> System.out.println("Отлично");
            default -> System.out.println("Ошибка: введите число от 1 до 5");
        }

        System.out.println();

        /* for
        1 Дан список чисел. Посчитайте сумму всех четных элементов */

        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int sum = 0;
        for (int numb : numbers) {
            if (numb % 2 == 0) {
                sum += numb;
            }
        }
        System.out.printf("Сумма четных чисел: %s", sum);

        System.out.println();

        // 2 Дан список чисел. Найдите максимальное значение

        int[] nums = {1, 3, 7, 2, 0, 8, 4, 10, 5};
        int max = nums[0];
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > max) {
                max = nums[i];
            }
        }
        System.out.printf("Максимальное значение: %s", max);

        System.out.println();

        // 3 Дано число n. Выведите таблицу умножения для n от 1 до 10

        int s = 5;
        for (int i = 1; i <= 10; i++) {
            System.out.printf("%s * %s = %s\n", s, i, (s * i));
        }

        System.out.println();

        // 4 С помощью цикла for выведите числа от 10 до 1 в обратном порядке

        for (int i = 10; i >= 1; i--) {
            System.out.println(i);
        }

        System.out.println();

        // 5 Найдите количество четных чисел в диапазоне от 1 до 50

        int count = 0;
        for (int i = 1; i <= 50; i++) {
            if (i % 2 == 0) {
                count++;
            }
        }
        System.out.printf("Количество четных чисел в диапазоне от 1 до 50: %s", count);

        System.out.println();

        /* while
        1 Найдите наименьшее число больше 100, которое делится на 7 */

        int r = 101;
        while (r % 7 != 0) {
            r++;
        }
        System.out.printf("Наименьшее число больше 100, которое делится на 7: %s", r);

        System.out.println();

        // 2 Дано число n. Вычислите его факториал через цикл while

        int p = 6;
        long factorial = 1L;
        int i = 1;
        while (i <= p) {
            factorial *= i;
            i++;
        }
        System.out.printf("Факториал числа %s равен: %s", p, factorial);

        System.out.println();

        // 3 Дано число. Определите, является ли оно простым

        int k = 2;
        boolean isPrime = true;
        if (k <= 1 || (k % 2 == 0 && k != 2)) {
            isPrime = false;
        } else {
            int j = 3;
            while (j * j <= k) {
                if (k % j == 0) {
                    isPrime = false;
                    break;
                }
                j += 2;
            }
        }
        if (isPrime) {
            System.out.printf("%s является простым числом.", k);
        } else {
            System.out.printf("%s не является простым числом.", k);
        }

        System.out.println();

        /* 4 Придумать задачу самим
        Напишите программу, которая принимает на вход число и проверяет его на соответствие следующим условиям:
        Число должно быть положительным.
        Число должно быть меньше 100.
        Число должно быть кратным 5, 7 или 11.
        Число должно быть простым.
        Если все условия выполнены, вычислить и вывести сумму всех цифр числа.
        Если хотя бы одно условие не выполнено, вывести ошибку */

        int dig = 91;
        boolean valid = false;
        while (!valid) {
            if ((dig > 0) && (dig < 100) && (dig % 5 == 0 || dig % 7 == 0 || dig % 11 == 0)) {
                int sumOfDigits = 0;
                for (int temp = dig; temp > 0; temp /= 10) {
                    sumOfDigits += temp % 10;
                }
                System.out.printf("Сумма всех цифр числа %s равна %s", dig, sumOfDigits);
                valid = true;
            } else {
                System.out.println("Число не удовлетворяет всем условиям!");
            }
        }

        System.out.println();

        /* break & continue
        1 Выведите все числа от 1 до 20, кроме тех, что делятся на 3 */

        for (int l = 1; l <= 20; l++) {
            if (l % 3 == 0) {
                continue;
            }
            System.out.println(l);
        }

        System.out.println();

        // 2 Дан список чисел. Суммируйте элементы, пока не встретите отрицательное число

        int[] ints = {5, 10, 15, -3, 20, 25};
        int summa = 0;
        for (int y = 0; y < ints.length; y++) {
            if (ints[y] < 0) {
                break;
            }
            summa += ints[y];
        }
        System.out.printf("Сумма элементов до первого отрицательного числа: %s", summa);

        System.out.println();

        // 3 Дан список чисел. Суммируйте элементы, пока сумма не превысит 100

        int[] nombres = {20, 30, 15, 10, 35, 50};
        int somme = 0;
        for (int t = 0; t < nombres.length; t++) {
            if (somme + nombres[t] > 100) {
                break;
            }
            somme += nombres[t];
        }
        System.out.printf("Сумма элементов, пока она не превысила 100: %s", somme);
    }
}
