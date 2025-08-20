public class Chickens02 {
    public static void main(String[] args) {
      int eggsMonday = 100;
      int eggsTuesday = 121;
      int eggsWednesday = 117;

      double dailyAverage = 0;
      double monthlyAverage = 0;
      double monthlyProfit = 0;

      dailyAverage = (eggsTuesday+eggsMonday+eggsWednesday)/3.0;
      monthlyAverage = dailyAverage * 30;
      monthlyProfit = monthlyAverage * 0.18;

        System.out.println("Daily Average:  " + dailyAverage);
        System.out.println("Month Average:  " + monthlyAverage);
        System.out.println("Month Profit:   $" + monthlyProfit + " Dolares");

    }
    
}
