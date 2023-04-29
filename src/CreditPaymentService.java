public class CreditPaymentService {
    public int calculate(int creditSum, int periodYear, double percent) {
        double result = creditSum * (((Math.pow((1 + percent / 100 / 12), periodYear * 12)) * percent / 100 / 12) / ((Math.pow((1 + percent / 100 / 12), periodYear * 12)) - 1));
        System.out.println();
        System.out.println("Сумма кредита, руб.: " + creditSum);
        System.out.println("Сумма кредита, лет: " + periodYear);
        System.out.println("Процент: " + percent + "%");
        return (int) result;
    }

}
