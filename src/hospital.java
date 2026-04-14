public class hospital extends Building {
    int NumberOfBeds;

    public hospital(String Name, String Addres, String Floor, int NumberOfBeds){
        super(Name, Addres, Floor);
        this.NumberOfBeds = NumberOfBeds;

    }
}