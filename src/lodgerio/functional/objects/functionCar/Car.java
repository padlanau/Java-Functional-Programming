package lodgerio.functional.objects.functionCar;

public class Car {

    private String company;
    private int ID;
    public Car() {
    }
    public Car(String n, int a) {
        this.company = n;
        this.ID = a;
    }
    public String getCompany() {
        return company;
    }
    public void setCompany(String company) {
        this.company = company;
    }
    public int getID() {
        return ID;
    }
    public void setID(int ID) {
        this.ID = ID;
    }
}
