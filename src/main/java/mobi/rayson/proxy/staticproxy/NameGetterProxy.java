package mobi.rayson.proxy.staticproxy;

/***
 *  Created with IntelliJ IDEA.
 *  User:  lirui
 *  Date:  2019-02-18
 *  Time: 10:28 AM
 *  Description:
 **/
public class NameGetterProxy implements NameGetter {

  private NameGetter nameGetter;

  NameGetterProxy(NameGetter nameGetter) {
    this.nameGetter = nameGetter;
  }

  @Override
  public void getName() {
    System.out.println("proxy: get name");
    nameGetter.getName();
  }

  @Override
  public void getNameById(String id) {
    System.out.println("proxy: get name by id");
    nameGetter.getNameById(id);
  }
}
