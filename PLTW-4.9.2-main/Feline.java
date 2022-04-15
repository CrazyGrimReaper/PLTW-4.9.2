/*
 * Activity 4.9.2
 */
public class Feline extends Animal
{
  public Feline(String food, boolean nocturnal, double aveLifeSpan)
  {
    super(food, nocturnal, aveLifeSpan);
    System.out.println("A feline arrives!");
  }
  public void roar()
  {
    System.out.println("The Feline roars hungrily.");
  }
}