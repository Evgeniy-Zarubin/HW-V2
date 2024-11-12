public class Main {
    public static void main(String[] args) {
        //Задача 1
        byte pallet = 105;
        short box = 321;
        int items = 14456;
        long palletItems = 65552214L;
        float quantity = 381.4f;
        double stamps = 224.9999221144;
        System.out.println("Значение переменной pallet с типом byte равно " + pallet);
        System.out.println("Значение переменной box с типом short равно " + box);
        System.out.println("Значение переменной items с типом int равно " + items);
        System.out.println("Значение переменной palletItems с типом long равно " + palletItems);
        System.out.println("Значение переменной quantity с типом float равно " + quantity);
        System.out.println("Значение переменной stamps с типом double равно " + stamps);

        //Задача 2
        float palletQuantity = 27.12f;
        long warehouseRemains = 987678965549L;
        double L = 2.786;
        short employers = 569;
        short money = -159;
        short moneyFot = 27897;
        byte container = 67;

        //Задача 3
        byte ludmilaPavlovna = 23;
        byte annaSergeevna = 27;
        byte ekaterinaAndreevna = 30;
        short listPackage = 480;
        int listForStudents = listPackage / (ludmilaPavlovna + annaSergeevna + ekaterinaAndreevna);
        System.out.println("На каждого ученика рассчитано " + listForStudents + " листов бумаги");

        //Задача 4
        byte machinePerformance = 16 / 2;
        byte performance1 = 20;
        short performanceDay = 1440;
        short performanceDay3 = 4320;
        int performanceMonth = 43776;
        int machinePerformance1 = machinePerformance * performance1;
        int machinePerformanceDay = machinePerformance * performanceDay;
        int machinePerformanceDay3 = machinePerformance * performanceDay3;
        int machinePerformanceMonth = machinePerformance * performanceMonth;
        System.out.println("За 20 минут машина произвела " + machinePerformance1 + " штук бутылок");
        System.out.println("За день машина произвела " + machinePerformanceDay + " штук бутылок");
        System.out.println("За 3 дня машина произвела " + machinePerformanceDay3 + " штук бутылок");
        System.out.println("За месяц машина произвела " + machinePerformanceMonth + " штук бутылок");

        //Задача 5
        byte allJars = 120;
        byte whiteJar = 2;
        byte brownJar = 4;
        int allClassJar = allJars / (whiteJar + brownJar);
        int white = allClassJar * whiteJar;
        int brown = allClassJar * brownJar;
        System.out.println("В школе, где " + allClassJar + " классов, нужно " + white + " банок белой краски и " + brown + " банок коричневой краски");

        //Задача 6
        byte bananas = 5;
        byte bananasWeight = 80;
        short milk = 200;
        byte milkWeight = 105;
        byte iceCream = 2;
        byte iceCreamWeight = 100;
        byte eggs = 4;
        byte eggsWeight = 70;
        int totalWeightGm = bananas * bananasWeight + milk / 100 * milkWeight + iceCream * iceCreamWeight + eggs * eggsWeight;
        float totalWeightKg = totalWeightGm / 1000f;
        System.out.println("Завтрак в граммах равен " + totalWeightGm);
        System.out.println("Завтрак в килограммах равен " + totalWeightKg);

        //Задача 7
        short target = 7;
        target = 7 * 1000;
        short weightLoss1 = 250;
        short weightLoss2 = 500;
        int target250 = target / weightLoss1;
        int target500 = target / weightLoss2;
        System.out.println(target250 + " дней нужно для потери 7 кг по 250 грамм");
        System.out.println(target500 + " дней нужно для потери 7 кг по 500 грамм");

        //Задача 8
        int masha = 67760;
        int denis = 83690;
        int kristina = 76230;
        int indexingMasha = masha * 10/100 + masha;
        int indexingDenis = denis * 10/100 + denis;
        int indexingKristina = kristina * 10/100 + kristina;
        int ReduceMasha = indexingMasha * 12 - masha * 12;
        int ReduceDenis = indexingDenis * 12 - denis * 12;
        int ReduceKristina = indexingKristina * 12 - kristina * 12;
        System.out.println("Маша теперь получает " + indexingMasha + " рублей. " + "Годовой доход вырос на " + ReduceMasha + " рублей"  );
        System.out.println("Денис теперь получает " + indexingDenis + " рублей. " + "Годовой доход вырос на " + ReduceDenis + " рублей"  );
        System.out.println("Кристина теперь получает " + indexingKristina + " рублей. " + "Годовой доход вырос на " + ReduceKristina + " рублей"  );
    }
}