/*
 * Activity 4.9.2
 */
public class Gorilla extends Primate
{
  public Gorilla()
  {
    super("bamboo and fruits", false, 38.0);
    System.out.println("A gorilla arrives.");
  }
  public Gorilla(String food, boolean nocturnal, double aveLifeSpan)
  {
    super(food, nocturnal, aveLifeSpan);
  }

  public void grunt()
  {
    System.out.println("The gorilla grunts.");
  }
}