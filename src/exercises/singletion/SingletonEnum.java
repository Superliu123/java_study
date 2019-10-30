package exercises.singletion;

/**
 *枚举式
 */
public enum SingletonEnum {

    INSTANCE {

        @Override
        public void println(){
            System.out.println("陈翔六点半");
        }
    },INSTANCES{
        @Override
        public void println(){
            System.out.println("蘑菇头");
        }
    };

    protected abstract void println();

}
