public class Chickens01 {
    public static void main(String[] args) {
    float totalEggs = 0;
    float chickenCount = 0;
    float eggsPerChicken = 0;

    eggsPerChicken = 5;
    chickenCount = 3;

    totalEggs += eggsPerChicken * chickenCount;

    chickenCount++;
    totalEggs += eggsPerChicken * chickenCount;

    chickenCount = chickenCount/2;
    totalEggs += eggsPerChicken * chickenCount;

        System.out.println(totalEggs);

    eggsPerChicken = 4;
    chickenCount = 8;
    totalEggs = 0;

    totalEggs = eggsPerChicken * chickenCount;

    chickenCount++;
    totalEggs += eggsPerChicken * chickenCount;

    chickenCount = chickenCount/2;
    totalEggs += eggsPerChicken * chickenCount;

        System.out.println(totalEggs);
    }
}
