package hello.boot;

import org.springframework.context.annotation.ComponentScan;

@MySpringBootApplication
@ComponentScan(basePackages = "hello")
public class MySpringBootMain {
    public static void main(String[] args) {
        System.out.println("MySpringBootMain.main");
        MySpringApplication.run(MySpringBootMain.class, args);
    }
}
