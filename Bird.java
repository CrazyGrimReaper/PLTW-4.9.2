/*
 * Activity 4.9.2
 */
public class Bird extends Animal
{
  public Bird(String food, boolean nocturnal, double aveLifeSpan)
  {
    super(food, nocturnal, aveLifeSpan);
    System.out.println("A bird arrives!");
  }
  public void squawk()
  {
    System.out.println("The Bird squaks playfully.");
  }
}