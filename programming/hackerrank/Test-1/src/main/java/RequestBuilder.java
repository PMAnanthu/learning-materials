public class RequestBuilder {
    private  Request request;

    RequestBuilder(){
        request=new Request();
    }

    public RequestBuilder withName(String name){
        request.setName(name);
        return this;
    }

    public RequestBuilder withData(String data){
        request.setData(data);
        return this;
    }

    public Request build(){
        return request;
    }
}
