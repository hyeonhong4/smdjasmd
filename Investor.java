public class Investor{
  public static void main(String[] args) {
    
    double totalMoney=1000;
    Stock apple= new Stock("APPLE",150.73);
    Stock naver = new Stock("NAVER",170.83);
    totalMoney= Stock.buy(totalMoney,apple,5);
    totalMoney = apple.sell(totalMoney,5);
    System.out.println("You have " + totalMoney +" left");
  }
               
}      