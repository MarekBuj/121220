package MovieDB;

public class Actor extends Staff{
    public Actor(String firstName, String lastName, double payment) {
        super(firstName, lastName, payment);
        setPayment(payment);
    }

    @Override
    public void setPayment(double payment) {
        this.payment = payment *2;
    }
}
