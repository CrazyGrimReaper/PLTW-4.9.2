/*
 * Activity 4.9.2
 */
public class Penguin extends Bird
{
  public Penguin()
  {
    super("fish", false, 6.0);
  }
  public Penguin(String food, boolean nocturnal, double aveLifeSpan)
  {
    super(food, nocturnal, aveLifeSpan);
  }
  public void fish()
  {
    System.out.println("The Penquin fishes excitedly.");
  }
}