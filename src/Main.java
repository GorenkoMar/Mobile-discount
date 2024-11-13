//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

  public static void main(String[] args) {
    int customerAccount = 750;
    int depositAmount = 1250;
    int bonus;
    if (depositAmount >= 1000) {
      bonus = depositAmount / 100;
    } else {
      bonus = 0;
    }
    int accountTotal = depositAmount + customerAccount + bonus;
    System.out.printf("На Вашем счету: " + accountTotal);
    System.out.printf("     Начислено бонусов: " + bonus);

  }
}
