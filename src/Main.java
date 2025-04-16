public class Main {
    public static void checkingForLeapYear(int year) {
        if (year >= 1584) {
            if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
                System.out.println(year + " год является високосным.");
            } else {
                System.out.println(year + " год не является високосным.");
            }
        } else {
            System.out.println("Високосный год был введён только с 1584.");
        }
    }

    public static void checkingSystem(int clientOS, int clientDeviceYear) {
        if (clientOS == 0 && clientDeviceYear >= 2015) {
            System.out.println("Установите версию приложения для iOS по ссылке.");
        } else if (clientOS == 1 && clientDeviceYear >= 2015) {
            System.out.println("Установите версию приложения для Android по ссылке.");
        } else if (clientOS == 0 && clientDeviceYear < 2015) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке.");
        } else if (clientOS == 1 && clientDeviceYear < 2015) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке.");
        } else {
            System.out.println("Операционная система не распознана, попробуйте ручное обновление.");
        }
    }

    public static int calculationDelivery(int distance) {
        int time = 0;
        if (distance <= 20) {
            time += 1;
        } else if (distance > 20 && distance <= 60) {
            time += 2;
        } else if (distance > 60 && distance <= 100) {
            time += 3;
        }
        return time;
    }

    public static void main(String[] args) {

        System.out.println("Задача №1");
        int year = 2400;
        checkingForLeapYear(year);

        System.out.println("Задача №2");
        int clientOS = 1;
        int clientDeviceYear = 2014;
        checkingSystem(clientOS, clientDeviceYear);

        System.out.println("Задача №3");
        int deliveryDistance = 95;
        int deliveryTime = calculationDelivery(deliveryDistance);
        if (deliveryTime != 0) {
            System.out.println("Потребуется дней: " + deliveryTime);
        } else {
            System.out.println("Доставка невозможна.");
        }
    }


}