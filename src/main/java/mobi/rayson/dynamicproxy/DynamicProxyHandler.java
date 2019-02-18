package mobi.rayson.dynamicproxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import mobi.rayson.staticproxy.NameGetter;

/***
 *  Created with IntelliJ IDEA.
 *  User:  lirui
 *  Date:  2019-02-18
 *  Time: 11:00 AM
 *  Description:
 **/
public class DynamicProxyHandler implements InvocationHandler {

  private NameGetter nameGetter;

  public DynamicProxyHandler(NameGetter nameGetter) {
    this.nameGetter = nameGetter;
  }

  @Override
  public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
    return method.invoke(nameGetter, args);
  }
}
