package mobi.rayson.dynamicproxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;
import mobi.rayson.staticproxy.NameGetter;
import mobi.rayson.staticproxy.NameGetterImpl;

/***
 *  Created with IntelliJ IDEA.
 *  User:  lirui
 *  Date:  2019-02-18
 *  Time: 11:14 AM
 *  Description:
 **/
public class DynamicProxyApplication {
  public static void getName(NameGetter nameGetter) {
    nameGetter.getName();
    nameGetter.getNameById("1");
  }

  public static void main(String[] args) {
    NameGetterImpl nameGetterImpl = new NameGetterImpl();
    // 动态代理
    ClassLoader classLoader = NameGetter.class.getClassLoader();
    Class<?>[] interfaces = new Class[] {NameGetter.class};
    InvocationHandler handler = new DynamicProxyHandler(nameGetterImpl);
    NameGetter proxy = (NameGetter) Proxy.newProxyInstance(classLoader, interfaces, handler);
    getName(proxy);
  }
}
