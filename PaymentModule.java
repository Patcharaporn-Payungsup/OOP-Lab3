public class PaymentModule {
    protected double totalPay;

    public PaymentModule(double totalPay) {
        this.totalPay = totalPay;
    }

    public void payment(Employee e) {
        if (e == null) return;
        double pay = e.computePay();

        if (e instanceof Manager) {
            Manager m = (Manager) e;
        }
        totalPay += pay;
    }
}