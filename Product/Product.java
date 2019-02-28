package Product;

public class Product {
    private String name;
    private double regularPrice;
    private double discount;
    private double calculateActualPrice() {
        return regularPrice - discount / 100 * regularPrice;
    }//Discount calculating formula

    private String printInformation;

    public String getName(String name){
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getRegularPrice() {
        return regularPrice;
    }

    public void setRegularPrice(double regularPrice) {
        this.regularPrice = regularPrice;
    }

    public double getDiscount() {
        return getDiscount();
    }
    public void setDiscount(double discount) {

        this.discount = discount;
    }
    public String getPrintInformation() {
        return "Имя продукта: "+name+" ,обычная цена "+regularPrice+" ,скидка "+discount+" % ";
    }
    public double getCalculateActualPrice(){
        return calculateActualPrice();
    }
}

