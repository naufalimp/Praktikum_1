import java.util.Scanner;

public class main {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        Building Building = null;
        while (true){
            System.out.println("\n======================================");
            System.out.println("Welcome to Smart City Management System");
            System.out.println("1. Add New Building");
            System.out.println("2. View All buildings");
            System.out.println("3. Exit");
            System.out.println("========================================");
            System.out.print("Pilih menu :  ");
            int pilih = input.nextInt();
            input.nextLine();

            switch (pilih) {
                case 1:
                    System.out.println("\n========================================");
                    System.out.print("Name Building : ");
                    String building = input.nextLine();

                    System.out.print("Addres : ");
                    String Addres = input.nextLine();

                    System.out.print("floor : ");
                    String floor = input.nextLine();


                    Building= new Building(building, Addres, floor);

                    System.out.println("\n========================================");
                    System.out.println("Building data");
                    System.out.println("Name building: " + building);
                    System.out.println("Addres: " + Addres);
                    System.out.println("floor: " + floor);
                    System.out.println("========================================");
                    System.out.println("sucsess to add");

                    break;
                case 2:
                    if (Building != null) {
                        Building.displayBuildInfo();
                    } else {
                        System.out.println("TIDAK ADA DATA");
                    }


                    break;

                case 3:
                    System.out.println("the end");
                    break;

                default:
                    System.out.println("invalid option");

            }

        }
    }
}
