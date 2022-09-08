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
        task9();
    }
    //task1
    public static void task1() {
        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
        }
        System.out.println();
    }
    //task2
    public static void task2() {
        for (int i = 10; i > 0; i--) {
            System.out.println(i);
        }
        System.out.println();
    }
    //task3
    public static void task3() {
        for (int i = 0; i < 18; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }
        System.out.println();
    }
    //task4
    public static void task4() {
        for (int i = 10; i >= -10; i--) {
            System.out.println(i);
        }
        System.out.println();
    }
    //task5
    public static void task5() {
        for (int i = 1904; i <= 2096; i = i + 4) {
            System.out.println(i + " год является високосным");
        }
        System.out.println();
    }
    //task6
    public static void task6() {
        int j = 7;
        for (int i = 1; i * j < 100; i++) {
            System.out.println(i * j);
        }
        System.out.println();
    }
    //task7
    public static void task7() {
        for (int i = 1; i < 512; i = i) {
            System.out.println(i = i * 2);
        }
        System.out.println();
    }
    //task8
    public static void task8() {
        int salary = 29000;
        int sum = 0;
        for (int i = 1; i <= 12; i++) {
            sum += salary;
            System.out.println("Месяц " + i + ", сумма накоплений равна " + sum + " рублей");
        }
        System.out.println();
    }
    //task9
    public static void task9() {
        double salary = 29000;
        double sum = 0;
        for (int i = 1; i <= 12; i++) {
            sum += salary;
            sum += sum*0.01;
            String formatSum = String.format("%.2f", sum);
            System.out.println("Месяц " + i + ", сумма накоплений равна " + formatSum + " рублей");
        }
        System.out.println();
    }
}