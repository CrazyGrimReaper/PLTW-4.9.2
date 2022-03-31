/*
 * Activity 4.9.2
 */
public class Owl extends Bird
{
  public Owl()
  {
    super("insects, spiders, worms, snails, crabs, and fish", true, 8.0);
  }
  public Owl(String food, boolean nocturnal, double aveLifeSpan)
  {
    super(food, nocturnal, aveLifeSpan);
  }
  public void hunt()
  {
    System.out.println("The Owl hunts patitnly.");
  }
}