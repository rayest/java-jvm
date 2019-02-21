package mobi.rayson.proxy.dynamicproxy;

/***
 *  Created with IntelliJ IDEA.
 *  User:  lirui
 *  Date:  2019-02-19
 *  Time: 10:24 AM
 *  Description:
 **/
public class RentImpl implements Rent {

  @Override
  public void rentRoom() {
    System.out.println("Rent one room");
  }

  @Override
  public void rentRoomFromSomeone(String landlord) {
    System.out.println("Rent one room from: " + landlord);
  }
}
