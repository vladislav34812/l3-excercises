package Car;

public class Car {
    private String manufacturer;
    private String color;
    private int year;

    public String getManufacturer(){
        return manufacturer;
    }
    public String getColor(){
        return color;
    }
    public int getYear(){
        return year;
    }
    public void setManufacturer(String manufacturer){
        this.manufacturer = manufacturer;
    }
    public void setColor(String color){
        this.color = color;
    }

    public void setYear(int year) {
        this.year = year;
    }
}
