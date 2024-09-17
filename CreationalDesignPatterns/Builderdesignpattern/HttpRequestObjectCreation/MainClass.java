package Builderdesignpattern.HttpRequestObjectCreation;

public class MainClass {
public static void main(String[] args) {
    
    String request = new HttpRequestBuilder()
                    .setUrl("https://api.example.com/users")
                   .setMethod("POST")
                   .setHeaders("Auth","Token")
                   .setHeaders("content-type","json")
                   .setQueryParameter("name","akshat")
                   .setQueryParameter("age","30")
                   .build();

    System.out.println(request);


}

}
