package tdd;

public class TDDExample {

  public static boolean twoAsOne(int number1, int number2, int number3 ){

    if (number1 + number2 == number3 || number2 + number3 == number1 || number1 + number3 == number2){
      return true;
    }else{
      return false;
    }
  }
}