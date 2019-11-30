package cert.ocp.test;

import java.util.*;
import java.util.concurrent.*;
import java.util.stream.*;

public class WeighAnimalActionRecursiveTest extends RecursiveAction {

    private int start;
    private int end;
    private Double[] weights;

    public WeighAnimalActionRecursiveTest(Double[] weights, int start, int end) {
        this.start = start;
        this.end = end;
        this.weights = weights;
    }

    @Override
    protected void compute() {
        if (end - start <= 3)
            for (int i = start; i < end; i++) {
                weights[i] = (double) new Random().nextInt(100);
                System.out.println("Animal Weighed: " + i);
            }
        else {
            int middle = start + ((end - start) / 2);
            System.out.println("[start=" + start + ",middle=" + middle + ",end=" + end + "]");
            invokeAll(new WeighAnimalActionRecursiveTest(weights, start, middle),
                    new WeighAnimalActionRecursiveTest(weights, middle, end));
        }
    }

    public static void main(String[] args) {
        Double[] weights = new Double[6];
        ForkJoinTask<?> task = new WeighAnimalActionRecursiveTest(weights, 0, weights.length);
        ForkJoinPool pool = new ForkJoinPool();
        pool.invoke(task);
        // Print results
        System.out.println();
        System.out.print("Weights: ");
        Stream.of(weights).forEach(
                d -> System.out.print(d.intValue() + ", "));
    }
}