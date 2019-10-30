package exercises.thread;

import java.util.concurrent.CountDownLatch;

/**
 * @description: 请设计修改程序，以确保 two() 方法在 one() 方法之后被执行，three() 方法在 two() 方法之后被执行。
 * @author: liu_chao[liu_chao2@suixingpay.com]
 * @data: 2019-10-12 15:03
 */
public class Solution1114 {

    //执行用时 :14 ms, 在所有 Java 提交中击败了86.76%的用户
    //内存消耗 :36.1 MB, 在所有 Java 提交中击败了100.00%的用户
    //private volatile int flag = 0;

    private CountDownLatch one = new CountDownLatch(1);

    private CountDownLatch two = new CountDownLatch(1);


    public Solution1114() {

    }

    public void first(Runnable printFirst) throws InterruptedException {

        // printFirst.run() outputs "first". Do not change or remove this line.
        printFirst.run();
        one.countDown();
    }

    public void second(Runnable printSecond) throws InterruptedException {

        // printSecond.run() outputs "second". Do not change or remove this line.
        one.await();
        printSecond.run();
        two.countDown();
    }

    public void third(Runnable printThird) throws InterruptedException {

        // printThird.run() outputs "third". Do not change or remove this line.
        two.await();
        printThird.run();
    }

    public static void main(String[] args) throws InterruptedException {
        Solution1114 solution1114 = new Solution1114();
        int[] threads = {3,2,1};
        Runnable r1 = new Runnable() {
            @Override
            public void run() {
                System.out.print("one");
            }
        };
        Runnable r2 = new Runnable() {
            @Override
            public void run() {
                System.out.print("two");
            }
        };
        Runnable r3 = new Runnable() {
            @Override
            public void run() {
                System.out.print("three");
            }
        };
        solution1114.third(r3);
        solution1114.second(r2);
        solution1114.first(r1);
    }
}
