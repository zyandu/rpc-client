package me.zy;

/**
 * Hello world!
 *
 */
public class App {
    public static void main( String[] args ){
        RpcProxyClient rpcProxyClient = new RpcProxyClient();
        IHelloService helloService = rpcProxyClient.clientProxy(IHelloService.class,"localhost",8080);
        helloService.sayHello("haha");
    }
}
