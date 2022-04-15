/*
 * Activity 4.9.2
 */
public class Tiger extends Feline
{
  public Tiger()
  {
    super("meat", true, 17.0);
  }
  public Tiger(String food, boolean nocturnal, double aveLifeSpan)
  {
    super(food, nocturnal, aveLifeSpan);
  }
  public void swim()
  {
    System.out.println("The Tiger swims happily.");
  }
  public void huntAlone()
  {
    System.out.println("The Tiger hunts alone, stalking its prey.");
  }
}