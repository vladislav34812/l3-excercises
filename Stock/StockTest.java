package Stock;

public class StockTest {
    public static void main(String[] args) {
        Stock nokia = new Stock("Nokia", 150);
        nokia.updatePrice(150.37);
        nokia.updatePrice(149.82);
        nokia.updatePrice(150.12);
        System.out.println(nokia.printInformation());


        StockTest testRunner = new StockTest();
        testRunner.test1();
    }

    public void test1() {
        String description = " \nShows current price,max price and min price,based on price value update";
        Stock target = new Stock("Sony", 170);
        target.updatePrice(170.22);
        target.updatePrice(168.15);
        target.updatePrice(170.15);

        String exprectedResult = "Company: " + target.getCompany() + ", Current value: " + target.getCurrentValue() + ", Max value: " + target.getMax() + ", Min value:" + target.getMin();
        String actualResult = target.printInformation();

        checkThatEquals(actualResult, exprectedResult, description);
    }

    public void checkThatEquals(String actualResult, String expectedResult, String testName) {
        if (actualResult.equals(expectedResult)) {
            System.out.println(actualResult + testName + " \nTest has passed!");
        } else {
            System.out.println(actualResult + testName + " \nTest has failed");
        }
    }
}

