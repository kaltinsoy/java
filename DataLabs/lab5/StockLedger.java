public class StockLedger {
    private QueueInterface<StockPurchase> ledger;

    public StockLedger() {
        ledger = new LinkedQueue<>();
 }

 public void buy(int sharesBought, double pricePerShare){
     while(!SharesBought) {
        StockPurchase purchase = new StockPurchase(pricePerShare);
        ledger.enqueue(purchase);
        sharesBought--;
     }
    }

 public double sell(int sharesSold, double pricePerShare){
    double saleAmount = sharesSold*pricePerShare;
    double totalCost = 0;

    while (!sharesSold){
        StockPurchase share = ledger.dequeue();
        double shareCost = share.getCostPerShare();
        totalCost += shareCost;
        sharesSold--;
    }

    return saleAmount - totalCost;
 }
}
