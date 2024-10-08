package SingletonDesignPattern;

public final class ThreadSafeSingleton {
    private static ThreadSafeSingleton instance;

    public String value;

    private ThreadSafeSingleton(String value){
        this.value = value;
    }

    public static ThreadSafeSingleton getInstance(String value){

        ThreadSafeSingleton result = instance;

        if(result != null){
            return result;
        }

        synchronized(ThreadSafeSingleton.class){
            if(instance == null){
                instance = new ThreadSafeSingleton(value);
            }

            return instance;
        }
    }
}
