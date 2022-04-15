/*
 * Activity 4.9.2
 */
public class Giraffe extends Hooved
{
  public Giraffe()
  {
    super("leaves, shrubs, herbs, and plants", false, 25.0);
  }
  public Giraffe(String food, boolean nocturnal, double aveLifeSpan)
  {
    super(food, nocturnal, aveLifeSpan);
  }
  public void hum()
  {
    System.out.println("The giraffe hums.");
  }
}