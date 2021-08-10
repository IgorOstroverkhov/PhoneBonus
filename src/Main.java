public class Main {
    public static void main(String[] args) {

        // Объявляете переменные для входных данных и
        // параметров программы: начального счёта,
        // суммы пополнения и тп
        int invoice = 100;
        int tranche = 150;
        int x = 1000;
        int total;
        int bonus;
//boolean trancheReal = true;
        if (x > tranche) {
            bonus = 0;
            //int total;
            //System.out.println("total = ");
            //System.out.println(total);
        } else
            bonus = tranche / 100;
        total = bonus + invoice + tranche;
        System.out.println("bonus = ");
        System.out.println(bonus);
        System.out.println("_______________________________");
        System.out.println("total = ");
        System.out.println(total);

    }
}
