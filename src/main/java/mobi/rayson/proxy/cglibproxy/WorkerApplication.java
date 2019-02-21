package mobi.rayson.proxy.cglibproxy;

/***
 *  Created with IntelliJ IDEA.
 *  User:  lirui
 *  Date:  2019-02-19
 *  Time: 10:15 AM
 *  Description:
 **/
public class WorkerApplication {
  public static void main(String[] args) {
    Worker worker = new Worker();
    Worker proxy = (Worker) new ProxyFactory(worker).getProxyInstance();
    proxy.doSomeWork("Quality Assessment");
  }
}
