/*
 * Activity 4.9.2
 */
public class Hippo extends Hooved
{
  public Hippo()
  {
    super("plants, grass, herbs", false, 40.0);
  }
  public Hippo(String food, boolean nocturnal, double aveLifeSpan)
  {
    super(food, nocturnal, aveLifeSpan);
  }
  public void groan()
  {
    System.out.println("The hippo groans.");
  }
}