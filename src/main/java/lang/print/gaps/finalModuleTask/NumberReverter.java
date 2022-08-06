package lang.print.gaps.finalModuleTask;

public class NumberReverter {
    public void revert(int number) {
        int number1 = number / 100;
        int number2 = number % 1000 % 100 / 10 * 10;
        int number3 = number % 1000 % 100 % 10 * 100;
        System.out.println(number1+ number2 + number3);
    }
}
