package mobi.rayson.proxy.dynamicproxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/***
 *  Created with IntelliJ IDEA.
 *  User:  lirui
 *  Date:  2019-02-18
 *  Time: 11:00 AM
 *  Description:
 **/
public class RentHandler implements InvocationHandler {

  private Rent rent;

  public RentHandler(Rent rent) {
    this.rent = rent;
  }

  @Override
  public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
    return method.invoke(rent, args);
  }
}
