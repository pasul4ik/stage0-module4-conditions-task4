package school.mjc.stage0.conditions.task4;

public class MaxNumberPrinter {
    public void printGreatest(int first, int second, int third) {
        int max = first;

        if (first < second) {
            max = second;
        }
        else if (first < third) {
            max = third;
        }
        else {
            System.out.println(first);
        }

    }
}
//1. Greatest from 3.
//        Implement the program that will consume 3 numbers from method arguments
//        and it will print the print greatest out of three.
//        In case if there are more than 1 biggest -> print any of them.(Libraries are forbidden)

