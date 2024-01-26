public class ReducedFareCard extends Metrocard
{
   public ReducedFareCard()
   {
   }
   
   public ReducedFareCard(double initialBalance)
   {
      super(initialBalance);
   }
   
   protected ReducedFareCard(double balance, int metrocardId)
   {
      super(balance, metrocardId);
   }
   
   //Class Member Variables
   public boolean swipeCard(double fare)
   {
      return super.swipeCard(fare / 2.0);
   }
   
   public ReducedFareCard clone()
   {
      return new ReducedFareCard(getBalance(), getMetrocardId());
   }
}
