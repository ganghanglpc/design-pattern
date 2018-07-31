package proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class DynamicHandler implements InvocationHandler{
    //要代理的目标对象
    private Object object;

    public DynamicHandler(Object object) {
        this.object = object;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        //业务逻辑

        //调用反射，实现要代理对象的方法的调用
        Object result = method.invoke(object,args);

        //业务逻辑
        return result;
    }
}
