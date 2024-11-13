//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int customer_account = 750;
        int deposit_amount = 1250;
        int bonus;
        if (deposit_amount >= 1000) {
            bonus = deposit_amount / 100;
        } else {
            bonus = 0;
        }
        int Account_total = deposit_amount + customer_account + bonus;
        System.out.printf("На Вашем счету: " + Account_total);
        System.out.printf("     Начислено бонусов: " + bonus);

    }
}
