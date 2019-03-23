package Stock;

public class Stock {

    String company;
    double currentValue;
    double max;
    double min;

    public String getCompany() {
        return company;
    }

    public double getCurrentValue() {
        return currentValue;
    }

    public double getMax() {
        return max;
    }

    public double getMin() {
        return min;
    }

    public double updatePrice(double priceUpdate) {
        currentValue = priceUpdate;
        if (currentValue < min) {
            min = currentValue;
            return min;
        }
        if (max < currentValue) {
            max = currentValue;
            return max;
        }
        return currentValue;
    }

    public String printInformation() {
        return "Company: " + company + ", Current value: " + currentValue + ", Max value: " + max + ", Min value:" + min;
    }

    public Stock(String company, double currentValue) {
        this.company = company;
        this.currentValue = currentValue;
        max = currentValue;
        min = currentValue;
    }
}
