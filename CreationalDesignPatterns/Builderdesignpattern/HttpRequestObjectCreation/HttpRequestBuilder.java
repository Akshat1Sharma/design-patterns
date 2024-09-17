package Builderdesignpattern.HttpRequestObjectCreation;

import java.util.HashMap;

public class HttpRequestBuilder {

    private String url;
    private HashMap<String, String> headers = new HashMap<>();
    private HashMap<String, String> queryParameter = new HashMap<>();
    private String method;
    private String body;


    public HttpRequestBuilder setUrl(String url) {
        this.url = url;
        return this;
    }

    public HttpRequestBuilder setHeaders(String key, String value) {
        this.headers.put(key, value);
        return this;
    }

    public HttpRequestBuilder setQueryParameter(String key, String value) {
        this.queryParameter.put(key, value);
        return this;
    }

    public HttpRequestBuilder setMethod(String method) {
        this.method = method;
        return this;
    }

    public HttpRequestBuilder setBody(String body) {
        this.body = body;
        return this;
    }

    public String build(){
        StringBuilder request = new StringBuilder();
        
        //Start with method and url
        request.append(method).append(" ").append(url);

       
        //Add query parameter
        if(!queryParameter.isEmpty()){
            request.append("?");
            queryParameter.forEach((key,value) -> request.append(key).append("=").append(value).append("&"));
            request.setLength(request.length() - 1); // Remove the trailing "&"
        }

        request.append(" HTTP/1.1\n");

         // Add headers (if any)
         headers.forEach((key, value) -> request.append(key).append(": ").append(value).append("\n"));

         // Add body (if applicable)
         if (body != null && !body.isEmpty()) {
             request.append("\n").append(body);
         }

        return request.toString();
    }


    


}
