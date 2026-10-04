public class PaymentModuleTest {
    public static void main(String[] args) {
        PaymentModule pm = new PaymentModule(0);
        Employee emp = new Manager("John", 40000, 12);
        pm.payment(emp);
        System.out.println("Total Pay: " + pm.totalPay);
    }
}