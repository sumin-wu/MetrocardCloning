import java.util.ArrayList;
/*
   The Turnstyle class keeps track of all of Metrcards that have been swiped.
*/
public class Turnstyle
{
   //Fields
   private ArrayList<Metrocard> swipesLog;
   private double fare;
   
   //Constructors
   public Turnstyle(double f)
   {
      swipesLog = new ArrayList<Metrocard>();
      fare = f;
   }
   
   public void swipeCard(Metrocard card)
   {
     swipesLog.add(card.clone());
   }
   
   /*
      This method pulls all of the swipe data for a particular Metrocard based on its id.
      
      @param cardId The id of the card being reported.
      @return An ArrayList of Metrocard objects with the specified id.
   */
   
  public ArrayList<Metrocard> getCardReport(int cardId)
  {
      ArrayList<Metrocard> report = new ArrayList<>();
      for (int i = 0; i < swipesLog.size(); i++)
      {
          if (swipesLog.get(i).getMetrocardId() == cardId)
          {
              report.add(swipesLog.get(i));
          }
      }
      return report;
  }
}