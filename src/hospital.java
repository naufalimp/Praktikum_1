public class Hospital extends Building {
    int NumberOfBeds;

    public Hospital(String Name, String Addres, int Floor, int NumberOfBeds){
        super(Name, Addres, Floor);
        this.NumberOfBeds = NumberOfBeds;

    }
}