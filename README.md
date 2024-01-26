This projects outlines a sophisticated approach to object cloning in a programming context, focusing on the importance of unique identifiers and protected access levels to manage object creation safely and effectively.

#Cloning Metrocards: The goal is to clone NYC Metrocards, recreating the NY transit system.

#The Trouble With Cloning Metrocards: New Metrocard objects receive a unique ID number upon creation. When cloning a Metrocard, the goal is to create a new one without giving it a unique ID number. The Protected Constructor A new constructor is created that accepts an ID number and assigns it to the instance variable, bypassing the static counter. This constructor is protected, meaning it's accessible within its hierarchy and package, but not by client methods.

#The ReducedFareCard Clone: This class, which extends Metrocard, includes a protected constructor that simply calls the superclass constructor. It's necessary for the clone method to function.

#The ActivatedCard Clone Constructor: The ActivatedCard class also features a protected constructor that calls the superclass constructor but sets the balance to 0, as ActivatedCards always have a 0 balance.

#The ActivatedCard Clone: The clone method utilizes this new constructor, focusing on the metrocardId while the constructor handles the 0 balance.

#The SingleRideCard Class: Similar to ActivatedCard, but its clone method also considers whether the card is active.

#The StudentCard Constructor: This constructor takes an ID and the number of uses left on the card. It calls the ActivatedCard's constructor, passing the metrocardId and activation status, and sets the allotment directly.

#The StudentCard Clone: Follows the cloning pattern, creating a new StudentCard with the metrocardId, its active status, and the allotment.
