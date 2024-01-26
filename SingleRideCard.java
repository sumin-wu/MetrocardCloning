public class SingleRideCard extends ActivatedCard
{
   public SingleRideCard()
   {
   }
   
   protected SingleRideCard(int metrocardId, boolean active)
   {
      super(metrocardId, active);
   }
   
   public boolean swipeCard()
   {
      deactivate();
      return super.swipeCard();
   }
   
   public SingleRideCard clone()
   {
      return new SingleRideCard(getMetrocardId(), isActive());
   }
}