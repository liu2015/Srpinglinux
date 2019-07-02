import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.time.Period;

public class TestSetter {

    public  static  void main(String[] args){


demo01();


    }


    public static void demo01(){

        String xmlpath="beans.xml";

        ApplicationContext applicationContext=new ClassPathXmlApplicationContext(xmlpath);

        person per= (person) applicationContext.getBean("personId");
        System.out.println(per);

    }
}
