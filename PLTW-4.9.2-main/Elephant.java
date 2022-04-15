/*
 * Activity 4.9.2
 */
public class Elephant extends Animal
{
  public Elephant()
  {
    super("leaves, grasses, roots", false, 60.0);
  }
  public Elephant(String food, boolean nocturnal, double aveLifeSpan)
  {
    super(food, nocturnal, aveLifeSpan);
  }
  public void trumpet()
  {
    System.out.println("The elephant trumpets in delight.");
  }
  
}