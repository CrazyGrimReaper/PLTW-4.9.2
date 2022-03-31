/*
 * Activity 4.9.2
 */
public class ZooKeeperRunner
{
  public static void main(String[] args)
  { 
    Elephant elephant = new Elephant();
    elephant.trumpet();
    elephant.eat();
    elephant.getLifeSpan();
    elephant.isNocturnal();

    Tiger tiger = new Tiger();
    tiger.swim();
    tiger.huntAlone();
    tiger.roar();
    tiger.eat();

    Hippo hippo = new Hippo();
    hippo.eat();

    Giraffe giraffe = new Giraffe();
    giraffe.eat();

    Penguin penguin = new Penguin();
    penguin.fish();
    Owl owl = new Owl();
    owl.hunt();
    owl.eat();
    Owl owl2 = new Owl("mice, insects", true, 4.0);
    owl2.eat();
  }
}