public class Main
{
    public static void main(String[] args) {

        CreditPaymentService service = new CreditPaymentService();


        double totalOne = service.calculate(1_000_000, 0.0999/12, 12);
        int totalOneInt = (int) totalOne;
        System.out.println("Ежемесячный платеж = " + totalOneInt);

        double totalTwo = service.calculate(1_000_000, 0.0999/12, 24);
        int totalTwoInt = (int) totalTwo;
        System.out.println("Ежемесячный платеж = " + totalTwoInt);

        double totalThree = service.calculate(1_000_000, 0.0999/12, 36);
        int totalThreeInt = (int) totalThree;
        System.out.println("Ежемесячный платеж = " + totalThreeInt);

    }
}
