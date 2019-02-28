package Product;

    public class ProductTest {
    public static void main(String[]args){
        Product product1 = new Product();
        product1.setName("Молоко");
        product1.setRegularPrice(15.99);
        product1.setDiscount(20.0);

        System.out.println(product1.getPrintInformation()+" ,цена со скидкой "+ product1.getCalculateActualPrice());
    }
}
