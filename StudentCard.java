
public class StudentCard extends ActivatedCard
{
   private int allotment;
   
   public StudentCard()
   {
      allotment = 3;
   }
   
   protected StudentCard(int metrocardId, boolean active, int allotment)
   {
      super(metrocardId, active);
      this.allotment = allotment;
   }
   
   public int getAllotment()                 
   {
      return allotment;
   }
   
   public void fillCard()
   {
      super.fillCard();
      allotment = 3;
   }
   
   public boolean swipeCard()
   {
      allotment--;

      boolean success = super.swipeCard();

      if (allotment <= 0)
         deactivate();
         
      return success;
   }
   
   public String toString()
   {
      String str = super.toString();
      if (isActive())
         str += " with " + allotment + " use(s) left.";
         
      return str;
   }
   
   public StudentCard clone()
   {
      return new StudentCard(getMetrocardId(), isActive(), allotment);
   }
}