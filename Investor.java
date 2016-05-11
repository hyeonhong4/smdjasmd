public class Investor{
  public static void main(String[] args) {
    
    int totalMoney=1000;
    Stock appleStock= new Stock("APPLE",150.73);
    double X = totalMoney - buy(5,appleStock);
    System.out.println("You have " + X +" left");
  }
               
  public static double buy(int x,Stock i){
    return i.price*x;
    
}
}        
                        