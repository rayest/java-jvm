package mobi.rayson.staticproxy;

/***
 *  Created with IntelliJ IDEA.
 *  User:  lirui
 *  Date:  2019-02-18
 *  Time: 10:38 AM
 *  Description:
 **/
public class NameGetterApplication {
  private static void getName(NameGetter nameGetter) {
    nameGetter.getName();
    nameGetter.getNameById("1");
  }

  public static void main(String[] args) {
    getName(new NameGetterImpl());
    System.out.println("===========================");
    getName(new NameGetterProxy(new NameGetterImpl()));
  }
}
