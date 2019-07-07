package b_cglib;

import org.springframework.cglib.proxy.Enhancer;
import org.springframework.cglib.proxy.MethodInterceptor;
import org.springframework.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

public class MyBeanFactory {

    public static UserServiceImpl createService(){

        final UserServiceImpl userService=new UserServiceImpl();
        final  MyAspect myAspect =new MyAspect();

        Enhancer enhancer =new Enhancer();

        enhancer.setSuperclass(userService.getClass());

        enhancer.setCallback(new MethodInterceptor() {
            @Override
            public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
                myAspect.before();
                Object obj=method.invoke(userService ,objects);
                methodProxy.invokeSuper(o,objects);
                myAspect.after();

                return obj;

            }
        });
       UserServiceImpl proxService= (UserServiceImpl) enhancer.create();
        return  proxService;
    }

}
