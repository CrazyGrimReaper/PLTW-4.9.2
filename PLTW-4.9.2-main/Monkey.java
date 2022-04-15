/*
 * Activity 4.9.2
 */
public class Monkey extends Primate
{
  public Monkey()
  {
    super("fruits, nuts, meat, lizards, and bird eggs", false, 20.0);
  }
  public Monkey(String food, boolean nocturnal, double aveLifeSpan)
  {
    super(food, nocturnal, aveLifeSpan);
  }
  public void climb()
  {
    System.out.println("The monkey climbs.");
  }
  
  public void hoot()
  {
    System.out.println("The monkey hoots.");
  }
  
  public void howl()
  {
    System.out.println("The monkey howls.");
  }
}