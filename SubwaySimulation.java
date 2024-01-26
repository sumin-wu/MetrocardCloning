import java.util.ArrayList;
public class SubwaySimulation
{

   private final double FARE = 2.75;

   private ArrayList<Metrocard> allTheCards;


   private Turnstyle style;

   //Constructors
   public SubwaySimulation()
   {
      style = new Turnstyle(FARE);
      allTheCards = new ArrayList<Metrocard>();
      createABunchOfCards(1000);
      runSimulation();
      displayCard(125);
   }
   
   private void createABunchOfCards(int numCards)
   {
      for (int i = 0; i < numCards; i++)
         createACard(i);
   }

   private void createACard(int i)
   {
     double cardType = Math.random();
     if (cardType >.5)
     {
       allTheCards.add(new Metrocard());
       allTheCards.get(i).fillCard(20.0);
     }
     if (cardType <.5)
     {
       double otherType = Math.random();
       if (otherType >.5)
       {
        allTheCards.add(new ReducedFareCard());
        allTheCards.get(i).fillCard(20.0);
       }
       if (otherType <.5)
       {
        double lastType = Math.random();
        if (lastType > .5)
        {
          allTheCards.add(new SingleRideCard());
        }
        else
        {
          allTheCards.add(new StudentCard());
        }
       }
     }
     
   }
   
   private void runSimulation()
   {
     int x = 0;
     for (x=0; x< 1440; x++)
       {
         double chance = Math.random();
         if (chance < .05)
         {
           Metrocard additional = new Metrocard();
           allTheCards.add(additional); 
         }
         int swipes = (int)(Math.random() * 10);
         for (int swipe = 0; swipe <= swipes; swipe++)
           {
             int randomCardFromList = (int) (Math.random() * 1000);
             if (allTheCards.get(randomCardFromList).getBalance()==0)
             {
               allTheCards.get(randomCardFromList).fillCard(20.0);
             }
             else
               {
               allTheCards.get(randomCardFromList).swipeCard(FARE);
               }
           }
       }
   }
   
   private void displayCard(int cardId)
   {
      ArrayList<Metrocard> cardHistory = style.getCardReport(cardId);
      for (int i = 0; i < cardHistory.size(); i++)
         System.out.println(cardHistory.get(i));
   }

}