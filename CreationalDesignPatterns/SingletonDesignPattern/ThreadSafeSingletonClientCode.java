package SingletonDesignPattern;

public class ThreadSafeSingletonClientCode {
    public static void main(String[] args) {
        Thread threadFoo = new Thread(new ThreadFoo());
        Thread threadBar = new Thread(new ThreadBar());
        threadFoo.start();
        threadBar.start();
    }

    static class ThreadFoo implements Runnable {
        @Override
        public void run() {
            ThreadSafeSingleton singleton = ThreadSafeSingleton.getInstance("First");
            System.out.println(singleton.value);
        }
    }

    static class ThreadBar implements Runnable {
        @Override
        public void run() {
            ThreadSafeSingleton singleton = ThreadSafeSingleton.getInstance("Second");
            System.out.println(singleton.value);
        }
    }
}
