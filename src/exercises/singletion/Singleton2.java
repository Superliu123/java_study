package exercises.singletion;

/**
 * @description: 懒汉式
 * @author: liu_chao[liu_chao2@suixingpay.com]
 * @data: 2019-10-17 11:27
 */
public class Singleton2 {

    private static Singleton2 instance = null;

    private Singleton2(){}

    public static Singleton2 getInstance(){
        if (instance == null) instance = new Singleton2();
        return instance;
    }

}
