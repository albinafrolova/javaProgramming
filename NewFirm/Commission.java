/**
 *
 * @author albinafrolova
 */
public class Commission extends Hourly {

    private int comissionRate;
    double totalSales2, commissionRate, payment;

    public Commission(String eName, String eAddress, String ePhone,
            String socSecNumber, double rate, double commissionRate2) {
        super(eName, eAddress, ePhone, socSecNumber, rate);

        commissionRate = commissionRate2;
    }

    public double addSales(double totalSales) {
        totalSales2 = totalSales;

        return totalSales2;
    }

    public double pay() {
        payment = super.pay();
        payment += (totalSales2 * commissionRate);
        totalSales2 = 0.0;
        return payment;
    }

    public String toString() {
        String result = super.toString();
        result += "\nTotal Sales: " + totalSales2;
        return result;
    }
}
