import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext applicationContext =
                new AnnotationConfigApplicationContext(AppConfig.class);
        HelloWorld bean =
                (HelloWorld) applicationContext.getBean("helloworld");
        System.out.println(bean.getMessage());
        HelloWorld beanTwo = applicationContext.getBean(HelloWorld.class);
        System.out.println(beanTwo.getMessage());
        Cat cat = (Cat) applicationContext.getBean("cat");
        System.out.println(cat.getMessage());
        Cat catTwo = applicationContext.getBean(Cat.class);
        System.out.println(catTwo.getMessage());
        System.out.println(bean == beanTwo);
        System.out.println(cat == catTwo);
    }
}