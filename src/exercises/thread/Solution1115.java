package exercises.thread;

/**
 * @description: 两个不同的线程将会共用一个 FooBar 实例。其中一个线程将会调用 foo() 方法，另一个线程将会调用 bar() 方法。
 *               请设计修改程序，以确保 "foobar" 被输出 n 次。
 *               来源：力扣（LeetCode） 链接：https://leetcode-cn.com/problems/print-foobar-alternately
 * @author: liu_chao[liu_chao2@suixingpay.com]
 * @data: 2019-10-12 18:23
 */
public class Solution1115 {

    private int n;

    private volatile boolean flag = false;

    public Solution1115(int n) {
        this.n = n;
    }

    public void foo(Runnable printFoo) throws InterruptedException {

        for (int i = 0; i < n; i++) {
            while (flag) {
                Thread.yield();
            }
            // printFoo.run() outputs "foo". Do not change or remove this line.
            printFoo.run();
            flag = true;
        }
    }

    public void bar(Runnable printBar) throws InterruptedException {

        for (int i = 0; i < n; i++) {
            while (!flag) {
                Thread.yield();
            }
            // printBar.run() outputs "bar". Do not change or remove this line.
            printBar.run();
            flag = false;
        }
    }
}
