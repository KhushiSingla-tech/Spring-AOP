package org.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(final String[] args) {

        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(AppConfig.class);
        Test1 test1 = applicationContext.getBean(Test1.class);
        test1.setName("Testing");
        test1.show();
        test1.display("HEY");
        Test2 test2 = applicationContext.getBean(Test2.class);
        test2.showTest2();
    }
}