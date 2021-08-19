public class CreditPaymentService {

    public double calculate(int creditSumm, double percent, int monthNumber) {

        double element = Math.pow((1+percent),monthNumber);
        double payment = creditSumm * (percent+ percent/(element-1));

        return payment;
    }


}
