package SingletonDesignPattern;

public class ClientCodeSingleThreaded {
    public static void main(String[] args) {

        SingletonSingleThreaded object1 = SingletonSingleThreaded.getInstance("object1");

        SingletonSingleThreaded object2 = SingletonSingleThreaded.getInstance("object2");


        System.out.println(object1.value);
        System.out.println(object2.value);



    }
}
