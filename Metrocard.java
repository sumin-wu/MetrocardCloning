public class Metrocard
{
   private static int lastId = 0;
   
   private double balance;
   private int metrocardId;
   
   public Metrocard()
   {
      balance = 0;
      lastId++;
      metrocardId = lastId;
   }
   
   public Metrocard(double initialBalance)
   {
      this();
      balance = initialBalance;
   }
   
   /*
      This clone constructor is only to be used when cloning a Metrocard object.
      It takes in the id as a parameter so that a new id is not assigned.
      It is protected so that a client program cannot use it to create a Metrocard with an externally assigned ID.
   */
   protected Metrocard(double balance, int metrocardId)
   {
      this.balance = balance;
      this.metrocardId = metrocardId;
   }
   
   //Accessors
   public double getBalance()                   {return balance;}
   public int getMetrocardId()                  {return metrocardId;}
   
   //Class Member Methods
   public void fillCard(double howMuch)
   {
      balance += howMuch;
   }
   
   public boolean swipeCard(double fare)
   {
      if (balance < fare)
         return false;
   
      balance -= fare;
      return true;
   }
   
   public String toString()
   {
      return "Metrocard " + metrocardId + ": Balance: $" + balance;
   }
   
   public Metrocard clone()
   {
      return new Metrocard(balance, metrocardId);
   }
}
