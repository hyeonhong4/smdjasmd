public class Stock{
  String ticker;
  double price;
  
  public double sell(double l,int x){
      return l+this.price*x;}
  
  public static double buy(double l,Stock x,int i){
    return l-x.price*i;
  }
  
  public Stock(String ticker,double price){
    this.ticker=ticker;
    this.price=price;
  }}
    
   
             
