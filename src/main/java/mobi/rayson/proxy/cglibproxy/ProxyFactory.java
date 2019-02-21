package mobi.rayson.cglibproxy;

import java.lang.reflect.Method;
import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

/***
 *  Created with IntelliJ IDEA.
 *  User:  lirui
 *  Date:  2019-02-19
 *  Time: 10:11 AM
 *  Description:
 **/
public class ProxyFactory implements MethodInterceptor {

  private Object target;

  public ProxyFactory(Object target) {
    this.target = target;
  }

  public Object getProxyInstance() {
    Enhancer enhancer = new Enhancer();
    enhancer.setSuperclass(target.getClass());
    enhancer.setCallback(this);
    return enhancer.create();
  }

  @Override
  public Object intercept(Object obj, Method method, Object[] args, MethodProxy proxy)
      throws Throwable {

    method.invoke(target, args);

    return null;
  }
}
