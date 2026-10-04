public class AdvancedPaymentModule extends PaymentModule {
    public AdvancedPaymentModule(double totalPay) {
        super(totalPay);
    }

    public void payment(Employee[] employees) {
        if (employees == null) return;
        for (Employee e : employees) {
            super.payment(e);
        }
    }
}