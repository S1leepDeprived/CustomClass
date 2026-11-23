public class Garage {
   
   // instance varibles
   private int horsepower;
   private int numSeats;
   private  int year;
   private int LastMaintenanceYear;
   private double cost;
   private double weight;
   private double mileage;
   private boolean isManual;
   private boolean isGas;
   private String driveTrainType;
   private String carType;
   private String modList;
   private String name;
   private String color;
   
   //constructors
   public Garage(String name, int year, double mileage) {
      this.name = name;
      this.year = year;
      this.mileage = mileage;
   }
   
   public Garage() {
      int horsepower = 215;
      int numSeats = 2;
      int year = 1989;
      int LastMaintenanceYear =2025;
      double cost = 14000;
      double weight = 2137.75;
      double mileage  = 12000;
      boolean isManual = true;
      boolean isGas = true;
      String driveTrainType = "5 speed manual";
      String carType = "Eunos Roadster";
      String modList = "wide body kit, turbo";
      String name = "Na mx5 Miata";
      String color  = "Midnight Purple";
   }
   public Garage(String name, String carType, String driveTrainType, String color, String modList, boolean isManual, boolean isGas, double mileage, double weight, double cost, int horsepower, int numSeats, int year, int LastMaintenanceYear) {
      this.horsepower = horsepower;
      this.numSeats = numSeats;
      this.year = year;
      this.LastMaintenanceYear =LastMaintenanceYear;
      this.cost = cost;
      this.weight = weight;
      this.mileage  = mileage;
      this.isManual = isManual;
      this.isGas = isGas;
      this.driveTrainType = driveTrainType;
      this.carType = carType;
      this.modList = modList;
      this.name = name;
      this.color  = color;
   
  }
   //methods
   
   // add mods allows you to add a list of mods, and says "(mod) has been added to (car name)"
   public void addMod(String mod) {
      
   }
   
   // remove mod allows you to take a mod off the list and says "(mod) has been removed from (cat name)"
   public void removeMod(String mod) {
   
   }
   
   //maitnecne updates the year maintnece was done to the current year and says time since last maintnece
   public void maintenance() {
   
   }
   
   //drive allows you to add a certain number of miles to the car and displays the current mileage
   public  void drive(double miles) {
      
   }
   
   // paint allows you to change color of the car
   public void paint(String paintColor) {
   
   }
   
   //stats displays the current stats of the car
   public String stats() {
      return null;
   }
   
   public static void main(String args[]) {
      System.out.println("test");
   }
}