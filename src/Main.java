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
        // long warehouseRemains = 987 678 965 549L;
        //double weight = 2,768;
        short employers = 569;
        short money = -159;
        int moneyFot = 27897;
        byte container = 67;

        //Задача 3
        byte ludmilaPavlovna = 23;
        byte annaSergeevna = 27;
        byte ekaterinaAndreevna = 30;
        short listPackage = 480;
        int listForStudents = listPackage * 3 / (ludmilaPavlovna + annaSergeevna + ekaterinaAndreevna);
        System.out.println("На каждого ученика рассчитано " + listForStudents + " листов бумаги");

        //Задача 4
        byte machinePerformance = 16;
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
        int totalWeightGm =  bananas * bananasWeight + milk/100 * milkWeight + iceCream * iceCreamWeight + eggs * eggsWeight;
        float totalWeightKg = totalWeightGm / 1000f;
        System.out.println("Завтрак в граммах равен " + totalWeightGm);
        System.out.println("Завтрак в килограммах равен " + totalWeightKg);

        //Задача 7


    }
}