package me.zy;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Hello world!
 *
 */
public class App {
    public static void main( String[] args ){
       /* RpcProxyClient rpcProxyClient = new RpcProxyClient();
        IHelloService helloService = rpcProxyClient.clientProxy(IHelloService.class,"localhost",8080);
        helloService.sayHello("haha");*/

        ApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);
        RpcProxyClient rpcProxyClient1 = context.getBean(RpcProxyClient.class);
        IHelloService helloService = rpcProxyClient1.clientProxy(IHelloService.class,"localhost",8080);
        helloService.sayHello("by spring.");
    }
}
