public class Main {
    public static void main(String[] args) {

        // Объявляете переменные для входных данных и
        // параметров программы: начального счёта,
        // суммы пополнения и тп
        int initialInvoice = 100;
        int tranche = 1150;

        int bonus = tranche / 100;
        int total = bonus + tranche + initialInvoice;
        // Условным оператором проверяете превысила ли
        // сумма пополнения порог и для этих двух разных
        // сценариев рассчитываете сумму бонуса и выводите
        // на экран.
        System.out.println("bonus = ");
        System.out.println(bonus);
        System.out.println("_______________________________");
        System.out.println("total = ");
        System.out.println(total);
    }
}