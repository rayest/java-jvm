package mobi.rayson.proxy.dynamicproxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

/***
 *  Created with IntelliJ IDEA.
 *  User:  lirui
 *  Date:  2019-02-18
 *  Time: 11:14 AM
 *  Description:
 **/
public class RentApplication {
  public static void rent(Rent rent) {
    rent.rentRoom();
    rent.rentRoomFromSomeone("lee");
  }

  public static void main(String[] args) {
    RentImpl rentImpl = new RentImpl();
    // 动态代理
    ClassLoader classLoader = Rent.class.getClassLoader();
    Class<?>[] interfaces = new Class[] {Rent.class};
    InvocationHandler handler = new RentHandler(rentImpl);
    Rent proxy = (Rent) Proxy.newProxyInstance(classLoader, interfaces, handler);
    rent(proxy);
  }
}
