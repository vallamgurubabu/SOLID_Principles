public class SolidPrinciplesDemo {
    public static void main(String[] args) {
        // SRP
        Invoice invoice = new Invoice(1000);
        new InvoicePrinter().print(invoice);
        new InvoiceSaver().saveToFile(invoice);

        // OCP
        Discount discount = new FestiveDiscount();
        System.out.println("Discounted price: " + discount.apply(1000));

        // LSP
        Bird bird = new Sparrow();
        bird.fly();

        // ISP
        Human human = new Human();
        human.work();
        human.eat();

        Robot robot = new Robot();
        robot.work();

        // DIP
        Database db = new MySQLDatabase();
        DataAccess dataAccess = new DataAccess(db);
        dataAccess.loadData();
    }
}