/*
 * Activity 4.9.2
 */
public class Primate extends Animal
{
  public Primate(String food, boolean nocturnal, double aveLifeSpan)
  {
    super(food, nocturnal, aveLifeSpan);
    System.out.println("A primate arrives!");
  }
  public void forage()
  {
    System.out.println("The primate forages for food.");
  }
}