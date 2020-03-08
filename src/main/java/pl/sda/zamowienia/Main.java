package pl.sda.zamowienia;

public class Main {
    public static void main(String[] args) throws NameProductException, EmailException, AgeCustomerException {

        Customer customer = new Customer();
        customer.setName("MARIUSZ");
        customer.setLastname("KOT");
        customer.setAge(31);
        customer.setEmail("Wirus@gmail.com");

        Product product1 = new Product();
        product1.setCategory("TELEWIZOR");
        product1.setName("SAMSUNG LED50");
        product1.setPrice(3899.99);


        System.out.println(product1.getName());
    }

}
