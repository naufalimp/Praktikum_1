import java.util.Scanner;

public class main {
    static void main(String[] args){
        Scanner input = new Scanner(System.in);
        while (true){
            System.out.println("\n======================================");
            System.out.println("Welcome to Smart City Management System");
            System.out.println("1. Add New Building");
            System.out.println("2. View All buildings");
            System.out.println("3. Exit");
            System.out.println("========================================");
            System.out.println("Pilih menu :  ");
            int pilih = input.nextInt();
            input.nextLine();

            switch (pilih) {
                case 1:
                    System.out.println("\n========================================");
                    System.out.println("Name Building : ");
                    String building = input.nextLine();

                    System.out.println("Addres : ");
                    String Addres = input.nextLine();

                    System.out.println("floor : ");
                    String floor = input.nextLine();

                    System.out.println("\n========================================");
                    System.out.println("Building data");
                    System.out.println("Name building: " + building);
                    System.out.println("Addres: " + Addres);
                    System.out.println("floor: " + floor);
                    System.out.println("========================================");
                    System.out.println("sucsess to add");

                    break;
                case 2:
                    System.out.println("coming soon");
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
