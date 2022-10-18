import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext applicationContext =
                new AnnotationConfigApplicationContext(AppConfig.class);
        HelloWorld bean =
                (HelloWorld) applicationContext.getBean("helloworld");
        HelloWorld bean1 =
                (HelloWorld) applicationContext.getBean("hellowworld");

        Cat catBean = (Cat) applicationContext.getBean("mur");
        Cat catBean1 = (Cat) applicationContext.getBean("mur");

        System.out.println(bean == bean1);
        System.out.println(catBean == catBean1);
    }
}