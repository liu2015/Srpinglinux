package c_spring_aop;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpringAOP {

    public  static void main(String[] args){

        demo01();

    }

    public static void demo01(){

        String xpath="c_spring_aop/beans.xml";
        ApplicationContext applicationContext=new ClassPathXmlApplicationContext(xpath);

        UserService userService= (UserService) applicationContext.getBean("userServiceId3");
        userService.addUser();
        userService.updateUser();
        userService.deleteUser();


    }
}
