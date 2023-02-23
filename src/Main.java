public class Main {

    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
    }

    public static void task1() {
        System.out.println("Задача 1");
        int clientOS = 0;
        if (clientOS == 1) {
            System.out.println("Установите версию приложения для Android по ссылке...");
        }
        if (clientOS == 0) {
            System.out.println("Установите версию приложения для iOS по ссылке...");
        }
        else if (clientOS != 1 && clientOS != 0) {
            System.out.println("Неккоректно введено значение переменной.");
        }
    }
    public static void task2() {
        System.out.println("Задача 2");
        int clientOS = 0;
        int clientDeviceYear = 2010;
        if (clientOS == 1 && clientDeviceYear >= 2015) {
            System.out.println("Установите версию приложения для Android по ссылке...");
        }else if (clientOS ==1 && clientDeviceYear < 2015) {
                System.out.println("Установите облегченную версию приложения для Android по ссылке...");
            }
        if (clientOS == 0 && clientDeviceYear >= 2015) {
            System.out.println("Установите версию приложения для iOS по ссылке...");

        }else if (clientOS ==0 && clientDeviceYear < 2015) {
                System.out.println("Установите облегченную версию приложения для iOS по ссылке...");
            }
        else if (clientOS != 1 && clientOS != 0) {
            System.out.println("Неккоректно введено значение переменной.");
        }
    }
    public static void task3() {
        System.out.println("Задача 3");
        int year = 2023;
        if (year%4 == 0 && year%100 != 100 || year%400 ==0) {
            System.out.println("Год является високосным.");
        }else{
            System.out.println("Год високосным не является.");
        }
        }
    public static void task4() {
        System.out.println("Задача 4");
        int deliveryDistance = 109;
        if (deliveryDistance <20){
            System.out.println("Потребуется 1 день");
        }else if (deliveryDistance >=20 && deliveryDistance <60) {
            System.out.println("Потребуется 2 дня");
        }else if (deliveryDistance >=60 && deliveryDistance <=100) {
            System.out.println("Потребуется 3 дня");
        }else if (deliveryDistance >100){
            System.out.println("Доставка не осуществляется");
    }
    }
    public static void task5() {
        System.out.println("Задача 5");
        int monthNumber = 7;
        switch (monthNumber){
            case 1:
            case 2:
            case 12:
                System.out.println("Зима");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("Весна");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("Лето");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("Осень");
                break;
            default:
                System.out.println("Такого месяца нет");
        }
    }
}