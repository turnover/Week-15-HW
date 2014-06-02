public class OnlyThread implements Runnable
{
  private final String Name;
  
  public OnlyThread(String taskName)
  {
    Name = taskName;
  }
  
  public void run()
  {
    long sum = 0;
    Dice dice = new Dice();
    sum = dice.roll();
    System.out.println("The Dice "+Name+" landed on "+sum);
  }
}
