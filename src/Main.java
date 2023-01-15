public class Main {

    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
        task8();
    }

    public static void task1() {
        System.out.println("Задача 1.");
        int i = 0;
        int deposit = 0;
        while (deposit < 2459000) {
            i = i + 1;
            deposit = deposit + 15000;
            System.out.println("Месяц " + i + " сумма накоплений равна " + deposit + " рублей.");
        }
    }

    public static void task2() {
        System.out.println("Задача 2.");
        int i = 0;
        while (i < 10) {
            i = i + 1;
            System.out.print(i + " ");
        }
        System.out.println();
        for (i = 10; i > 0; i = i - 1) {
            System.out.print(i + " ");
            System.out.println();
        }
    }

    public static void task3() {
        System.out.println("Задача 3.");
        int population = 12_000_000;
        int year = 0;
        int lives = 17;
        int death = 9;
        while (year < 10) {
            year++;
            population = population / 1000 * (lives - death) + population;
            System.out.println("Год " + year + " численность населения составляет " + population);
        }
    }

    public static void task4() {
        System.out.println("Задача 4.");
        int summa = 15000;
        int i = 0;
        while (summa < 12_000_000) {
            summa = (summa / 100 * 7) + summa;
            i = i + 1;
            System.out.println(summa + " накопления за " + i + " месяц.");
        }
        if (summa >= 12_000_000) {
            System.out.println(i + " месяцев.");
        }
    }

    public static void task5() {
        System.out.println(" Задача 5.");
        int summa = 15000;
        int i = 0;
        while (summa < 12_000_000) {
            summa = summa / 100 * 7 + summa;
            i = i + 1;
            if (i % 6 == 0) {
                System.out.println(summa + " накопления за " + i + " месяц.");
            }
            if (summa >= 12_000_000) {
                System.out.println(i + " месяцев.");
            }
        }
    }

    public static void task6() {
        System.out.println("Задача 6.");
        int summa = 15000;
        int i = 0;
        while (i < 108) {
            summa = summa / 100 * 7 + summa;
            i = i + 1;
            if (i % 6 == 0) {
                System.out.println(summa + " накопления за " + i + " месяц.");
            }
        }
    }

    public static void task7() {
        System.out.println("Задача 7.");
        int friday = 1;
        while (friday <= 31) {
            System.out.println("Сегодня пятница," + friday + "-е число. Необходимо подготовить отчет");
            friday = friday + 7;
        }
    }

    public static void task8() {
        System.out.println("Задача 8.");
        int i = 0;
        while (i < 2023) {
            i = i + 79;
            if (i > 1823) {
                System.out.println(i);
            }
        }
    }
}