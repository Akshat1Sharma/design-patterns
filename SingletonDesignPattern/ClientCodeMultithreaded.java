package SingletonDesignPattern;

public class ClientCodeMultithreaded {
    public static void main(String[] args) {

        //If you see here singleton is not thread safe 
        Thread threadFoo = new Thread(new ThreadFoo());
        Thread threadBar = new Thread(new ThreadBar());
        threadFoo.start();
        threadBar.start();
    }

    static class ThreadFoo implements Runnable {
        @Override
        public void run() {
            SingletonMultithreaded singleton = SingletonMultithreaded.getInstance("FOO");
            System.out.println(singleton.value);
        }
    }

    static class ThreadBar implements Runnable {
        @Override
        public void run() {
            SingletonMultithreaded singleton = SingletonMultithreaded.getInstance("BAR");
            System.out.println(singleton.value);
        }
    }
}
