package academy.devdojo.maratonajava.javacore.ZZEstreams.test;

import java.util.stream.LongStream;
import java.util.stream.Stream;

public class StreamTest16 {
    public static void main(String[] args) {
        long num = 100_000_000;
        sumFor(num);
        sumStremIterate(num);
        sumParallelIterate(num);
        sumLongIterate(num);
        sumParallelLongIterate(num);
    }

    private static void sumFor(long num) {
        long result = 0;
        long init = System.currentTimeMillis();
        for (long i = 1; i <= num; i++) {
            result += i;
        }
        long end = System.currentTimeMillis();
        System.out.println(result+ " " +(end-init)+ " ms");
    }

    private static void sumStremIterate(long num) {
        long init = System.currentTimeMillis();
        long result = Stream.iterate(1L, i -> i+ 1).limit(num).reduce(0L, Long::sum);
        long end = System.currentTimeMillis();
        System.out.println(result+ " " +(end-init)+ " ms");
    }

    private static void sumParallelIterate(long num) {
        long init = System.currentTimeMillis();
        long result = Stream.iterate(1L, i -> i+ 1).parallel().limit(num).reduce(0L, Long::sum);
        long end = System.currentTimeMillis();
        System.out.println(result+ " " +(end-init)+ " ms");
    }

    private static void sumLongIterate(long num) {
        long init = System.currentTimeMillis();
        long result = LongStream.rangeClosed(1L, num).reduce(0L, Long::sum);
        long end = System.currentTimeMillis();
        System.out.println(result+ " " +(end-init)+ " ms");
    }

    private static void sumParallelLongIterate(long num) {
        long init = System.currentTimeMillis();
        long result = LongStream.rangeClosed(1L, num).parallel().reduce(0L, Long::sum);
        long end = System.currentTimeMillis();
        System.out.println(result+ " " +(end-init)+ " ms");
    }
}
