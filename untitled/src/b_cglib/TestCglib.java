package b_cglib;

public class TestCglib {

public  static void main(String[] args){
demo01();

}
    public  static  void demo01(){


    UserServiceImpl userService=MyBeanFactory.createService();
    userService.addUser();
    userService.updateUser();
    userService.deleteUser();

    }

}
