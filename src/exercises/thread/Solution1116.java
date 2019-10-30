package exercises.thread;

import java.util.function.IntConsumer;

/**
 * @description: 每个线程都有一个 printNumber 方法来输出一个整数。请修改给出的代码以输出整数序列 010203040506... ，其中序列的长度必须为 2n
 * @author: liu_chao[liu_chao2@suixingpay.com]
 * @data: 2019-10-17 17:22
 */
public class Solution1116 {

    private int n;

    private static volatile int flag = 0;

    public Solution1116(int n) {
        this.n = n;
    }

    // printNumber.accept(x) outputs "x", where x is an integer.
    public void zero(IntConsumer printNumber) throws InterruptedException {
        for (int i = 1; i < n; i++) {
            while (flag % 2 != 0);
            Thread.yield();
            printNumber.accept(0);
            flag++;

        }
    }

    public void odd(IntConsumer printNumber) throws InterruptedException {
        for (int i = 3; i <= n; i = i+2) {
            while (flag % 4 != 1);
            printNumber.accept(i);
            flag++;
        }
    }

    public void even(IntConsumer printNumber) throws InterruptedException {
        for (int i = 2; i <= n; i = i+2) {
            while (flag % 4 != 3);
            printNumber.accept(i);
            flag++;
        }
    }
}
