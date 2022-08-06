package lang.print.gaps.finalModuleTask;

public class NumbersPrinter {
    public void printIsPositive(int number) {
        String[] result = {"true", "false"};
        System.out.println(result[(number >> 31) & 1]);
    }
}
