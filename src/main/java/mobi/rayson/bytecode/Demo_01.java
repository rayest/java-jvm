package mobi.rayson.bytecode;

/***
 *  Created with IntelliJ IDEA.
 *  User:  lirui
 *  Date:  2019-02-21
 *  Time: 10:49 AM
 *  Description:
 **/
public class Demo_01 {
  public int foo() {
    int x;
    try {
      x = 1;
      return x;
    } catch (Exception e) {
      x = 2;
      return x;
    } finally {
      x = 3;
    }
  }
}
