public class ActivatedCard extends Metrocard
{
   private boolean active;

   public ActivatedCard()
   {
      active = true;
   }
   
   protected ActivatedCard(int metrocardId, boolean active)
   {
      super(0, metrocardId);
      this.active = active;
   }
   
   //Accessors
   public boolean isActive()                    
   {
      return active;
   }
   
   //Class Member Methods
   public void fillCard()
   {
      active = true;
   }
   
   public void fillCard(int howMuch)
   {
      this.fillCard();
   }
   
   public void deactivate()
   {
      active = false;
   }
   
   public boolean swipeCard()
   {
      if(!active)
         return false;

      return true;
   }
   
   public boolean swipeCard(double fare)
   {
      return this.swipeCard();
   }
   
   public String toString()
   {
      String str = "Activated Metrocard " + getMetrocardId() + " ";
      if (active)
         return str + "is active.";
      
      return str + "is not active.";
   }
   
   public ActivatedCard clone()
   {
      return new ActivatedCard(getMetrocardId(), active);
   }
}
