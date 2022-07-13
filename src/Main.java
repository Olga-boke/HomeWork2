public class Main {
    public static void main(String[] args) {
        // Задание 1
        byte men = 5;
        short women = 10;
        int cat =200;
        long dog =1535L;
        float box = 15.25f;
        double Box = 17.541;
        char apple =35;
        boolean menInAdult = men > 10;
        System.out.println( menInAdult );

        // Задание 2
       double boxer1 = 78.2;
       double boxer2 = 82.7;
       double weighOfAllBoxers = boxer1 + boxer2;
       System.out.println( " Общий вес боксеров " + weighOfAllBoxers + " кг ");
       double weighDifferenceBoxers = boxer2 - boxer1;
       System.out.println(" Разница в весе боксеров " + weighDifferenceBoxers + " кг " );

        // Задание 3

        int bananas = 5;
        int weightBananas =80;
        int milk = 2;
        int weightMilk = 105;
        int icecream = 2;
        int icecreamWeight = 100;
        int eggs = 4;
        int eggsWeight = 70;
        int allWeight = bananas * weightBananas + milk * weightMilk + icecream * icecreamWeight + eggs * eggsWeight;
        double allWeintKG = allWeight / 1000.0;
        System.out.println(" Вес всего завтрака " + allWeight + " грамм ");
        System.out.println( " Вес всего завтрака " + allWeintKG + " кг ");

        // Задание 4
        int allLoseWeinghtKg = 7;
        int dayLoseWeinghtGr1 = 250;
        int dayLoseWeinghtGr2 = 500;
        double allLoseWeingGr = allLoseWeinghtKg * 1000.0;
        double day1 = allLoseWeingGr / dayLoseWeinghtGr1;
        double day2 = allLoseWeingGr / dayLoseWeinghtGr2;
        double averageDay = (day1 + day2) / 2;
        System.out.println(" В среднем надо " + averageDay + " день для похудения ");

        // Задание 5

        int masha1 = 67_760;
        int denis1 = 83_690;
        int kristina1 = 76_230;
        double masha2 = masha1 / 100.0 * 10.0;
        double denis2 = denis1 /100.0 *10.0;
        double kristina2 = kristina1 /100.0 *10.0;
        double increasedMasha = masha1 + masha2;
        double increasedDenis = denis1 + denis2;
        double increasedKristina = kristina1 + kristina2;
        double differenceMasha = increasedMasha - masha1;
        double differenceDenis = increasedDenis - denis1;
        double differenceKristina = increasedKristina - kristina1;
        System.out.println(" Кристина теперь получает " + increasedKristina + "рублей. Годовой доход вырос " + differenceKristina + " рублей ");

    }
}