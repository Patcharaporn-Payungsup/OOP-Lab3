public class AdvancedPaymentModuleTest {
    public static void main(String[] args) {
        Employee[] list = new Employee[3];
        list[0] = new Fulltimer("Alice", 30000);
        list[1] = new Manager("Bob", 50000, 12);
        list[2] = new Hourly("Charlie", 200, 40);

        AdvancedPaymentModule apm = new AdvancedPaymentModule(0);
        apm.payment(list);

        System.out.println("Total Pay processed: " + apm.totalPay);
    }
}