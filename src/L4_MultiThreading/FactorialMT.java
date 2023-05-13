package L4_MultiThreading;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

public class FactorialMT {

    private static class MyThread extends Thread {

        private int num;
        private BigInteger result;

        public MyThread(int num) {
            this.num = num;
            result = BigInteger.ONE;
        }

        @Override
        public void run() {

            for(int i=2;i<=num;i++) {
                result = result.multiply(BigInteger.valueOf(i));
            }
        }
    }

    public static void main(String[] args) throws InterruptedException {
        List<Integer> nums = List.of(2000,4000,5000,6000);

        MyThread [] threads = new MyThread[nums.size()];

        for(int i=0;i<nums.size();i++) {
            threads[i] = new MyThread(nums.get(i));
            threads[i].start();
        }

        for(int i=0;i< nums.size();i++) {
              threads[i].join();
            System.out.println(threads[i].result);
        }
    }
}
