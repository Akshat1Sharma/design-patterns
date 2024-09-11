package SingletonDesignPattern;

public final class SingletonSingleThreaded {
    private static SingletonSingleThreaded instance;

    public String value;

    private SingletonSingleThreaded(String value){

        //Slow Initialization
        try{
            Thread.sleep(1000);
        } catch(InterruptedException ex){
            ex.printStackTrace();
        }

        this.value = value;
    }


    public static SingletonSingleThreaded getInstance(String value){

        if(instance == null){

            instance = new SingletonSingleThreaded(value);
        }

        return instance;
    }
}
