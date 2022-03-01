package design;

import java.lang.reflect.Constructor;

/**
 * SingletonOne - Lazy Mode
 *
 * @author Roman Fu
 * @version 1.0
 */
public class SingletonOne {
    private static volatile SingletonOne singletonOne;

    private SingletonOne() {

    }

    // @NotThreadSafe
    @Deprecated
    public static SingletonOne getInstance() {
        if (singletonOne == null) {
            singletonOne = new SingletonOne();
        }
        return singletonOne;
    }

    // @ThreadSafe  Double Check + synchronized
    public static SingletonOne getInstance2() {
        if (singletonOne == null) {
            synchronized (SingletonOne.class) {
                if (singletonOne == null) {
                    singletonOne = new SingletonOne();
                }
            }
        }
        return singletonOne;
    }

    public static void main(String[] args) throws Exception {
        Constructor<SingletonOne> construct = SingletonOne.class.getDeclaredConstructor();
        construct.setAccessible(true);
        SingletonOne obj1 = construct.newInstance();
        SingletonOne obj2 = SingletonOne.getInstance2();
        System.out.println(obj1 == obj2); // false
    }
}
