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

    public static void task1(){
        System.out.println("Задание 1");
        int i = 1234;
        byte b = 120;
        short s = 354;
        long l = 76589430;
        float f = 1.43f;
        double d = 1.5;
        System.out.println("Значение переменной i с типом int равно " + i);
        System.out.println("Значение переменной b с типом byte равно " + b);
        System.out.println("Значение переменной s с типом short равно " + s);
        System.out.println("Значение переменной l с типом long равно " + l);
        System.out.println("Значение переменной f с типом float равно " + f);
        System.out.println("Значение переменной d с типом double равно " + d);
    }

    public static void task2(){
        System.out.println("Задание 2");
        float numder1 = 27.12f;
        long numder2 = 987_678_965_549L;
        double number3 = 2.786;
        short number4 = 569;
        short number5 = -159;
        int number6 = 27897;
        byte number7 = 67;
    }
    public static void task3(){
        System.out.println("Задание 3");
        byte studentsLP = 23;
        byte studentsAS = 27;
        byte studentsEA = 30;
        byte studentsAll = (byte) (studentsLP + studentsAS + studentsEA);
        byte result = (byte) (480 / studentsAll);
        System.out.println("На каждого ученика рассчитано " + result + " листов бумаги");
    }
    public static void task4(){
        System.out.println("Задание 4");
        byte productivity = 16/2;
        byte workTime1 = 20;
        short workTime2 = 24*60;
        short workTime3 = 3*24*60;
        int workTime4 = 30*24*60;
        System.out.println("За 20 минут машина произвела " + (workTime1 * productivity) + " штук бутылок");
        System.out.println("За сутки машина произвела " + (workTime2 * productivity) + " штук бутылок");
        System.out.println("За 3 дня машина произвела " + (workTime3 * productivity) + " штук бутылок");
        System.out.println("За 30 дней машина произвела " + (workTime4 * productivity) + " штук бутылок");

    }
    public static void task5(){
        System.out.println("Задание 5");
        byte needWhiteColor = 2;
        byte needBrownColor = 4;
        byte allColor = 120;
        byte classes = (byte) (allColor / (needBrownColor + needWhiteColor));
        byte whiteColor = (byte) (classes * needWhiteColor);
        byte brownColor = (byte) (classes * needBrownColor);
        System.out.println("В школе, где " + classes + " классов, нужно " + whiteColor + " банок белой краски и " +
                brownColor + " банок коричневой краски");
    }
    public static void task6(){
        System.out.println("Задание 6");
        byte banana = 5;
        byte weightBanana = 80;
        byte milk = 2;
        byte weightmilk = 105;
        byte iceCream = 2;
        byte weighticeCream = 100;
        byte egg = 4;
        byte weightegg = 70;
        short weightGram = (short) (banana * weightBanana + milk * weightmilk + iceCream * weighticeCream +
                egg * weightegg);
        float weightKg = (float) weightGram / 1000;
        System.out.printf("Вес завтрака %d грамм или %.2f килограмм.%n" ,weightGram ,weightKg);
    }
    public static void task7(){
        System.out.println("Задание 7");
        short weightMin = 250;
        short weightMax = 500;
        float averageWeight = (weightMin + weightMax) / 2f;
        short diet1 = (short) (7 * 1000 / weightMin);
        short diet2 = (short) (7 * 1000 / weightMax);
        float average = 7 * 1000 / averageWeight;
        System.out.println("Потребуется " + diet1 + " дней теряя 250гр в день.");
        System.out.println("Потребуется " + diet2 + " дней теряя 500гр в день.");
        System.out.printf("В среднем уйдет %.2f дней%n", average);
    }
    public static void task8(){
        System.out.println("Задание 8");
        int salaryMasha = 67760;
        int salaryDenis = 83690;
        int salaryKristina = 76230;
        int yearSalaryMasha = salaryMasha * 12;
        int yearSalaryDenis = salaryDenis * 12;
        int yearSalaryKristina = salaryKristina * 12;
        salaryMasha += 67760 / 10;
        salaryDenis += 83690 / 10;
        salaryKristina += 76230 / 10;
        int newYearSalaryMasha = salaryMasha * 12;
        int newYearSalaryDenis = salaryDenis * 12;
        int newYearSalaryKristina = salaryKristina * 12;
        System.out.println("Маша теперь получает " + salaryMasha + " рублей. Годовой доход вырос на " +
                (newYearSalaryMasha - yearSalaryMasha) + " рублей");
        System.out.println("Деним теперь получает " + salaryDenis + " рублей. Годовой доход вырос на " +
                (newYearSalaryDenis - yearSalaryDenis) + " рублей");
        System.out.println("Кристина теперь получает " + salaryKristina + " рублей. Годовой доход вырос на " +
                (newYearSalaryKristina - yearSalaryKristina) + " рублей");
    }
}