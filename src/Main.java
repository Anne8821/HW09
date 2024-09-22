//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println("Задача 1");
        int totalSalary = 0;
        int [] salaryArray = {123, 456, 789, 765, 543};
        for (int salary : salaryArray){
            totalSalary += salary;
        }
        System.out.println("Сумма трат за месяц составила " + totalSalary + " рублей");
        System.out.print("");

        System.out.println("Задача 2");
        int [] arr = {123, 456, 789, 765, 543};
        int min = arr [0];
        int max = arr [0];

        for (int element : arr){
            if (element < min){
                min = element;
            }else if (element > max){
                max = element;
            }
        }
        System.out.println("Минимальная сумма трат за неделю составила " + min + " рублей.");
        System.out.println("Максимальная сумма трат за неделю составила " + max + " рублей");
        System.out.print("");

        System.out.println("Задача 3");
        int totalMoney = 0;
        int [] moneyArray = {123, 456, 789, 765, 543};
        for (int money : moneyArray){
            totalMoney += money;
        }
        System.out.println("Средняя сумма трат за месяц составила " + totalMoney / moneyArray.length + " рублей");
        System.out.print("");

        System.out.println("Задача 4");
        char [] reverseFullName = {'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for (int i = reverseFullName.length-1; i >= 0 ; i--) {
            System.out.print(reverseFullName[i]);
        }
    }
}