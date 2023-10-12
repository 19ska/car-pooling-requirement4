import java.util.Scanner;

public class CarPool {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter car details:");
        System.out.print("ID: ");
        long id = scanner.nextLong();
        scanner.nextLine(); // Consume the newline character
        System.out.print("Name: ");
        String name = scanner.nextLine();
        System.out.print("Type (hatchback, sedan, utility): ");
        String carType = scanner.nextLine().toLowerCase();
        
        //Car car = null;

        switch (carType) {
            case "hatchback":
                System.out.print("Power Windows Enabled (true or false): ");
                boolean powerWindowsEnabled = scanner.nextBoolean();
                System.out.print("Automatic Gear (true or false): ");
                boolean automaticGear = scanner.nextBoolean();
                Car hatchback = new HatchBack(id, name, powerWindowsEnabled, automaticGear);
                System.out.print("Enter distance (km): ");
                double distance = scanner.nextDouble();
                double cost = hatchback.calculateDriveCost(distance);
                System.out.println("Cost is Rs " + cost);
                break;

            case "sedan":
                System.out.print("ABS Enabled (true or false): ");
                boolean absEnabled = scanner.nextBoolean();
                System.out.print("Boot Space (in liters): ");
                int bootSpace = scanner.nextInt();
                Car sedan = new Sedan(id, name, absEnabled, bootSpace);
                System.out.print("Enter distance (km): ");
                double distance1 = scanner.nextDouble();
                double cost1 = sedan.calculateDriveCost(distance1);
                System.out.println("Cost is Rs " + cost1);
                break;

            case "utility":
                System.out.print("Rear Cooling Vents (true or false): ");
                boolean rearCoolingVents = scanner.nextBoolean();
                Car utilitycar = new UtilityCar(id, name, rearCoolingVents);
                System.out.print("Enter distance (km): ");
                double distance3 = scanner.nextDouble();
                double cost3 = utilitycar.calculateDriveCost(distance3);
                System.out.println("Cost is Rs " + cost3);
                break;

            default:
                System.out.println("Invalid car type.");
                break;
        }

        
    }
}
//import java.util.Scanner;
//
//public class CarPool {
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        
//        System.out.println("Enter car details:");
//        System.out.print("ID: ");
//        long id = scanner.nextLong();
//        scanner.nextLine(); // Consume the newline character
//        System.out.print("Name: ");
//        String name = scanner.nextLine();
//        System.out.print("Type (hatchback, sedan, utility): ");
//        String carType = scanner.nextLine().toLowerCase();
//        
//        Car car = null;
//
//        switch (carType) {
//            case "hatchback":
//                System.out.print("Power Windows Enabled (true or false): ");
//                boolean powerWindowsEnabled = scanner.nextBoolean();
//                System.out.print("Automatic Gear (true or false): ");
//                boolean automaticGear = scanner.nextBoolean();
//                car = new HatchBack(id, name, powerWindowsEnabled, automaticGear);
//                break;
//
//            case "sedan":
//                System.out.print("ABS Enabled (true or false): ");
//                boolean absEnabled = scanner.nextBoolean();
//                System.out.print("Boot Space (in liters): ");
//                int bootSpace = scanner.nextInt();
//                car = new Sedan(id, name, absEnabled, bootSpace);
//                break;
//
//            case "utility":
//                System.out.print("Rear Cooling Vents (true or false): ");
//                boolean rearCoolingVents = scanner.nextBoolean();
//                car = new UtilityCar(id, name, rearCoolingVents);
//                break;
//
//            default:
//                System.out.println("Invalid car type.");
//                break;
//        }
//
//        if (car != null) {
//            System.out.print("Enter distance (km): ");
//            double distance = scanner.nextDouble();
//            double cost = car.calculateDriveCost(distance);
//            System.out.println("Cost is Rs " + cost);
//        }
//
//        scanner.close();
//    }
//}
