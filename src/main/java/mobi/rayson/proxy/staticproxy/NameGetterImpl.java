package mobi.rayson.proxy.staticproxy;

/***
 *  Created with IntelliJ IDEA.
 *  User:  lirui
 *  Date:  2019-02-18
 *  Time: 10:26 AM
 *  Description:
 **/
public class NameGetterImpl implements NameGetter {

  @Override
  public void getName() {
    System.out.println("Lee");
  }

  @Override
  public void getNameById(String id) {
    System.out.println("Lee with id: " + id);
  }
}